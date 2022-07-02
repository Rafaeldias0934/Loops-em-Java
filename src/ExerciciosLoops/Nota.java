package ExerciciosLoops;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        double nota;
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite uma nota");
        nota = scan.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota Inválida, please digite novamente");
            nota = scan.nextDouble();
        }
    }

}

