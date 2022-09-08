public class Endereco {
    private int tipo, numero;
    private String logradouro, complemento, cep, cidade, estado, pais;

    public void imprimirEndereco() {
        System.out.printf("Endereço - Tipo: %s.\nLogradouro: %s. N°: %s. Complemento: %s. CEP: %s.\nCidade: %s. Estado: %s. Pais: %s. ",
                tipo, logradouro, numero, complemento, cep, cidade, estado, pais);
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTipo() {
        return tipo;
    }

    public int getNumero() {
        return numero;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getEstado() {
        return estado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getPais() {
        return pais;
    }
}
