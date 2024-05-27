package br.com.ramon;

import java.util.List;

public class Pessoa {

    private String sexo;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void qualSexo(String sexo) {
        setSexo(sexo);
    }

    public Pessoa(String sexo){
this.sexo = sexo;
    }

}