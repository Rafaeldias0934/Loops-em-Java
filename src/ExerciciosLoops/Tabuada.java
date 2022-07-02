package ExerciciosLoops;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        int i,tabuada,numero;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número");
        numero = scan.nextInt();

        if (numero > 0 && numero <= 10) {
            System.out.println("Tabuada de " + numero + ":");

            for (i = 1; i <= 10; i++) {
                tabuada = numero * i;
                System.out.println(numero + " x " + i + " = " + tabuada);
            }
        } else {
            System.out.println("Digite um número entre 1 e 10.");
        }
    }
}
