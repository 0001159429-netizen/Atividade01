package atividade01;
import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);
        System.out.println("=== Tabuada ===");

        System.out.println("Digite um numero para a tabuada: ");
        int numero = sc.nextInt();

        //Loop para gerar tabuada de 1  10

        for (int i = 1; i <= 10; i++){
            System.out.println( numero + " x " + i + " = " + (numero * i));
        }
    }
}
