package com.fintech.main;
import java.util.ArrayList;
import java.util.List;

public class InstituicaoFinanceira {
    private int id;
    private String nome;
    private int idadeMinimaPermitida;
    private Double tetoDeTransferencia;
    private List<Conta> contas = new ArrayList<>();

    public void mostrarContas(){
        System.out.println("Lista de contas registradas em " + nome + "\n-----------------------");
        contas.forEach(System.out::println); // Utilizei lambda pois fazer o For seria muito trabalhoso...
    }

    public void cadastrarConta(Conta conta){
        contas.add(conta);
    }

    public void verificarIdade(int idade) {
        if(idade <= idadeMinimaPermitida) {
            System.out.println("Você não tem a idade mínima de "+ idadeMinimaPermitida +" para ter conta nesta instituição");
        } else {
            System.out.println("Você tem a idade permitida para fazer o cadastro nesta instituição.");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdadeMinimaPermitida() {
        return idadeMinimaPermitida;
    }

    public void setIdadeMinimaPermitida(int idadeMinimaPermitida) {
        this.idadeMinimaPermitida = idadeMinimaPermitida;
    }

    public Double getTetoDeTransferencia() {
        return tetoDeTransferencia;
    }

    public void setTetoDeTransferencia(Double tetoDeTransferencia) {
        this.tetoDeTransferencia = tetoDeTransferencia;
    }
}
