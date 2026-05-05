public class DescontoPremium implements PoliticaDesconto {
    public double calcularPreco(double precoBase) {
        return precoBase - 20;
    }
}