public class Contato {
    String descricao, telefone;
    int tipo;

    public void imprimirContato(){
        System.out.printf("Telefone: %s\n", telefone);
        System.out.printf("Tipo: %s. Descrição: %s.\n", tipo, descricao);
    }
}
