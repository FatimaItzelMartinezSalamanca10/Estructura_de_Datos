package Metodos_de_ordenamiento;

// Versión de la consigna con inserciones separadas por intervalos.
public class ShellSort {

    public static void ordenar(int[] arr) {
        int n = arr.length;
        // La pasada con intervalo 1 recorre posiciones consecutivas.
        for (int intervalo = n / 2; intervalo > 0; intervalo /= 2) {
            for (int i = intervalo; i < n; i++) {
                int temp = arr[i];
                int j = i;

                // Verifica primero que exista una posición anterior dentro de la subsecuencia.
                while (j >= intervalo && arr[j - intervalo] > temp) {
                    arr[j] = arr[j - intervalo];
                    j -= intervalo;
                }
                // Inserta el valor guardado en el espacio que dejan los desplazamientos.
                arr[j] = temp;
            }
        }
    }

    public static void imprimirArreglo(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
