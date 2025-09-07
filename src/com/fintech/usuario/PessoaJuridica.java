package com.fintech.usuario;

import java.time.LocalDate;


public class PessoaJuridica extends Usuario {
    private String razaoSocial;

    public PessoaJuridica(int id, String nome, String cnpj, String razaoSocial, LocalDate dataFundacao,
                          String fotoDePerfilUrl, String senha) {
        super(id, nome, cnpj, dataFundacao, fotoDePerfilUrl, senha); // cnpj vai para documento
        this.razaoSocial = razaoSocial;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public void registrarUsuario() {
        System.out.println("Pessoa Jurídica registrada: " + getNome() + " | CNPJ: " + getDocumento() + " | Razão Social: " + razaoSocial);
    }
}
