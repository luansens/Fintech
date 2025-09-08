package com.fintech.cartoes;

import java.time.LocalDate;

public class CartaoDebito extends Cartao {
    private Double saldo;

    public CartaoDebito(Long id, String numero, TipoCartao tipoCartao,
                        LocalDate validade, Long idConta, Double limite, Double saldo) {
        super(id, numero, tipoCartao, validade, idConta, limite);
        this.saldo = saldo;
    }

    @Override
    public void pagar(Double valor) {
        if (valor == null) {
            System.out.println("Valor inválido.");
            return;
        }
        if (saldo == null) saldo = 0.0;
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Pagamento de R$" + valor + " realizado com sucesso (Débito).");
            System.out.println("Saldo restante: R$" + saldo);
        } else {
            System.out.println("Pagamento de R$" + valor + " não autorizado (Débito).");
            System.out.println("Saldo disponível: R$" + saldo);
        }
    }

    public Double getSaldo() { return saldo; }
    public void setSaldo(Double saldo) { this.saldo = saldo; }
}
