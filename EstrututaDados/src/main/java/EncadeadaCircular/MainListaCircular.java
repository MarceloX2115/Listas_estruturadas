package EncadeadaCircular;
import java.util.Scanner;

public class MainListaCircular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CRUD lista = new CRUD();
        int opcao;

        do {
            System.out.println("\n--- LISTA CIRCULAR ---");
            System.out.println("1 - Inserir");
            System.out.println("2 - Buscar");
            System.out.println("3 - Remover");
            System.out.println("4 - Listar");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Valor: ");
                    lista.inserir(sc.nextInt());
                }
                case 2 -> {
                    System.out.print("Valor: ");
                    System.out.println(lista.buscar(sc.nextInt()) ? "Encontrado!" : "Não encontrado.");
                }
                case 3 -> {
                    System.out.print("Valor: ");
                    lista.remover(sc.nextInt());
                }
                case 4 -> lista.listar();
            }
        } while (opcao != 0);
        sc.close();
    }
}
