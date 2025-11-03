package atividade01;
import java.util.Scanner;

public class conversorTemperatura {
    static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        System.out.println("=== Conversor de Temperaturas ===");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.print("Digite a opção: ");
        int opcao = sc.nextInt();

        double temperatura, resultado;

        if (opcao == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            temperatura = sc.nextDouble();
            resultado = (temperatura * 9 / 5) + 32;
            System.out.println("A temperatura em Fahrenheit é: " + resultado);
        }

        else if (opcao == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            temperatura = sc.nextDouble();
            resultado = (temperatura - 32) * 5 / 9;
            System.out.println("A temperatura em Celsius é: " + resultado);
        }

        else {
            System.out.println("Opção inválida!");
        }

        sc.close();
    }


}
