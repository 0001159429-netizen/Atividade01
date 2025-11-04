package atividade01;
<<<<<<< HEAD

public class parOuImpar {
=======
import java.util.Scanner;

public class parOuImpar {
    static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);
        System.out.println("Digite um numero");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " é um número par.");
        } else {
            System.out.println(numero + " é um número ímpar.");
        }
        sc.close();
    }
>>>>>>> 03412e342c372cebae7d230fbaea280ee5b659c9
}
