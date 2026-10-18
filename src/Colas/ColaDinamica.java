package Colas;

public class ColaDinamica {

        private Nodo frente;
        private Nodo fin;

        public ColaDinamica() {
            this.frente = null;
            this.fin = null;
        }

        public boolean estaVacia() {
            return frente == null;
        }

        public void encolar(int x) {
            Nodo nuevo = new Nodo(x);
            if (estaVacia()) {
                frente = nuevo;
                fin = nuevo;
            } else {
                // Enlazamos el nuevo nodo al final de la fila y actualizamos el apuntador fin
                fin.siguiente = nuevo;
                fin = nuevo;
            }
            System.out.println("Entró a la cola dinámica: " + x);
        }

        public int desencolar() {
            if (estaVacia()) {
                System.out.println("La cola está vacía");
                return -1;
            }
            int valor = frente.dato;
            // Desplazamos el frente al siguiente nodo para liberar el elemento extraído
            frente = frente.siguiente;
            if (frente == null) {
                fin = null;
            }
            return valor;
        }

        public void mostrar() {
            if (estaVacia()) {
                System.out.println("Cola dinámica vacía");
                return;
            }
            Nodo actual = frente;
            System.out.print("Frente -> ");
            // Recorremos los nodos encadenados uno a uno hasta llegar al final de la cola
            while (actual != null) {
                System.out.print("[" + actual.dato + "] ");
                actual = actual.siguiente;
            }
            // Indicamos visualmente el término de la estructura impresa en la consola
            System.out.println("<- Fin");
        }

        public int peek() {
            if (estaVacia()) {
                System.out.println("La cola dinámica está vacía");
                return -1;
            }
            // Consultamos el valor del nodo al frente sin modificar ni desvincular la estructura
            return frente.dato;
        }

        public int contarElementos() {
            int contador = 0;
            Nodo actual = frente;
            // Iteramos por toda la estructura sumando cada nodo activo existente
            while (actual != null) {
                contador++;
                actual = actual.siguiente;
            }

            return contador;
        }
    }