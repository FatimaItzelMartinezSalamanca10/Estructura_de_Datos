package Estructuras_lineales;

public class PilaDinamica {

    private Nodo cima;
   //Apuntador al nodo que esta en la cima de la pila
    public PilaDinamica() {
        cima = null;
    }

    //Metodo para insertar (apilar)un elemento en la cima
public void push(int x) {
    Nodo nuevo = new Nodo(x);
    nuevo.siguiente = cima; // Conserva el enlace con la cima anterior.
    cima = nuevo;
}
    //Metodo para eliminar (desapilar)un elemento de la cima
public void pop() {
    if (!isEmpty()) {
        System.out.println("Sacaste de la pila: " + cima.dato);
        cima = cima.siguiente;
    } else {
        System.out.println("Pila dinamica vacia: no hay elementos para sacar.");
    }
}
     //metodo para mostrar todos los elementos actuales de la pila
public void mostrar() {
    Nodo actual = cima;
    System.out.print("Pila dinamica (Cima -> Fondo): ");
    //Recorremos la pila nodo por nodo hasta llegar al final(null)
    while (actual != null) {
        System.out.print(actual.dato + " ");
        actual = actual.siguiente;
    }
    System.out.println();
}

public boolean isEmpty() {
    return cima == null;
}

     // Muestra el dato sin retirarlo de la pila.
public void peek() {
    if (isEmpty()) {
        System.out.println("Pila vacia: no hay un dato para consultar.");
    } else {
        System.out.println("Dato en la cima: " + cima.dato);
    }
}
}
