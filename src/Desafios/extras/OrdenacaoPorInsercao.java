package Desafios.extras;

import java.util.Scanner;

public class OrdenacaoPorInsercao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de elementos no array:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Array antes da ordenação:");
        printArray(array);

        // Ordena o array usando o algoritmo de inserção
        insertionSort(array);

        System.out.println("Array após a ordenação:");
        printArray(array);
    }

    // Algoritmo de ornação por inserção
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int chave = array[i];
            int j = i - 1;

            // Move os elementos do arry que são maiores que a chave para uma posição à frente
            while (j >= 0 && array[j] > chave) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = chave;
        }
    }
    
    // Método auxiliar para imprimir o array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.println(num + " ");
        }
        System.out.println();
    }
}
