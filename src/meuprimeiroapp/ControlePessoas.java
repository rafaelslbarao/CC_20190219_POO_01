/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuprimeiroapp;

import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public final class ControlePessoas {

    

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
        return (endereco != null && endereco.length() > 10 ? true : false);
    }

    public static boolean isNomeValido(String nome) {
        return (nome != null && nome.length() > 5);
    }

    public static final Integer CODIGO_INICIAL = 1;
    
    public static Integer getProximoCodigo(ArrayList<Pessoa> pessoas) 
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

    static boolean isCodigoValido(Integer codigo) {
        return (codigo != null && codigo > 0);
    }

    static void salvaPessoa(String codigo,
             String nome,
             String endereco,
             String telefone,
             ArrayList<Pessoa> listaDePessoas) {
        Pessoa pessoa = new Pessoa();
        pessoa.setCodigo(codigo);
        pessoa.setNome(nome);
        pessoa.setEndereco(endereco);
        pessoa.setTelefone(telefone);
        listaDePessoas.add(pessoa);
    }
}
