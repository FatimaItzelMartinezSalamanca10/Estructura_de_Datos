package Colas;

public class MainColaCircular {

    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE COLA ESTÁTICA CIRCULAR ===");
        ColaEstaticaCircular colaCircular = new ColaEstaticaCircular(3);

        colaCircular.encolar(100);
        colaCircular.encolar(200);
        colaCircular.encolar(300);
        colaCircular.mostrar();

        System.out.println("Elemento al frente (peek): " + colaCircular.peek());

        System.out.println("Desencolando: " + colaCircular.desencolar());
        colaCircular.encolar(400); // Demuestra la reutilización de espacio
        colaCircular.mostrar();

        System.out.println("Nuevo frente (peek): " + colaCircular.peek());
    }
}