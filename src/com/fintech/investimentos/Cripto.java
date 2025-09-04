package com.fintech.investimentos;

public class Cripto extends Investimento {

    public Cripto(int id,double valorAplicado, int prazoMeses) {
        super(id, valorAplicado, prazoMeses);
    }

    @Override
    public void aplicar(String nomeMoeda, double valor) {
        System.out.println("Criptomoeda "+ nomeMoeda +" adquirida no valor de: " + valor);
        this.nome = nomeMoeda;
        valorAplicado += valor;
    }

    @Override
    public void resgatar(double valor) {
        if(valor <= getValorAplicado()){
            System.out.println("Resgate no valor de: " + valor + " realizado com sucesso");
            valorAplicado -= valor;
        } else {
            System.out.println("Valor aplicado insuficiente para tal valor de resgate");
        }
    }

    @Override
    public void calcularRendimento() {
        valorAplicado = valorAplicado + (valorAplicado * (0.03 * getPrazoMeses()));
        System.out.println("O rendimento total é de: " + valorAplicado);
    }

    @Override
    public void informes() {
        super.informes();
        System.out.println("Tipo do investimento: Cripto");
    }
}
