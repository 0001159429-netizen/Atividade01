package atividade01;
import java.util.Scanner;

public class tipoNumero {
    public static void main(String[] args) {
        System.out.println("=== Verificando se o numero é positivo negativo ou zero===");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        if (numero > 0){
            System.out.println("O numero é positivo");
        }

        else if ( numero < 0){
            System.out.println("O numero é negativo");
        }

        else {
            System.out.println("O numero é igual a zero");
        }

    }
}
