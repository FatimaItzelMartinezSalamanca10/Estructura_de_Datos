# Práctica de Programación en Java: Arquitectura Modular y Colas

Este repositorio contiene la implementación en Java de tres variantes de la estructura de datos tipo Cola (**Estática Lineal**, **Estática Circular** y **Dinámica** basada en nodos). La práctica se desarrolló bajo un enfoque estrictamente modular, probando el comportamiento de cada estructura mediante clases `Main` independientes.

---

## Estructura del Proyecto

El proyecto está organizado dentro del paquete `Colas` y se divide en las siguientes clases:

* `Nodo.java`: Clase base para la cola dinámica.
* `ColaEstatica.java`: Implementación de cola lineal basada en arreglos.
* `ColaEstaticaCircular.java`: Implementación de cola circular con manejo de módulo (%).
* `ColaDinamica.java`: Implementación de cola basada en nodos enlazados.
* `MainColaEstatica.java`: Prueba independiente de la cola estática.
* `MainColaCircular.java`: Prueba independiente de la cola circular.
* `MainColaDinamica.java`: Prueba independiente de la cola dinámica.

---

## Descripción de las Estructuras Implementadas

### 1. Cola Estática Lineal (`ColaEstatica`)
- **Descripción:** Implementada mediante un arreglo de tamaño fijo.
- **Funcionamiento:** Utiliza los apuntadores `frente` y `fin`. Controla el desbordamiento (*overflow*) informando si la cola está llena.
- **Operación destacada:** Incluye la consulta `peek()` para obtener el primer elemento sin extraerlo.

### 2. Cola Estática Circular (`ColaEstaticaCircular`)
- **Descripción:** Optimización de la cola estática que permite reutilizar el espacio liberado al desencolar elementos.
- **Funcionamiento:** Utiliza la operación de módulo (`% capacidad`) para desplazar los índices `frente` y `fin` de manera circular dentro del arreglo.
- **Operación destacada:** Mantiene el método `peek()` y reutiliza posiciones sin necesidad de desplazar elementos físicamente.

### 3. Cola Dinámica (`ColaDinamica`)
- **Descripción:** Estructura de tamaño variable construida a partir de nodos enlazados (`Nodo`).
- **Funcionamiento:** Administra punteros a `frente` y `fin`. No posee límite estricto de capacidad en memoria más allá del espacio disponible en la JVM.
- **Operaciones añadidas:**
  - `peek()`: Retorna el dato del nodo en el frente de la cola sin desvincularlo.
  - `contarElementos()`: Realiza un recorrido iterativo (`while`) a través de la lista enlazada para calcular el número total de nodos activos en la cola.

---

##Ejecución y Pruebas

Cada clase `Main` se ejecuta de forma independiente para validar las operaciones principales (`encolar`, `desencolar`, `peek`, `mostrar` y validación de colas vacías/llenas):

1. **Prueba Estática:** Ejecutar `MainColaEstatica.java`
2. **Prueba Circular:** Ejecutar `MainColaCircular.java`
3. **Prueba Dinámica:** Ejecutar `MainColaDinamica.java`
