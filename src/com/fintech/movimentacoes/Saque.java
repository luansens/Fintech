package com.fintech.movimentacoes;

public class Saque extends Movimentacao {

    public Saque(int id, Double valor, int idConta, String descricao) {
        super(id, valor, TipoTransacao.SAQUE, idConta, descricao);
    }

    @Override
    public void extrato() {
        System.out.println("=== Extrato de Saque ===");
        super.extrato();
    }
}
