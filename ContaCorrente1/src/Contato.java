public class Contato {

   private int tipo;

   private String descricao, telefone;

    public void imprimirContato(){
        System.out.printf("Tipo: %s.\nDescrição: %S.\nTelefone: %s.\n", tipo, descricao, telefone);
    }

    public int getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}