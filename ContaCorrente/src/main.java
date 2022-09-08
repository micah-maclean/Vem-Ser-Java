public class main {
    public static void main(String[] args) {
        ContaCorrente contaCorrenteMicah = criarContaCorrenteMicah();
        ContaCorrente contaCorrenteJoao = criarContaCorrenteJoao();

        contaCorrenteMicah.imprimirContaCorrente();
        contaCorrenteJoao.imprimirContaCorrente();

        contaCorrenteJoao.transferir(contaCorrenteMicah, 2800);

        contaCorrenteMicah.imprimirContaCorrente();
        contaCorrenteJoao.imprimirContaCorrente();
    }

    public static ContaCorrente criarContaCorrenteMicah() {
        Endereco endereco1 = new Endereco();
        endereco1.tipo = 1;
        endereco1.logradouro = "Tv. São José";
        endereco1.numero = 455;
        endereco1.cep = "90240200";
        endereco1.complemento = "DBC Company";
        endereco1.cidade = "Porto Alegre";
        endereco1.estado = "RS";
        endereco1.pais = "Brasil";

        Endereco endereco2 = new Endereco();
        endereco2.tipo = 2;
        endereco2.logradouro = "Av. Andaraí";
        endereco2.numero = 531;
        endereco2.cep = "91350110";
        endereco2.complemento = "DBC Company";
        endereco2.cidade = "Porto Alegre";
        endereco2.estado = "RS";
        endereco2.pais = "Brasil";

        Contato contato1 = new Contato();
        contato1.descricao = "Telefone Pessoal";
        contato1.telefone = "51998453566";
        contato1.tipo = 1;

        Contato contato2 = new Contato();
        contato2.descricao = "Telefone Comercial";
        contato2.telefone = "5133307777";
        contato2.tipo = 2;

        Cliente clienteMicah = new Cliente();
        clienteMicah.cpf = "92319463070";
        clienteMicah.nome = "Micah";
        clienteMicah.enderecos[0] = endereco1;
        clienteMicah.enderecos[1] = endereco2;
        clienteMicah.contatos[0] = contato1;
        clienteMicah.contatos[1] = contato2;


        ContaCorrente contaCorrenteMicah = new ContaCorrente();
        contaCorrenteMicah.cliente = clienteMicah;
        contaCorrenteMicah.numeroConta = "1345";
        contaCorrenteMicah.agencia = 10;
        contaCorrenteMicah.chequeEspecial = 1500.0;
        contaCorrenteMicah.saldo = 0;

        contaCorrenteMicah.depositar(150);
        return contaCorrenteMicah;
    }

    public static ContaCorrente criarContaCorrenteJoao() {
        Endereco endereco1 = new Endereco();
        endereco1.tipo = 1;
        endereco1.logradouro = "Tv. São José";
        endereco1.numero = 455;
        endereco1.cep = "90240200";
        endereco1.complemento = "DBC Company";
        endereco1.cidade = "Porto Alegre";
        endereco1.estado = "RS";
        endereco1.pais = "Brasil";

        Endereco endereco2 = new Endereco();
        endereco2.tipo = 2;
        endereco2.logradouro = "Av. Andaraí";
        endereco2.numero = 531;
        endereco2.cep = "91350110";
        endereco2.complemento = "DBC Company";
        endereco2.cidade = "Porto Alegre";
        endereco2.estado = "RS";
        endereco2.pais = "Brasil";

        Contato contato1 = new Contato();
        contato1.descricao = "Telefone Pessoal";
        contato1.telefone = "51998453566";
        contato1.tipo = 1;

        Contato contato2 = new Contato();
        contato2.descricao = "Telefone Comercial";
        contato2.telefone = "5133307777";
        contato2.tipo = 2;

        Cliente clienteJoao = new Cliente();
        clienteJoao.cpf = "92319463070";
        clienteJoao.nome = "Joao";
        clienteJoao.enderecos[0] = endereco1;
        clienteJoao.enderecos[1] = endereco2;
        clienteJoao.contatos[0] = contato1;
        clienteJoao.contatos[1] = contato2;

        ContaCorrente contaCorrenteJoao = new ContaCorrente();
        contaCorrenteJoao.cliente = clienteJoao;
        contaCorrenteJoao.numeroConta = "1389";
        contaCorrenteJoao.agencia = 10;
        contaCorrenteJoao.chequeEspecial = 8000.0;
        contaCorrenteJoao.saldo = 0;

        contaCorrenteJoao.depositar(1800);
        return contaCorrenteJoao;
    }
}
