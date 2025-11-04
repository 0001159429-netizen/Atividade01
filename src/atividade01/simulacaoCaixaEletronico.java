package atividade01;
import java.util.Scanner;

public class simulacaoCaixaEletronico {
    public static void main(String[] args) {
        System.out.println("=== Simulação de Caixa Eletrônico ===");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor que deseja sacar: R$ ");
        int valor = sc.nextInt();

        // Notas disponíveis
        int nota100 = 0, nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0;

        // Cálculo das notas
        nota100 = valor / 100;
        valor %= 100;

        nota50 = valor / 50;
        valor %= 50;

        nota20 = valor / 20;
        valor %= 20;

        nota10 = valor / 10;
        valor %= 10;

        nota5 = valor / 5;
        valor %= 5;

        nota2 = valor / 2;
        valor %= 2;

        // Exibição do resultado
        System.out.println("\n=== Notas entregues ===");
        if (nota100 > 0) System.out.println(nota100 + " nota(s) de R$100");
        if (nota50 > 0) System.out.println(nota50 + " nota(s) de R$50");
        if (nota20 > 0) System.out.println(nota20 + " nota(s) de R$20");
        if (nota10 > 0) System.out.println(nota10 + " nota(s) de R$10");
        if (nota5 > 0) System.out.println(nota5 + " nota(s) de R$5");
        if (nota2 > 0) System.out.println(nota2 + " nota(s) de R$2");

        if (valor > 0) {
            System.out.println("\nValor restante não pode ser sacado (R$" + valor + ")");
        }

        sc.close();
    }
}
