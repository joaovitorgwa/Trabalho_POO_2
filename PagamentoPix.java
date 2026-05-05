package Trabalho_POO_2;

public class PagamentoPix implements MetodoPagamento {
    private String chavePix;

    public PagamentoPix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public boolean pagar(double valor) {
        System.out.println("Gerando QR Code para a chave: " + chavePix);
        System.out.println("Pagamento de R$ " + valor + " recebido via Pix instantâneo.");
        return true;
    }
}
