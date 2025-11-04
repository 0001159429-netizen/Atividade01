package atividade01;

import java.util.Scanner;

public class bissextoAno {
    public static void main(String[] args) {
        System.out.println("=== Verificando se o ano é bissexto ===");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um ano: ");
        int ano = sc.nextInt();

        // Regras para ano bissexto:
        // 1. É divisível por 4
        // 2. Mas não pode ser divisível por 100
        // 3. Exceto se também for divisível por 400

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " é um ano bissexto!");
        }

        else {
            System.out.println(ano + " não é um ano bissexto.");
        }


    }
}


