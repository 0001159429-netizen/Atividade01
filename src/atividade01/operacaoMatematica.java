package atividade01;
import java.util.Scanner;

public class operacaoMatematica {
    public static void main(String[] args) {

        System.out.println("=== Operacoes Matematicas ===");

        Scanner sc = new  Scanner(System.in);

        System.out.println("Digite um numero: ");
        int a = sc.nextInt();

        System.out.println("Digite outro numero: ");
        int b = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite uma operacao: +, - , *, / ");
        String operacao = sc.nextLine();

        if(operacao.equals("+")){
            System.out.println("Soma: " + (a + b));
        }
        else if (operacao.equals("-")){
            System.out.println("Subtracao: " + (a - b));
        }

        else if(operacao.equals("*")) {
            System.out.println("Multiplicacao: " + (a * b));
        }

        else if(operacao.equals("/")) {
            if (b != 0) {
                System.out.println("Divisão: " + ((double) a / b));
            } else {
                System.out.println("Erro: divisão por zero!");
            }

        } else {
            System.out.println("Operação inválida!");
        }
        sc.close();
    }
}
