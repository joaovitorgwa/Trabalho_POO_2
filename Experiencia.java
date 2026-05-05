import java.time.LocalDateTime;

public abstract class Experiencia {

    protected String titulo;
    protected LocalDateTime data;

    public Experiencia(String titulo, LocalDateTime data) {
        this.titulo = titulo;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDateTime getData() {
        return data;
    }

    // Polimorfismo
    public abstract String gerarResumo();
}