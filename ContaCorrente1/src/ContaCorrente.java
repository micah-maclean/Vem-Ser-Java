public class ContaCorrente extends Conta implements Impressao{
    private double chequeEspecial;


    public ContaCorrente(Cliente cliente, String numeroConta, String agencia, double saldo, double chequeEspecial) {
        super(cliente, numeroConta, agencia, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > (getSaldo() + chequeEspecial)) {
            System.err.println("Saldo e cheque especial insuficiente para realizar o saque.");
            return false;
        }

        setSaldo(getSaldo() - valor);
        return true;
    }

    @Override
    public void imprimir() {
        System.out.printf("Conta Corrente - Agência: %s. N° da Conta: %s. Saldo: %,.2f. Cheque Especial: %,.2f",
                getAgencia(), getNumeroConta(), getSaldo(), chequeEspecial);
    }

    public double retornarSaldoComChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
}
