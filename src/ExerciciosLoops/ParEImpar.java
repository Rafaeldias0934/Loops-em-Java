package ExerciciosLoops;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        int qtdNumero, contador = 0, numero, countPar = 0, countImpar = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade de número");
        qtdNumero = scan.nextInt();

        do {
            System.out.println("Digite o número");
            numero = scan.nextInt();
            contador++;

            if (numero % 2 == 0) {
                countPar += 1;
            } else {
                countImpar += 1;
            }
        }while (contador < qtdNumero); {
            System.out.println("A quantidade de número Pares digitados foi: " + countPar);
            System.out.println("A quantidade de número Ímpares digitados foi: " + countImpar);

        }

//        while (contador < qtdNumero) {
//            System.out.println("Digite o número");
//            numero = scan.nextInt();
//            contador++;
//
//            if (numero % 2 == 0) {
//                countPar += 1;
//            } else {
//                countImpar += 1;
//            }
//        }
//        System.out.println("A quantidade de número Pares digitados foi: " + countPar);
//        System.out.println("A quantidade de número Ímpares digitados foi: " + countImpar);


    }
}
