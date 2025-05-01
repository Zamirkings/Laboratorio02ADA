import java.util.Scanner;

public class MaxSubsequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de valores: ");
        int n = scanner.nextInt();

        int[] valores = new int[n];

        System.out.println("Ingrese los " + n + " valores consecutivos:");
        for (int i = 0; i < n; i++) {
            valores[i] = scanner.nextInt();
        }

        int maxSuma = Integer.MIN_VALUE;
        int sumaActual = 0;
        int inicio = 0;
        int inicioTemp = 0;
        int fin = 0;

        for (int i = 0; i < n; i++) {
            sumaActual += valores[i];

            if (sumaActual > maxSuma) {
                maxSuma = sumaActual;
                inicio = inicioTemp;
                fin = i;
            }

            if (sumaActual < 0) {
                sumaActual = 0;
                inicioTemp = i + 1;
            }
        }

        if (maxSuma < 0) {
            maxSuma = 0;
            inicio = fin = 0;
        }

        System.out.println("La suma maxima es: " + maxSuma);
        System.out.println("Subsecuencia desde la posicion " + (inicio + 1) + " hasta la " + (fin + 1));

        System.out.print("Subsecuencia: ");
        for (int i = inicio; i <= fin; i++) {
            System.out.print(valores[i] + " ");
        }
    }
}
