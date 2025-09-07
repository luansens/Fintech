package com.fintech.usuario;

import java.time.LocalDate;


public class PessoaFisica extends Usuario {
    private String rg;

    public PessoaFisica(int id, String nome, String cpf, String rg, LocalDate dataNascimento,
                        String fotoDePerfilUrl, String senha) {
        super(id, nome, cpf, dataNascimento, fotoDePerfilUrl, senha); // cpf vai para documento
        this.rg = rg;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public void registrarUsuario() {
        System.out.println("Pessoa Física registrada: " + getNome() + " | CPF: " + getDocumento() + " | RG: " + rg);
    }
}
