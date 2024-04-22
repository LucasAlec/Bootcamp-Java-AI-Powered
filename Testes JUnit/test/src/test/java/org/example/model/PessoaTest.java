package org.example.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class PessoaTest {
    @Test
    void TestGetFirstNameWithoutAFirstName() {
        Pessoa pessoa = new Pessoa();
        String firstName = pessoa.getFirstName();
        Assertions.assertNull(firstName);
    }

    @Test
    void Test2() {
        Pessoa pessoa = new Pessoa();
        Pessoa papai = pessoa.getPapai();
        Assertions.assertNull(papai);
    }

    @Test
    void Test3() {
        Pessoa pessoa = new Pessoa();
        pessoa.setFirstName("Lucas");
        String firstName = pessoa.getFirstName();
        Assertions.assertEquals(firstName, "Lucas");
    }

    @Test
    void TestGetpapaiWithoutApapai(){
        Pessoa pessoa = new Pessoa();
        Pessoa papai = pessoa.getPapai();
        Assertions.assertNull(papai);
    }

    @Test
    void TestThereIspapai(){
        Pessoa papai = new Pessoa();
        papai.setFirstName("Capitu");

        Pessoa pessoa = new Pessoa();
        pessoa.setPapai(papai);

        Assertions.assertNotNull(pessoa.getPapai());
        Assertions.assertEquals(pessoa.getPapai().getFirstName(), "Capitu");
    }

    @Test
    void Test11() {
        Pessoa lucas = new Pessoa();
        var cachorros = lucas.getCachorros();

        Assertions.assertEquals(0, cachorros.size());
        Assertions.assertFalse(lucas.hasCachorros());
    }

    @Test
    void Test12() {
        Pessoa lucas = new Pessoa();
        Cachorro mel = new Cachorro("Mel", Cachorro.Sexo.FEMEA);
        lucas.setCachorros(List.of(mel));
    }
}
