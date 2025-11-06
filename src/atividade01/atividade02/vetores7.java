package atividade01.atividade02;
import java.util.Scanner;

public class vetores7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[10];
        boolean encontrado = false;

        System.out.println("Digite o nome de 10 alunos:");

        // leitura dos nomes
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
        }

        System.out.print("\nDigite um nome para buscar: ");
        String busca = sc.nextLine();

        // busca no vetor
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(busca)) { // ignora maiúsculas/minúsculas
                encontrado = true;
                break;
            }
        }

        // resultado da busca
        if (encontrado) {
            System.out.println("\nO nome \"" + busca + "\" está na lista!");
        } else {
            System.out.println("\nO nome \"" + busca + "\" NÃO está na lista.");
        }

        sc.close();
    }
}
