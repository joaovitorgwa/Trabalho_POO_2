package Trabalho_POO_2;

public interface PoliticaDesconto {
    
    double calcularPreco(double precoBase);

    default boolean temAcessoPrioritario() {
        return false;
    }
}
