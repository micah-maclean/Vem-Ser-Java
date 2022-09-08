public class Cliente {
    String nome, cpf;
    Contato[] contatos = new Contato[2];
    Endereco[] enderecos = new Endereco[2];

    public void imprimirContatos() {
        for (Contato contato: contatos) {
            contato.imprimirContato();
        }
    }

    public void imprimirEnderecos() {
        for (Endereco endereco: enderecos) {
            endereco.imprimirEndereco();
        }
    }

    public void imprimirCliente() {
        System.out.printf("Nome Cliente: %s.\n CPF: %s.\n", nome, cpf);
        imprimirEnderecos();
        imprimirContatos();
    }
}