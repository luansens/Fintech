public class Conta {
    private int id;
    private TipoConta tipo;
    private double saldo;

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Método depositar chamado. Valor: " + valor);
    }

    public void sacar(double valor) {
        this.saldo -= valor;
        System.out.println("Método sacar chamado. Valor: " + valor);
    }

    public void exibirSaldo() {
        System.out.println("Método exibirSaldo chamado. Saldo: " + saldo);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipo(TipoConta tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public TipoConta getTipo() {
        return tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "id=" + id +
                ", tipo=" + tipo +
                ", saldo=" + saldo +
                '}';
    }
}
