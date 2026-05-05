package Trabalho_POO_2;

public class Pagamento {
    private String idTransacao;
    private double valor;
    private String metodoPagamento; 
    private String status;

    // Construtor
    public Pagamento(String idTransacao, double valor, String metodoPagamento) {
        this.idTransacao = idTransacao;
        this.valor = valor;
        this.metodoPagamento = metodoPagamento;
        this.status = "Pendente";
    }

    public void processarPagamento() {
        System.out.println("Iniciando processamento da transação: " + idTransacao);
        System.out.println("Valor: R$ " + valor + " | Método: " + metodoPagamento);
        
        this.status = status;
        
        System.out.println("Pagamento processado com sucesso! Novo status: " + status);
        System.out.println("---------------------------------------------------");
    }


    public String getIdTransacao() {
        return idTransacao;
    }

    public double getValor() {
        return valor;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public String getStatus() {
        return status;
    }
}
