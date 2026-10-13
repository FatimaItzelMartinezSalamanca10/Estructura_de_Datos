package Estructuras_lineales;

public class Lanzador_pilasimple {

    public static void main(String[] args) {
        PilaSimple p = new PilaSimple();

        System.out.println("Pila estatica");
        //Verifica si la pila esta vacía al inicio(deberia devolver true)
        System.out.println("Esta vacia: " + p.isEmpty());

        //2.Insertar elementos en la pila(operación push)
        p.push(10);
        p.push(20);
        p.push(30);
        //Muestra el estado actual de los elementos en la pila
        p.mostrar();

        //3.Consultar el elemento del tope(operación peek)
        p.peek(); // Consulta el 30 sin sacarlo.

        //4.Eliminar el elemento del tope(operacion pop)
        p.pop();

        //Muestra la pila nuevamente
        p.mostrar();

        //5.Demostracion de llenado y desbordamiento de la pila
        System.out.println("\n Llenar la pila");
        p.push(30);
        p.push(40);
        p.push(50);
        System.out.println("Esta llena: " + p.isFull());
        p.push(60); // El arreglo solo tiene cinco posiciones.
        p.mostrar();
        p.peek();


        System.out.println("\n Vaciar pila");
        while (!p.isEmpty()) {
            p.pop();
        }
        System.out.println("Esta vacia: " + p.isEmpty());
        p.peek();
        p.pop(); // Comprueba el control de pila vacia.
    }
}
