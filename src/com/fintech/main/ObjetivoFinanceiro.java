package com.fintech.main;
import java.time.LocalDate;

public class ObjetivoFinanceiro {
    private int id;
    private int idUsuario;
    private String nome;
    private Double valorMeta;
    private Double valorAtual;
    private LocalDate prazo;
    private StatusObjetivo statusObjetivo;


    public ObjetivoFinanceiro() {

    }

    public ObjetivoFinanceiro(int id, int idUsuario, String nome, Double valorMeta, Double valorAtual, LocalDate prazo, StatusObjetivo statusObjetivo) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.valorMeta = valorMeta;
        this.valorAtual = valorAtual;
        this.prazo = prazo;
        this.statusObjetivo = statusObjetivo;
    }

    @Override
    public String
    toString() {
        return "ObjetivoFinanceiro{" +
                "id=" + id +
                ", idUsuario=" + idUsuario +
                ", nome='" + nome + '\'' +
                ", valorMeta=" + valorMeta +
                ", valorAtual=" + valorAtual +
                ", prazo=" + prazo +
                ", statusObjetivo=" + statusObjetivo +
                '}';
    }

    public void definirValorMeta(Double valorMeta) {
        this.valorMeta = valorMeta;
    }

    public void verificarStatus() {
        if(this.valorMeta >= this.valorAtual) {
            this.statusObjetivo = StatusObjetivo.FINALIZADO;
        } else {
            this.statusObjetivo = StatusObjetivo.EM_PROGRESSO;
        }
    }

    public void registrarSaque(Double valorSaque) {
        this.valorAtual -= valorSaque;
        System.out.println("Saque registrado com sucesso!");
    }

    public void registrarDeposito(Double valorDeposito) {
        this.valorAtual += valorDeposito;
        System.out.println("Deposito registrado com sucesso!");
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    };

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public Double getValorMeta() {
        return valorMeta;
    }

    public Double getValorAtual() {
        return valorAtual;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

    public StatusObjetivo getStatusObjetivo() {
        return statusObjetivo;
    }
}
