package Colas;

public class ColaEstaticaCircular {

        private int[] arreglo;
        private int frente;
        private int fin;
        private int capacidad;
        private int tamano;

        // Inicializamos la estructura definiendo el tamaño del arreglo y los apuntadores
        public ColaEstaticaCircular(int capacidad) {
            this.capacidad = capacidad;
            this.arreglo = new int[capacidad];
            this.frente = 0;
            this.fin = -1;
            this.tamano = 0;
        }

        public boolean estaVacia() {
            return tamano == 0;
        }

        public boolean estaLlena() {
            return tamano == capacidad;
        }

        public void encolar(int x) {
            if (estaLlena()) {
                System.out.println("La cola circular está llena. No se puede encolar " + x);
                return;
            }
            // Calculamos la posición del nuevo elemento reutilizando el espacio con el operador módulo
            fin = (fin + 1) % capacidad;
            arreglo[fin] = x;
            tamano++;
            System.out.println("Entró a la cola circular: " + x);
        }

        public int desencolar() {
            if (estaVacia()) {
                System.out.println("La cola circular está vacía.");
                return -1;
            }
            int valor = arreglo[frente];
            // Desplazamos el frente de forma circular al extraer el elemento de la fila
            frente = (frente + 1) % capacidad;
            tamano--;
            return valor;
        }

        public int peek() {
            if (estaVacia()) {
                System.out.println("La cola circular está vacía.");
                return -1;
            }
            // Consultamos el elemento ubicado al frente sin modificar el estado de los apuntadores
            return arreglo[frente];
        }

        public void mostrar() {
            if (estaVacia()) {
                System.out.println("La cola circular vacía.");
                return;
            }
            System.out.print("Frente -> ");
            // Recorremos los elementos activos imprimiendo su correspondiente índice en la estructura
            for (int i = 0; i < tamano; i++) {
                int indice = (frente + i) % capacidad;
                System.out.print("[" + arreglo[indice] + "] ");
            }
            // Marcamos la salida gráfica indicando la parte posterior de la cola circular
            System.out.println("<- Fin");
        }
    }