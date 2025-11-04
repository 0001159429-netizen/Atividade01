package atividade01;
import java.util.Scanner;

public class conversorDolar {
    public static void main(String[] args) {
        System.out.println("=== Conversor de Dolar em Real e Vice-Versa ===");

        Scanner sc = new Scanner(System.in);

        final double TAXA_REAL_PARA_EURO = 0.18;  // 1 real = 0.18 euro
        final double TAXA_EURO_PARA_REAL = 5.55;  // 1 euro = 5.55 reais

        System.out.println("1 - Converter de Real para Euro");
        System.out.println("2 - Converter de Euro para Real");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.print("Digite o valor em Reais (R$): ");
            double real = sc.nextDouble();
            double euro = real * TAXA_REAL_PARA_EURO;
            System.out.printf("R$ %.2f equivalem a € %.2f\n", real, euro);

        }

        else if (opcao == 2) {
            System.out.print("Digite o valor em Euros (€): ");
            double euro = sc.nextDouble();
            double real = euro * TAXA_EURO_PARA_REAL;
            System.out.printf("€ %.2f equivalem a R$ %.2f\n", euro, real);

        }

        else {
            System.out.println("Opção inválida!");
        }

        sc.close();

    }
}
