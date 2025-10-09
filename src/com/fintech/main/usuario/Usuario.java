package com.fintech.main.usuario;

import java.time.LocalDate;


public class Usuario {
    private int id;
    private String nome;
    private String documento; // CPF ou CNPJ
    private LocalDate dataNascimento;
    private String fotoDePerfilUrl;
    private String senha;


    public Usuario(int id, String nome, String documento, LocalDate dataNascimento, String fotoDePerfilUrl, String senha) {
        this.id = id;
        this.nome = nome;
        this.documento = documento;
        this.dataNascimento = dataNascimento;
        this.fotoDePerfilUrl = fotoDePerfilUrl;
        this.senha = senha;
    }


    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getFotoDePerfilUrl() {
        return fotoDePerfilUrl;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setFotoDePerfilUrl(String fotoDePerfilUrl) {
        this.fotoDePerfilUrl = fotoDePerfilUrl;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void registrarUsuario() {
        System.out.println("Usuário registrado: " + nome + " | Documento: " + documento);
    }
}
