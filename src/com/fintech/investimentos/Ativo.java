package com.fintech.investimentos;

public class Ativo extends Investimento{
    public Ativo(int id, double valorAplicado, int prazoMeses) {
        super(id,valorAplicado, prazoMeses);
    }

    @Override
    public void aplicar(String nomeAtivo, double valor) {
        System.out.println("Ativo "+ nomeAtivo +" adquirido no valor de: " + valor);
        this.nome = nomeAtivo;
        this.valorAplicado += valorAplicado;
    }

    @Override
    public void resgatar(double valor) {
        if(valor <= getValorAplicado()){
            System.out.println("Resgate no valor de: " + valor + " realizado com sucesso");
            this.valorAplicado -= valor;
        } else {
            System.out.println("Valor aplicado insuficiente para tal valor de resgate");
        }
    }

    @Override
    public void calcularRendimento() {
        valorAplicado = valorAplicado + (valorAplicado * (0.02 * getPrazoMeses()));
        System.out.println("O rendimento total é de: " + valorAplicado);
    }
}
