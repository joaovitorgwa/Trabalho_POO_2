package Trabalho_POO_2;

public class Pagamento {
    private String idTransacao;
    private double valorBase;
    private PoliticaDesconto politicaDesconto;
    private MetodoPagamento metodoPagamento;
    private String status;

<<<<<<< Updated upstream
    
    public Pagamento(String idTransacao, double valor, String metodoPagamento) {
=======
    public Pagamento(String idTransacao, double valorBase, PoliticaDesconto politica, MetodoPagamento metodo) {
>>>>>>> Stashed changes
        this.idTransacao = idTransacao;
        this.valorBase = valorBase;
        this.politicaDesconto = politica;
        this.metodoPagamento = metodo;
        this.status = "Pendente";
    }

    public void processar() {
        // 1. Calcula o valor final com base na política de desconto
        double valorFinal = politicaDesconto.calcularPreco(valorBase);
        
        System.out.println("Iniciando Transação: " + idTransacao);
        
        // 2. Verifica se há benefícios extras (Acesso Prioritário)
        if (politicaDesconto.temAcessoPrioritario()) {
            System.out.println("[BENEFÍCIO] Acesso Prioritário Liberado!");
        }

        // 3. Executa o pagamento usando a estratégia injetada
        boolean sucesso = metodoPagamento.pagar(valorFinal);

        if (sucesso) {
            this.status = "Aprovado";
            System.out.println("Pagamento de R$ " + valorFinal + " finalizado com sucesso.");
        } else {
            this.status = "Falha";
            System.out.println("Erro ao processar o pagamento.");
        }
        System.out.println("---------------------------------------------------");
    }

    // Getters
    public String getStatus() { return status; }
    public double getValorBase() { return valorBase; }
}
