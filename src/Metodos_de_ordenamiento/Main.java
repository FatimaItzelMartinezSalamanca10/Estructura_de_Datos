package Metodos_de_ordenamiento;

public class Main {

    public static void main(String[] args) {
        // Inicialización del conjunto de datos de prueba
        int[] listaNumeros = {45, 12, 88, 3, 22, 67, 19};

        System.out.println("=== PRÁCTICA: ALGORITMO DE ORDENAMIENTO POR BURBUJA ===");
        System.out.println("Estado inicial del arreglo:");
        Burbuja.imprimirArreglo(listaNumeros);

        // Ejecución del método de ordenamiento
        Burbuja.ordenar(listaNumeros);

        System.out.println("\nEstado final del arreglo ordenado:");
        Burbuja.imprimirArreglo(listaNumeros);
    }
}