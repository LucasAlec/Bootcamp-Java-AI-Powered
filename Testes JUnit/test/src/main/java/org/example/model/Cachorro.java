package org.example.model;

public class Cachorro {
    public enum Sexo {
        MACHO,
        FEMEA
    }

    private String nome;
    private Sexo sexo;

    public Cachorro(String nome, Sexo sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return this.nome;
    }

    public Sexo getSexo() {
        return this.sexo;
    }
}
