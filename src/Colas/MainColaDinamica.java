package Colas;

public class MainColaDinamica {

    public static void main(String[] args) {

        //Inicializamos la cola dinamica basada en nodos enlazados
        ColaDinamica cola = new ColaDinamica();
        System.out.println("=== PRUEBA DE COLA DINÁMICA ===");

        //Encolamos una serie de elementos en la estructura
        cola.encolar(5);
        cola.encolar(15);
        cola.encolar(25);
        cola.encolar(35);

        //Desplegamos el estado visual de la cola con sus nodos actuales
        cola.mostrar();

        //Consultamos el elemento al frente sin desvincularlo y contabilizamos los nodos
        System.out.println("Elemento al frente (peek): " + cola.peek());
        System.out.println("Total de elementos activos: " + cola.contarElementos());

        //Retiramos el primer nodo de la fila y mostramos la actualizacion
        System.out.println("Desencolado: " + cola.desencolar());
        cola.mostrar();

        System.out.println("Elemento al frente (peek): " + cola.peek());
        System.out.println("Total de elementos activos actualizado: " + cola.contarElementos());
    }
}