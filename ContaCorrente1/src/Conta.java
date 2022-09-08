public abstract class Conta implements Movimentacao{
    private Cliente cliente;
    private String numeroConta, agencia;
    private double saldo;

    public Conta(Cliente cliente, String numeroConta, String agencia, double saldo) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.err.println("O valor de deposito não pode ser igual ou menor que zero.");
            return false;
        } else if (valor > saldo) {
            System.err.println("Saldo insuficiente para realizar o saque.");
            return false;
        }

        saldo -= valor;
        return true;
    }

    @Override
    public boolean depositar(double valor) {
        if (valor <= 0) {
            System.err.println("O valor de deposito não pode ser igual ou menor que zero.");
            return false;
        }

        saldo += valor;
        return true;
    }

    @Override
    public boolean transferir(Conta conta, double valor) {
        if (sacar(valor)) {
            conta.saldo += valor;
            saldo -= valor;
            return true;
        }

        System.err.println("Saldo insuficiente para realizar a transefência.");
        return false;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }
}