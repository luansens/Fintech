package com.fintech.main.cartoes;

import java.time.LocalDate;

public abstract class Cartao {
    private Long id;
    private String numero;
    private TipoCartao tipoCartao;
    private LocalDate validade;
    private Long idConta;
    private Double limite;

    public Cartao(Long id, String numero, TipoCartao tipoCartao,
                  LocalDate validade, Long idConta, Double limite) {
        this.id = id;
        this.numero = numero;
        this.tipoCartao = tipoCartao;
        this.validade = validade;
        this.idConta = idConta;
        this.limite = limite;
    }

    public String getNumeroMascarado() {
        if (numero == null || numero.length() < 4) {
            return "**";
        }
        String ultimos4 = numero.substring(numero.length() - 4);
        return "** ** ** " + ultimos4;
    }

    public void detalhes() {
        System.out.println("Dados do Cartão: " + id +
                "\n-----------------------------" +
                "\nNúmero: " + getNumeroMascarado() +
                "\nTipo: " + tipoCartao +
                "\nValidade: " + (validade != null ? validade : "N/A") +
                "\nId da Conta: " + idConta +
                "\nLimite: " + limite);
    }

    public abstract void pagar(Double valor);

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public TipoCartao getTipoCartao() { return tipoCartao; }
    public void setTipoCartao(TipoCartao tipoCartao) { this.tipoCartao = tipoCartao; }

    public LocalDate getValidade() { return validade; }
    public void setValidade(LocalDate validade) { this.validade = validade; }

    public Long getIdConta() { return idConta; }
    public void setIdConta(Long idConta) { this.idConta = idConta; }

    public Double getLimite() { return limite; }
    public void setLimite(Double limite) { this.limite = limite; }
}
