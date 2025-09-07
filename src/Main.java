import com.fintech.investimentos.Ativo;
import com.fintech.investimentos.Cripto;
import com.fintech.investimentos.Investimento;
import com.fintech.movimentacoes.Deposito;
import com.fintech.movimentacoes.Movimentacao;
import com.fintech.movimentacoes.Saque;
import com.fintech.movimentacoes.TipoTransacao;
import com.fintech.usuario.PessoaJuridica;
import com.fintech.usuario.PessoaFisica;
import com.fintech.usuario.Usuario;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Conta conta1 = new Conta();
        conta1.setId(1);
        conta1.setTipo(TipoConta.PF);
        conta1.depositar(700);

        Conta conta2 = new Conta();
        conta2.setId(2);
        conta2.setTipo(TipoConta.PJ);
        conta2.depositar(1500);

        InstituicaoFinanceira inst1 = new InstituicaoFinanceira();
        inst1.setId(1);
        inst1.setNome("Banco Brasileiro");
        inst1.setIdadeMinimaPermitida(15);
        inst1.setTetoDeTransferencia(50000.0);
        inst1.cadastrarConta(conta1);
        inst1.cadastrarConta(conta2);
        inst1.mostrarContas();

        System.out.println("-----------------");

        Movimentacao mov1 = new Saque(1,700.0, conta1.getId(), "Adiantamento salarial");
        Movimentacao mov2 = new Deposito(2,1700.0, conta1.getId(), "Poupança");

        mov1.extrato();
        mov2.extrato();

        ObjetivoFinanceiro objetivo1 = new ObjetivoFinanceiro(1, 1, "Aquisição moto", 30000.00, 30.00, LocalDate.of(2025,6,21), StatusObjetivo.EM_PROGRESSO);
        objetivo1.registrarDeposito(29970.00);
        objetivo1.verificarStatus();
        System.out.println(objetivo1.toString());

        System.out.println("---------------------------");

        Investimento invst1 = new Cripto(1,50.0, 6);
        invst1.aplicar("bitcoin",50.0);
        invst1.informes();
        invst1.calcularRendimento();

        System.out.println("---------------------------");

        Investimento invst2 = new Ativo(2, 150.0, 24);
        invst2.aplicar("tesouro direto 2025",150.0);
        invst2.resgatar(80.0);
        invst2.informes();
        invst2.calcularRendimento();


        PessoaFisica pf = new PessoaFisica(
                1,
                "Maria Eduarda",
                "123.456.789-00", // CPF
                "MG-12.345.678",  // RG
                LocalDate.of(2000, 5, 19),
                "https://foto-perfil.com/maria.jpg",
                "senha123"
        );


        PessoaJuridica pj = new PessoaJuridica(
                2,
                "Tech Solutions",
                "12.345.678/0001-99", // CNPJ
                "Tech Solutions LTDA",
                LocalDate.of(2010, 3, 15),
                "https://logo.com/tech.jpg",
                "senha456"
        );

        pf.registrarUsuario();
        pj.registrarUsuario();


        System.out.println("RG da Pessoa Física: " + pf.getRg());
        System.out.println("Razão Social da Pessoa Jurídica: " + pj.getRazaoSocial());

        pf.setRg("MG-99.888.777");
        pj.setRazaoSocial("Tech Solutions Ltda Atualizada");

        System.out.println("RG atualizado da Pessoa Física: " + pf.getRg());
        System.out.println("Razão Social atualizada da Pessoa Jurídica: " + pj.getRazaoSocial());





    }
}