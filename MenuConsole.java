import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MenuConsole {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Experiencia> experiencias = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n=== UrbanXP ===");
            System.out.println("1. Cadastrar Evento");
            System.out.println("2. Listar Eventos");
            System.out.println("3. Relatório Ordenado");
            System.out.println("4. Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarEvento();
                    break;
                case 2:
                    listarEventos();
                    break;
                case 3:
                    relatorio();
                    break;
            }

        } while (opcao != 4);
    }

    private static void cadastrarEvento() {
        System.out.println("\nTipo (1-Show, 2-Passeio, 3-Workshop): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Data (AAAA-MM-DDTHH:MM): ");
        LocalDateTime data = LocalDateTime.parse(scanner.nextLine());

        switch (tipo) {
            case 1:
                System.out.print("Artista: ");
                String artista = scanner.nextLine();
                experiencias.add(new Show(titulo, data, artista));
                break;

            case 2:
                System.out.print("Ponto de encontro: ");
                String ponto = scanner.nextLine();

                System.out.print("Guia: ");
                String guia = scanner.nextLine();

                experiencias.add(new Passeio(titulo, data, ponto, guia));
                break;

            case 3:
                System.out.print("Materiais: ");
                String materiais = scanner.nextLine();
                experiencias.add(new Workshop(titulo, data, materiais));
                break;
        }

        System.out.println("Evento cadastrado!");
    }

    private static void listarEventos() {
        for (Experiencia e : experiencias) {
            System.out.println(e.gerarResumo());
        }
    }

    private static void relatorio() {
        System.out.println("\nOrdenar por:");
        System.out.println("1. Data");
        System.out.println("2. Título");

        int op = scanner.nextInt();

        switch (op) {
            case 1:
                experiencias.sort((a, b) -> a.getData().compareTo(b.getData()));
                break;

            case 2:
                experiencias.sort((a, b) -> a.getTitulo().compareTo(b.getTitulo()));
                break;
        }

        listarEventos();
    }
}