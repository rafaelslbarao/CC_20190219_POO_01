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
class Pessoa {

    Integer codigo;
    String nome;
    String telefone;
    String endereco;

    public Pessoa() {

    }

    public Pessoa(Integer codigo) {
        this.codigo = codigo;
    }

    public Pessoa(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    Integer getCodigo() {
        return codigo;
    }

    void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    void setCodigo(String codigo) {
        this.codigo = Integer.valueOf(codigo);
    }

    String getNome() {
        return nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    String getTelefone() {
        return telefone;
    }

    void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    String getEndereco() {
        return endereco;
    }

    void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    boolean isTelefoneValido() {
        return ControlePessoas.isTelefoneValido(this.telefone);
    }

    boolean isEnderecoValido() {
        return ControlePessoas.isEnderecoValido(this.endereco);
    }

    boolean isNomeValido() {
        return ControlePessoas.isNomeValido(this.nome);
    }

    boolean isCodigoValido() {
        return ControlePessoas.isCodigoValido(this.codigo);
    } 

}
