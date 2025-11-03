package atividade01;
import java.util.Scanner;

public class classificacaoIdade {
    static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        System.out.println("=== Classificando Idade ===");

        System.out.println("=== Verificador de Faixa Etária ===");
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade < 12) {
            System.out.println("Você é uma criança.");
        }
        else if (idade >= 12 && idade <= 17) {
            System.out.println("Você é um adolescente.");
        }
        else if (idade >= 18 && idade <= 59) {
            System.out.println("Você é um adulto.");
        }
        else {
            System.out.println("Você é um idoso.");
        }

        sc.close();

    }
}
