package com.fintech.main.movimentacoes;

import java.time.LocalDate;

public abstract class Movimentacao {
    private int id;
    private Double valor;
    private TipoTransacao tipoTransacao;
    private int idConta;
    private LocalDate criadaEm;
    private String descricao;

    public Movimentacao(int id, Double valor, TipoTransacao tipoTransacao, int idConta, String descricao) {
        this.id = id;
        this.valor = valor;
        this.tipoTransacao = tipoTransacao;
        this.criadaEm = LocalDate.now();
        this.idConta = idConta;
        this.descricao = descricao;
    }

    public void extrato() {
        System.out.println("Extrato da Movimentação: " + id +
                "\n-----------------------------" +
                "\nValor da Movimentação: " + valor +
                "\nTipo da Movimentação: " + tipoTransacao +
                "\nId da conta: " + idConta +
                "\nFeita em: " + criadaEm +
                "\nDescrição da movimentação: " + descricao);
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Double getValor() { return valor; }
    public void setValor(Double valor) { this.valor = valor; }

    public TipoTransacao getTipoTransacao() { return tipoTransacao; }
    public void setTipoTransacao(TipoTransacao tipoTransacao) { this.tipoTransacao = tipoTransacao; }

    public int getIdConta() { return idConta; }
    public void setIdConta(int idConta) { this.idConta = idConta; }

    public LocalDate getCriadaEm() { return criadaEm; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}
