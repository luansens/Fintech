import java.time.LocalDate;

public class Cartao {
    private Long id;
    private String numeroMascarado;
    private TipoCartao tipoCartao;
    private LocalDate validade;
    private Long idConta;
    private Double limite;

    public Cartao(Long id, String numeroMascarado, TipoCartao tipoCartao,
                  LocalDate validade, Long idConta, Double limite) {
        this.id = id;
        this.numeroMascarado = numeroMascarado;
        this.tipoCartao = tipoCartao;
        this.validade = validade;
        this.idConta = idConta;
        this.limite = limite;
    }

    public void detalhes() {
        System.out.println("Dados do Cartão: " + id +
                "\n-----------------------------" +
                "\nNúmero: " + numeroMascarado +
                "\nTipo: " + tipoCartao +
                "\nValidade: " + validade +
                "\nId da Conta: " + idConta +
                "\nLimite: " + limite);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroMascarado() {
        return numeroMascarado;
    }

    public void setNumeroMascarado(String numeroMascarado) {
        this.numeroMascarado = numeroMascarado;
    }

    public TipoCartao getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(TipoCartao tipoCartao) {
        this.tipoCartao = tipoCartao;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public Long getIdConta() {
        return idConta;
    }

    public void setIdConta(Long idConta) {
        this.idConta = idConta;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }
}