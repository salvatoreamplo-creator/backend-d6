package es2;

import java.util.Scanner;

public class es2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Inserisci i km percorsi: ");
            double km = scanner.nextDouble();

            System.out.print("Inserisci i litri consumati: ");
            double litri = scanner.nextDouble();

            if (litri == 0) {
                throw new ArithmeticException("Divisione per zero");
            }

            double kmPerLitro = km / litri;
            System.out.println("Km/l percorsi: " + kmPerLitro);

        } catch (ArithmeticException e) {
            System.err.println("Errore: non è possibile dividere per zero!");
        } catch (Exception e) {
            System.err.println("Errore di input!");
        } finally {
            scanner.close();
        }
    }
}
