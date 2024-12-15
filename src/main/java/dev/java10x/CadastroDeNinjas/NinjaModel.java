package dev.java10x.CadastroDeNinjas;

/*
    Em uma aplicação Spring, usa-se após o nome da classe
    o padrão que estamos trabalhando, no caso é um modelo
    de Ninja

    Para criar uma entidade no meu Banco de dados,
    eu preciso Criar uma ID, pois ela vai ser única
    e para localizar vai ser muito mais fácil
 */

import jakarta.persistence.Entity;

//Entity transforma uma classe em uma entidade do BD
@Entity
public class NinjaModel {

    Long id;
    String nome;
    String email;
    int idade;

    public NinjaModel() {
    }


    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
