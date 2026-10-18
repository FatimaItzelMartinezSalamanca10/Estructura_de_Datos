package Colas;


public class MainColaEstatica {
    public static void main(String[] args) {
        //INstanciamos la cola estática definiendo su capacidad maxima para la prueba
        ColaEstatica cola = new ColaEstatica(3);
        System.out.println("=== PRUEBA DE COLA ESTÁTICA ===");
        //Ingresamos los elementos secuencialmente dentro del limite establecido
        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);
        cola.encolar(40); // Intento extra para mostrar el control de desbordamiento

        //Imprimimos la estructura actual respetando el orden de los apuntadores
        cola.mostrar();
        System.out.println("Elemento al frente (peek): " + cola.peek());

        System.out.println("Desencolado: " + cola.desencolar());
        cola.mostrar();
        System.out.println("Nuevo frente (peek): " + cola.peek());
    }
}