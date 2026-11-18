package Metodos_de_ordenamiento;

public class Burbuja {

    /**
     * Ordena un arreglo de enteros de menor a mayor mediante pasadas sucesivas,
     * comparando elementos adyacentes y aplicando optimización por salida temprana.
     *
     * @param vector Arreglo de números enteros a ordenar.
     */
    public static void ordenar(int[] vector) {
        int n = vector.length;
        boolean huboCambio;

        // Bucle externo para controlar las pasadas sobre la lista
        for (int i = 0; i < n - 1; i++) {
            huboCambio = false;

            // Bucle interno para comparar elementos adyacentes
            for (int j = 0; j < n - i - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    // Intercambio de valores si se encuentran desordenados
                    int auxiliar = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = auxiliar;
                    huboCambio = true;
                }
            }

            // Optimización: si en una pasada completa no se realizaron intercambios,
            // significa que el arreglo ya se encuentra completamente ordenado.
            if (!huboCambio) {
                break;
            }
        }
    }

    /**
     * Muestra por consola los elementos del arreglo en formato de lista.
     *
     * @param datos Arreglo a imprimir.
     */
    public static void imprimirArreglo(int[] datos) {
        System.out.print("[");
        for (int i = 0; i < datos.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(datos[i]);
        }
        System.out.println("]");
    }
}
