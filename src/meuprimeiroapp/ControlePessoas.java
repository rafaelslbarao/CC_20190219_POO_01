/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuprimeiroapp;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rafael
 */
public class ControlePessoas {

    private static final Integer CODIGO_INICIAL = 1;

    public static void excluiPessoa(int posicaoSelecionada
            , ArrayList<PessoaFisica> listaDePessoas
            , DefaultTableModel modeloDadosTabela) {
        
        modeloDadosTabela.removeRow(posicaoSelecionada);
        listaDePessoas.remove(posicaoSelecionada);
    }

    public static boolean isCPFValido(String text) {
       return !text.isBlank();
    }

    public static boolean isNomeFantasiaValido(String text) {
        return !text.isBlank();
    }

    public static boolean isRazaoSocialValido(String text) {
        return !text.isBlank();
    }

    public static boolean isCNPJValido(String text) {
        return !text.isBlank();
    }
    
    private ControlePessoas() {
    }

    public static boolean isTelefoneValido(String telefone) {
        if (telefone != null && telefone.length() > 8) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEnderecoValido(String endereco) {
        boolean resultado = (endereco != null && endereco.length() > 10 ? true : false);
        return resultado;
    }

    public static boolean isNomeValido(String nome) {
        return (nome != null && nome.length() > 5);
    }

    
    
    public static Integer getProximoCodigo(ArrayList<PessoaFisica> pessoas) 
    {
        if (pessoas != null && pessoas.size() > 0) 
        {
            Pessoa ultimaPessoa = pessoas.get(pessoas.size() - 1);
            return ultimaPessoa.getCodigo() + 1;
        } 
        else 
        {
            return CODIGO_INICIAL;
        }

    }

    public static boolean isCodigoValido(Integer codigo) {
        return (codigo != null && codigo > 0);
    }

    public static void salvaPessoa(String codigo,
             String nome,
             String endereco,
             String telefone,
             ArrayList<PessoaFisica> listaDePessoas, DefaultTableModel defaultTableModel) {
        PessoaFisica pessoa = new PessoaFisica(nome, codigo);
        pessoa.setEndereco(endereco);
        pessoa.setTelefone(telefone);
        listaDePessoas.add(pessoa);
        atualizarListaComNovaPessoa(pessoa, defaultTableModel);
    }
    
    public static void atualizaPessoa(String codigo,
             String nome,
             String endereco,
             String telefone,
             DefaultTableModel defaultTableModel, PessoaFisica pessoa, int posicalAtualizada) {
        pessoa.setCodigo(codigo);
        pessoa.setNome(nome);
        pessoa.setEndereco(endereco);
        pessoa.setTelefone(telefone);
        atualizarListaComPessoaExistente(pessoa, defaultTableModel, posicalAtualizada);
    }
    
    private static void atualizarListaComNovaPessoa(PessoaFisica pessoa, DefaultTableModel defaultTableModel)
    {
        defaultTableModel.addRow(new String[] 
        {
            pessoa.getCodigo().toString(),
            pessoa.getNome(),
            pessoa.getTelefone(),
            pessoa.getEndereco()
        });
    }
    
    private static void 
        atualizarListaComPessoaExistente(PessoaFisica pessoa
            , DefaultTableModel defaultTableModel
            , int posicalAtualizada)
    {
        defaultTableModel.setValueAt(pessoa.getNome(), posicalAtualizada, 1);
        defaultTableModel.setValueAt(pessoa.getTelefone(), posicalAtualizada, 2);
        defaultTableModel.setValueAt(pessoa.getEndereco(), posicalAtualizada, 3);
    }
}
