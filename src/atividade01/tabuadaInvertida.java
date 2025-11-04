package atividade01;
import java.util.Scanner;

public class tabuadaInvertida {
    public static void main(String[] args) {
        System.out.println("=== TABUADA INVERTIDA ===");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        int n = sc.nextInt();

        for (int i = 10; i >= 1; i--) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        sc.close();

    }
}
