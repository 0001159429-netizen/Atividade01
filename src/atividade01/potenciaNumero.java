package atividade01;
import java.util.Scanner;

public class potenciaNumero {
    public static void main(String[] args) {
        System.out.println("=== Calculando a Potencia ===");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a base da potencia: ");
        double base = sc.nextDouble();

        System.out.println("Digite o exponte da potencia: ");
        double expoente = sc.nextDouble();

        double resultado = 1;

        for (int i = 0; i < expoente; i++) {
            resultado = resultado * base;
        }

        System.out.println("A potencia desse numero é: ");
        System.out.println(base + " ^ " + expoente + " = " + resultado);

    }
}
