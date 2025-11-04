package atividade01;
import java.util.Scanner;

public class mediaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("===Calculando media de notas de um aluno===");

        System.out.println("Digite a primeira nota: ");
        int nota1 = sc.nextInt();

        System.out.println("Digite a segunda nota: ");
        int nota2 = sc.nextInt();

        System.out.println("Digite a terceira nota: ");
        int nota3 = sc.nextInt();

        double mediaNotas = ( nota1+nota2+nota3/ 3);

        System.out.println("A media das notas é: " + mediaNotas);

        sc.close();


    }

}
