Estructura de Datos - Unidad 3
## Práctica: Pilas Estáticas y Dinámicas en Java
##  Descripción del Proyecto
Este repositorio contiene la implementación en **Java** de dos tipos de estructuras de datos lineales tipo **Pila (LIFO - *Last In, First Out*)**:
1. **Pila Estática (`PilaSimple.java`)**: Implementada mediante un arreglo de tamaño fijo.
2. **Pila Dinámica (`PilaDinamica.java`)**: Implementada mediante nodos enlazados dinámicamente mediante referencias.
Ambas estructuras integran sus métodos principales de manipulación (`push`, `pop`, `mostrar`) junto con sus métodos auxiliares de consulta y validación (`isEmpty`, `isFull`, `peek`).

## Diferencias Conceptuales: Almacenamiento Estático vs. Dinámico

| Característica            | Pila Estática (`PilaSimple`)                                                                                        | Pila Dinámica (`PilaDinamica`) l
| **Estructura en Memoria** | Contigua en memoria (un arreglo de tamaño predefinido).                                                             | Dispersa en memoria RAM mediante referencias entre nodos. |
| **Capacidad**             | **Limitada**. Se define un tamaño máximo estático al instanciar. Se genera desbordamiento (*Overflow*) si se llena. | **Dinámica**. Su capacidad crece o decrece bajo demanda y solo se limita por la memoria RAM disponible. |
| **Uso de Memoria**        | Reservado en su totalidad desde el inicio, pudiendo desperdiciar espacio si no se aprovecha todo el arreglo.        | Eficiente y flexible. Asigna o libera espacio exacto según se insertan o eliminan nodos. |
| **Control de Límite**     | Requiere el método `isFull()` para verificar si el arreglo alcanzó su tope (`tope == datos.length - 1`).            | **No requiere `isFull()`**, ya que la memoria se gestiona de forma dinámica. |

**Ejecutar el programa:**
   * En el panel izquierdo del explorador de proyectos, busca la clase principal que contiene el método de prueba ( `Main.java`) o ( `Lanzador_pilasimple´) .
   * Haz clic en el **botón verde de reproducción (Run)** o presiona `Shift + F10`.
   * Alternativamente, haz clic derecho sobre la clase principal y selecciona Run
## Salida por Consola

### 1. Pruebas de Pila Estática (`PilaSimple`)
```text
Pila estatica
Esta vacia: true
Metiste: 10
Metiste: 20
Metiste: 30
Pila actual: 10 20 30
Dato en el tope: 30
Sacaste: 30
Pila actual: 10 20

Llenar la pila
Metiste: 30
Metiste: 40
Metiste: 50
Esta llena: true
¡Pila llena!
Pila actual: 10 20 30 40 50
Dato en el tope: 50

Vaciar pila
Sacaste: 50
Sacaste: 40
Sacaste: 30
Sacaste: 20
Sacaste: 10
Esta vacia: true
Pila vacia: no hay un dato para consultar.
¡Pila vacia!


1.Prueba de Pila Dinamica
(PilaDinamica ) 
text
Pila dinámica 
Esta vacia: true
Pila dinamica (Cima -> Fondo): 30 20 10
Dato en la cima: 30
Sacaste de la pila: 30
Pila dinamica (Cima -> Fondo): 20 10

Agregar mas Nodos
Pila dinamica (Cima -> Fondo): 60 50 40 30 20 10
Dato en la cima: 60

Vaciar pila
Sacaste de la pila: 60
Sacaste de la pila: 50
Sacaste de la pila: 40
Sacaste de la pila: 30
Sacaste de la pila: 20
Sacaste de la pila: 10
Esta vacia: true
Pila vacia: no hay un dato para consultar.
Pila dinamica vacia: no hay elementos para sacar.
process finished with exit code 0
