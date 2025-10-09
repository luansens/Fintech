package com.fintech.main.cartoes;

import java.time.LocalDate;

public class CartaoCredito extends Cartao {
    private Double limiteCredito;

    public CartaoCredito(Long id, String numero, TipoCartao tipoCartao,
                         LocalDate validade, Long idConta, Double limite, Double limiteCredito) {
        super(id, numero, tipoCartao, validade, idConta, limite);
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void pagar(Double valor) {
        if (valor == null) {
            System.out.println("Valor inválido.");
            return;
        }
        if (limiteCredito == null) limiteCredito = 0.0;
        if (valor <= limiteCredito) {
            limiteCredito -= valor;
            System.out.println("Pagamento de R$" + valor + " autorizado (Crédito).");
            System.out.println("Limite restante: R$" + limiteCredito);
        } else {
            System.out.println("Pagamento de R$" + valor + " não autorizado (Crédito).");
            System.out.println("Limite disponível: R$" + limiteCredito);
        }
    }

    public Double getLimiteCredito() { return limiteCredito; }
    public void setLimiteCredito(Double limiteCredito) { this.limiteCredito = limiteCredito; }
}