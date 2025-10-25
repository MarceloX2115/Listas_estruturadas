package DuplaEncadeada;
import java.util.Scanner;

public class MainListaDupla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CRUD lista = new CRUD();
        int opcao;

        do {
            System.out.println("\n--- LISTA DUPLAMENTE ENCADEADA ---");
            System.out.println("1 - Inserir no início");
            System.out.println("2 - Inserir no fim");
            System.out.println("3 - Buscar");
            System.out.println("4 - Remover");
            System.out.println("5 - Listar");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Valor: ");
                    lista.inserirInicio(sc.nextInt());
                }
                case 2 -> {
                    System.out.print("Valor: ");
                    lista.inserirFim(sc.nextInt());
                }
                case 3 -> {
                    System.out.print("Valor: ");
                    System.out.println(lista.buscar(sc.nextInt()) ? "Encontrado!" : "Não encontrado.");
                }
                case 4 -> {
                    System.out.print("Valor: ");
                    lista.remover(sc.nextInt());
                }
                case 5 -> lista.listar();
            }
        } while (opcao != 0);
        sc.close();
    }
}
