package Trabalho_POO_2;

public interface MetodoPagamento {
    /**
     * @param valor O montante a ser cobrado.
     * @return true se o pagamento foi bem-sucedido, false caso contrário.
     */
    boolean pagar(double valor);
}
