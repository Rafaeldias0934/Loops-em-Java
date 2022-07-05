package ExerciciosArrays;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        int qtdConsoantes = 0, count = 0;
        String[] consoantes = new String[6];

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if ( !(letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u"))) {
                consoantes[count] = letra;
                qtdConsoantes++;
            }
            count++;


        }while(count <= consoantes.length - 1);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes) {
            if (consoante != null) {
                System.out.printf("%s ",consoante + " ");
            }
        }
        System.out.println("\nQuantidade de Consoantes: " + qtdConsoantes);

    }
}
