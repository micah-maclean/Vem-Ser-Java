public class ContaPoupanca extends Conta implements Impressao{
    static final double JUROS_MENSAL = 1.01;

    public ContaPoupanca(Cliente cliente, String numeroConta, String agencia, double saldo) {
        super(cliente, numeroConta, agencia, saldo);
    }

    public void creditarTaxa() {
        setSaldo(getSaldo() * JUROS_MENSAL);
    }

    @Override
    public void imprimir() {
        System.out.printf("Conta Poupança - Agência: %s. N° da Conta: %s. Saldo: %,.2f. ",
                getAgencia(), getNumeroConta(), getSaldo());
    }
}
