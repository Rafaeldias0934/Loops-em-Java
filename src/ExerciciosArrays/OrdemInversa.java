package ExerciciosArrays;

public class OrdemInversa {
    public static void main(String[] args) {
        int count = 0, i;
        int[] vetor = {-5, -6, 15, 50, 8 , 4};

        System.out.println("Vetor: ");
        while (count <= (vetor.length -1)) {
            System.out.printf("%d ",vetor[count]);
            count++;
        }
        System.out.println("\nVetor Inverso:");
        for (i = (vetor.length - 1); i >= 0; i--) {
            System.out.printf("%d ",vetor[i]);
        }


    }
}
