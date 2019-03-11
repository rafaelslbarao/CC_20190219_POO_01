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
class Pessoa {

    private Integer codigo;
    private String nome;
    private String telefone;
    private String endereco;

    public Pessoa() {

    }

    public Pessoa(Integer codigo) {
        this.codigo = codigo;
    }

    public Pessoa(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Pessoa(String codigo, String nome) {
        this.codigo = Integer.valueOf(codigo);
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = Integer.valueOf(codigo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isTelefoneValido() {
        return ControlePessoas.isTelefoneValido(this.telefone);
    }

    public boolean isEnderecoValido() {
        return ControlePessoas.isEnderecoValido(this.endereco);
    }

    public boolean isNomeValido() {
        return ControlePessoas.isNomeValido(this.nome);
    }

    public boolean isCodigoValido() {
        return ControlePessoas.isCodigoValido(this.codigo);
    }

}
