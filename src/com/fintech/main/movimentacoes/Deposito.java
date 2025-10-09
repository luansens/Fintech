package com.fintech.main.movimentacoes;

public class Deposito extends Movimentacao {

    public Deposito(int id, Double valor, int idConta, String descricao) {
        super(id, valor, TipoTransacao.DEPOSITO, idConta, descricao);
    }

    @Override
    public void extrato() {
        System.out.println("=== Extrato de Depósito ===");
        super.extrato();
    }
}
