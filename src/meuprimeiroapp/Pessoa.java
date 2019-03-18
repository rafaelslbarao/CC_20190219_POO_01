/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuprimeiroapp;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        // Verifica se o objeto de parâmetro não é nulo e se o mesmo é do tipo
        // pessoa. Para comparação de tipo, utiliza a palavra instanceof
        if(obj != null && obj instanceof Pessoa)
        {
            Pessoa parametro = (Pessoa) obj;
            if(this.codigo.equals(parametro.getCodigo()))
                return true;
            else
                return false;
        }
        else 
            // Chama método que faz parte da classe herdada (Object)
            // Todo acesso a métodos da classe "pai" utiliza a palavra super 
            return super.equals(obj);
    }  

}
