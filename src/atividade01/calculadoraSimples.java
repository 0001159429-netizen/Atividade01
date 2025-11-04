package atividade01;
import java.util.Scanner;

public class operacoesMatematicas {
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

<<<<<<< HEAD:src/atividade01/calculadoraSimples.java
        else if(operacao == "*") {
=======
        else if(operacao.equals("*")) {
>>>>>>> 03412e342c372cebae7d230fbaea280ee5b659c9:src/atividade01/operacaoMatematica.java
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
