public class ContaCorrente {
    Cliente cliente;
    int agencia;
    double saldo = 0, chequeEspecial = 0;
    String numeroConta;

    public void imprimirContaCorrente() {
        System.out.printf("Agencia: %s. N° da conta: %s. Saldo: %,.2f. Cheque especial: %,.2f\n", agencia, numeroConta, saldo, chequeEspecial);
    }

    public boolean sacar(double valor) {
        if (valor < 0) {
            System.out.println("Não é possível depositar valores menores ou iguais a zero");
            return false;
        }else if (valor > retornarSaldoComChequeEspecial()) {
            System.out.println();
            return false;
        }

        saldo -= valor;
        return true;
    }

    public boolean depositar(double valor) {
        if (valor < 0) {
            System.out.println("Não é possível depositar valores menores ou iguais a zero");
            return false;
        }

        saldo += valor;
        return true;
    }

    public double retornarSaldoComChequeEspecial(){
        return saldo + chequeEspecial;
    }

    public boolean transferir(ContaCorrente conta, double valor) {
        if (sacar(valor)) {
            conta.depositar(valor);
            return true;
        }

        return false;
    }
}
