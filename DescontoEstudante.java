package Trabalho_POO_2;

public class DescontoEstudante implements PoliticaDesconto {
    private double percentualDesconto;

    public DescontoEstudante(double percentualDesconto) {
        // Ex: 0.20 para 20% de desconto
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public double calcularPreco(double precoBase) {
        return precoBase - (precoBase * percentualDesconto);
    }
}
