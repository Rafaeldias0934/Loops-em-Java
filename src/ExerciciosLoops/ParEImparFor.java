package ExerciciosLoops;

import java.util.Scanner;

public class ParEImparFor {
    public static void main(String[] args) {
        int qtdNumero, contador, numero, countPar = 0, countImpar = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade de número");
        qtdNumero = scan.nextInt();

        for (contador = 0; contador < qtdNumero - 1; contador++) {
            System.out.println("Digite o número");
            numero = scan.nextInt();

            if (numero % 2 == 0) {
                countPar += 1;
            } else {
                countImpar += 1;
            }
        }
        System.out.println("A quantidade de número Pares digitados foi: " + countPar);
        System.out.println("A quantidade de número Ímpares digitados foi: " + countImpar);

    }
}
