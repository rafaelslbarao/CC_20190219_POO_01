/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuprimeiroapp;

/**
 *
 * @author Rafael
 */
public class PessoaFisica extends Pessoa {

    private String nome;
    private String dataNascimento;
    private String cpf;

    public PessoaFisica(String nome, Integer codigo) {
        super(codigo);
        this.nome = nome;
    }
    
        public PessoaFisica(String nome, String codigo) {
        super(Integer.valueOf(codigo));
        this.nome = nome;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isNomeValido() {
        return ControlePessoas.isNomeValido(this.nome);
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
