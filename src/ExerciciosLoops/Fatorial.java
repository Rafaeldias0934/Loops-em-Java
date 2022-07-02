package ExerciciosLoops;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        int fatorial,produto = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Fatorial: ");
        fatorial = scan.nextInt();

        for (int i = fatorial; i >= 1; i--) {
            produto *= i;
        }

        System.out.printf("%d != %d",fatorial,produto );

    }
}
