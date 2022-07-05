package ExerciciosArrays;

import java.util.Random;

public class NumeroAleatorios {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i <= (numerosAleatorios.length -1); i++ ) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Numeros Aletatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.printf("%d ",numero);
        }

        System.out.println("\nAntecessor dos Numeros Aletatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.printf("%d ",numero - 1);
        }

        System.out.println("\nSussessores dos Numeros Aletatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.printf("%d ",numero + 1);
        }
    }
}
