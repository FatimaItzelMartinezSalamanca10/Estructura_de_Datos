package Metodos_de_ordenamiento;
public class MainShell {
    public static void main(String[] args) {
        // Arreglo de ejemplo compartido con la demostración de QuickSort.
        int[] arr = {6, 1, 5, 8, 3, 2, 7, 4};
        System.out.println("Arreglo original:");
        ShellSort.imprimirArreglo(arr);
        // Ordena la entrada en el mismo arreglo antes de volver a imprimirlo.
        ShellSort.ordenar(arr);
        System.out.println("Arreglo ordenado con ShellSort:");
        ShellSort.imprimirArreglo(arr);
    }
}
