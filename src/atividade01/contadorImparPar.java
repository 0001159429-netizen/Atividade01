package atividade01;
import java.util.Scanner;

public class contadorImparPar {
    public static void main(String[] args) {
        System.out.println("=== Contador de Numeros Impares e Pares ===");
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?:");
        int quantidade = sc.nextInt();

        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

        }

        sc.close();
    }
}
