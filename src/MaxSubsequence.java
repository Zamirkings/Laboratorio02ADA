public class MaxSubsequence {

    public static void main(String[] args) {
        int[] valores = {-2, 11, -4, 13, -5, 9, -3, 2, -8, 4};

        int maxSuma = Integer.MIN_VALUE;
        int sumaActual = 0;
        int inicio = 0;
        int inicioTemp = 0;
        int fin = 0;

        for (int i = 0; i < valores.length; i++) {
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

        // Mostrar resultados
        System.out.println("La sumatoria maxima es: " + maxSuma);
        System.out.println("Desde la posicion " + (inicio + 1) + " hasta la " + (fin + 1));

        System.out.print("Subsecuencia: ");
        for (int i = inicio; i <= fin; i++) {
            System.out.print(valores[i] + " ");
        }
    }
}
