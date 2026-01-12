package es1;

import java.util.Random;
import java.util.Scanner;

public class es1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] array = new int[5];


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }

        stampaArray(array);

        while (true) {
            try {
                System.out.print("Inserisci un valore (0 per uscire): ");
                int valore = scanner.nextInt();

                if (valore == 0) {
                    break;
                }

                System.out.print("Inserisci la posizione (0-4): ");
                int posizione = scanner.nextInt();

                array[posizione] = valore;
                stampaArray(array);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Errore: posizione non valida!");
            } catch (Exception e) {
                System.err.println("Errore di input!");
                scanner.nextLine(); // pulizia buffer
            }
        }

        scanner.close();
        System.out.println("Programma terminato.");
    }

    private static void stampaArray(int[] array) {
        System.out.print("Array: ");
        for (int n : array) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
