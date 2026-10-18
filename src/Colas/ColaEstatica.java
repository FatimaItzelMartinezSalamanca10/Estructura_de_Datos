package Colas;

public class ColaEstatica {

    private int[] arreglo;
    private int frente;
    private int fin;
    private int capacidad;

        // Inicializamos la estructura estática configurando su tamaño y los apuntadores base
        public ColaEstatica(int tamano) {
            this.capacidad = tamano;
            this.arreglo = new int[this.capacidad];
            this.frente = 0;
            this.fin = -1;
        }

        public boolean estaVacia() {
            return frente > fin;
        }

        public boolean estaLlena() {
            return fin == capacidad - 1;
        }

        public void encolar(int valor) {
            if (estaLlena()) {
                System.out.println("Error: La cola estática está llena.");
            } else {
                fin++;
                arreglo[fin] = valor;
                System.out.println("Entró a la fila: " + valor);
            }
        }

        public int desencolar() {
            if (estaVacia()) {
                System.out.println("Error: La cola estática está vacía.");
                return -1;
            } else {
                int valor = arreglo[frente];
                frente++;
                return valor;
            }
        }

        public int peek() {
            if (estaVacia()) {
                System.out.println("Error: La cola estática está vacía.");
                return -1;
            }
            // Consultamos el elemento ubicado al frente sin alterar los apuntadores de la cola
            return arreglo[frente];
        }

        public void mostrar() {
            if (estaVacia()) {
                System.out.println("Cola estática vacía.");
                return;
            }
            System.out.print("Frente -> ");
            // Recorremos los elementos desde el frente hasta el fin para imprimirlos en consola
            for (int i = frente; i <= fin; i++) {
                System.out.print("[" + arreglo[i] + "] ");
            }
            System.out.println("<- Fin");
        }
    }