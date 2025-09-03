import com.fintech.movimentacoes.Deposito;
import com.fintech.movimentacoes.Movimentacao;
import com.fintech.movimentacoes.Saque;
import com.fintech.movimentacoes.TipoTransacao;

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

    }
}