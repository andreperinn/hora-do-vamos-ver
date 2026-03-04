package com.ap.milagre.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// ele fez o modelo do banco ele tem um ID e um nome
//Sempre a model é a primeira

@Entity
public class MilagreModels {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;


    private String nome;

    public MilagreModels() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
