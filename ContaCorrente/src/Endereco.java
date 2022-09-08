public class Endereco {
    int tipo, numero;
    String logradouro, complemento, cep, cidade, estado, pais;

    public void imprimirEndereco() {
        System.out.printf("Endereço: %s, número %s, complemento %s. \n Cidade: %s(CEP:%s) \n Estado: %S \n País: %s\n", logradouro, numero, complemento, cidade, cep, estado, pais);
    }
}
