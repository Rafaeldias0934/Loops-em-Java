package ExerciciosLoops;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        int numero,contador = 0, maior = 0, soma = 0;
        Scanner scan = new Scanner(System.in);

        do {

            System.out.println("Digite o número " + (contador + 1));
            numero = scan.nextInt();
            contador ++;
            if (numero > maior) {
                maior = numero;
            }
            soma += numero;
        }while(contador < 5);
        int media = (soma / contador);
        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("A soma do numeros é: " + soma);
        System.out.println("A média dos números digitados: " + media);

    }

}
