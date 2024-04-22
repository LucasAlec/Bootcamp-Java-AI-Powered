package org.example.model;

import java.util.Collections;
import java.util.List;

public class Pessoa {
    private String firstName;
    private Pessoa papai;
    private List<Cachorro> cachorros;

    public Pessoa() {
        this.cachorros = Collections.emptyList();
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Pessoa getPapai() {
        return this.papai;
    }

    public void setPapai(Pessoa papai) {
        this.papai = papai;
    }

    public List<Cachorro> getCachorros() {
        return this.cachorros;
    }

    public void setCachorros(List<Cachorro> cachorros) {
        this.cachorros = cachorros;
    }

    public boolean hasCachorros() {
        return !this.cachorros.isEmpty();
    }
}
