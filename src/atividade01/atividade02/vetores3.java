package atividade01.atividade02;
import java.util.Scanner;

public class vetores3 {
    public static void main(String[] args) {
        System.out.println("Media de notas em vetor");

        Scanner sc = new Scanner(System.in);

        double[] notas = new double[5];
        double somaNotas = 0.0;

        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite a " + (i+1) + " nota");
            notas[i] = sc.nextDouble();
            somaNotas += notas[i];
        }

        double media = somaNotas/ notas.length;

        System.out.println("A media das notas é: " + media);

        sc.close();

    }
}
