package br.com.ramon;

import org.junit.Assert;
import org.junit.Test;

public class TesteMulher {

    @Test
    public void apenasMulheres() {
        Pessoa pessoa = new Pessoa("Feminino");
        pessoa.qualSexo("Feminino");

        Assert.assertEquals("Feminino", pessoa.getSexo());
    }
}
