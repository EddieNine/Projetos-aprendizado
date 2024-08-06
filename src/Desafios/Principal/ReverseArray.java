package Desafios.Principal;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseArray {
    private Scanner scanner;
    private int[] array;
    private int tamanho;

    public ReverseArray(Scanner scanner) {
        this.scanner = scanner;
    }

   public void solicitarArray() {
       while(true) {
           try {
               System.out.println("\033[0;33mDigite o Tamanho do Array\033[m");
               this.tamanho = scanner.nextInt();
               if(tamanho < 0) {
                   throw new NegativeArraySizeException();
               }
               this.array = new int[tamanho];
               break;
           } catch (InputMismatchException e) {
               System.out.println("Erro: Entrada inválida. Por favor, insira um número inteiro.");
               scanner.next(); // Limpa a entrada inválida do scanner
           } catch (NegativeArraySizeException e) {
               System.out.println("Erro: O tamanho do array não pode ser negativo. Digite novamente:");
           }
       }
   }

   public void arrayOriginal() {
       while (true) {
           try {
               System.out.println("Digite os elementos do array:");
               for (int i = 0; i < tamanho; i++) {
                   System.out.println("Elemento " + (i + 1) + ": ");
                   array[i] = scanner.nextInt();
               }
               break;
           } catch (InputMismatchException e) {
               System.out.println("Erro: Entrada inválida. Por favor, insira números inteiros.");
               scanner.next(); // Limpa a entrada inválida do scanner
           }
       }

       System.out.println("Array original: " + Arrays.toString(array));
   }

   public void arrayInvertido() {
       for(int i = 0; i < array.length / 2; i++) {
           int temp = array[i];
           array[i] = array[array.length - 1 - i];
           array[array.length - 1 - i] = temp;
       }

       System.out.println("Array invertido: " + Arrays.toString(array));
   }
}
