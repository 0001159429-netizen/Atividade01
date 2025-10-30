package atividade01;
import java.util.Scanner;

public class somaSimples {
    public static void main(String[] args) {
        System.out.println("=== Soma Simples ===");

        Scanner sc = new  Scanner(System.in);

        System.out.println("Digite um numero: ");
        int a = sc.nextInt();

        System.out.println("Digite outro numero: ");
        int b = sc.nextInt();

        System.out.println("Soma: " + (a + b));

    }
}
