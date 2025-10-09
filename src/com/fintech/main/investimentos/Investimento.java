package com.fintech.main.investimentos;

public class Investimento {
    private int id;
    protected String nome;
    protected double valorAplicado;
    private int prazoMeses;

    public Investimento(int id, double valorAplicado, int prazoMeses) {
        this.id = id;
        this.valorAplicado = valorAplicado;
        this.prazoMeses = prazoMeses;
    }

    public void aplicar(String nomeInvestimento, double valor) {
        this.nome = nomeInvestimento;
        this.valorAplicado = valor;
        System.out.println("Investimento efetuado, valor de: " + valor + " aplicado em: " + nomeInvestimento);
    }

    public void informes() {
        System.out.println("Informes atuais do investimento: " + id + " " + nome +
                "\nValor aplicado: " + valorAplicado +
                "\nMeses aplicados: " + prazoMeses);
    }

    public void resgatar(double valor) {
        System.out.println("Método resgatar chamado. Valor: " + valor);
    }

    public void calcularRendimento() {
        System.out.println("Método calcularRendimento chamado.");
    }


    public double getValorAplicado() {
        return valorAplicado;
    }

    public int getPrazoMeses() {
        return prazoMeses;
    }
}