package atividade01;
import java.util.Scanner;

public class fatorialNumero {
    public static void main(String[] args) {
        System.out.println("=== Calculando fatorial de um numero ===");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double numero = sc.nextDouble();

        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i; // multiplica fatorial pelo contador
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        sc.close();
    }
}
