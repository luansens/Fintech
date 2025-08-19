public class Investimento {
    private String tipo;
    private double valorAplicado;
    private int prazoMeses;

    public Investimento(String tipo, double valorAplicado, int prazoMeses) {
        this.tipo = tipo;
        this.valorAplicado = valorAplicado;
        this.prazoMeses = prazoMeses;
    }

    public void aplicar(double valor) {
        System.out.println("Método aplicar chamado. Valor: " + valor);
    }

    public void resgatar(double valor) {
        System.out.println("Método resgatar chamado. Valor: " + valor);
    }

    public void calcularRendimento() {
        System.out.println("Método calcularRendimento chamado.");
    }

    public String getTipo() {
        return tipo;
    }

    public double getValorAplicado() {
        return valorAplicado;
    }

    public int getPrazoMeses() {
        return prazoMeses;
    }
}