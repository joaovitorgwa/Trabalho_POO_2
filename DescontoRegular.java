package Trabalho_POO_2;

public class DescontoRegular implements PoliticaDesconto {
    @Override
    public double calcularPreco(double precoBase) {
        return precoBase; // Paga o valor integral
    }
}