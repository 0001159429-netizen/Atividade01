package atividade01;
import java.util.Scanner;

public class numeroPrimo {
    public static void main(String[] args) {
        System.out.println("=== Verificando se o Numero é Primo ===");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        boolean primo = true;

        // Números menores ou iguais a 1 não são primos
        if (numero <= 1) {
            primo = false;
        } else {
            // Verifica se o número tem algum divisor além de 1 e ele mesmo
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println(numero + " é um número primo!");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        sc.close();


    }


}
