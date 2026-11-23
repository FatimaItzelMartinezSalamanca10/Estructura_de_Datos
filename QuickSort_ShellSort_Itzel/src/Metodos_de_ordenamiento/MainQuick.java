package Metodos_de_ordenamiento;

public class MainQuick {
    public static void main(String[] args) {

        // Misma entrada que MainShell para comparar las dos salidas.
        int[] arreglo = {6, 1, 5, 8, 3, 2, 7, 4};

        System.out.println("Arreglo original:");
        QuickSort.imprimirArreglo(arreglo);

        // El límite superior es inclusivo, por eso se usa length - 1.
        QuickSort.ordenar(arreglo, 0, arreglo.length - 1);

        System.out.println("Arreglo ordenado con Quicksort:");
        QuickSort.imprimirArreglo(arreglo);
    }
}
