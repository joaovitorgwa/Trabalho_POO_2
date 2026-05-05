public class Cliente {

    private String nome;
    private PoliticaDesconto politica;

    public Cliente(String nome, PoliticaDesconto politica) {
        this.nome = nome;
        this.politica = politica;
    }

    public String getNome() {
        return nome;
    }

    public PoliticaDesconto getPolitica() {
        return politica;
    }
}