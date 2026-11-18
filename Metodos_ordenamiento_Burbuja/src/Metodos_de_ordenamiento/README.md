**Práctica: Implementación del Algoritmo de Ordenamiento por Burbuja**

**Descripción del Proyecto**

Este repositorio contiene la implementación en lenguaje Java del algoritmo de ordenamiento interno por Burbuja (Bubble Sort), desarrollado como parte de las actividades prácticas de la Unidad 5.

El programa está estructurado dentro del paquete Metodos_de_ordenamiento e incluye una optimización mediante bandera booleana de control (huboCambio / huboIntercambio) para detener las iteraciones de forma anticipada cuando el arreglo ya se encuentra ordenado, mejorando el rendimiento en el mejor caso.

**Estructura del Repositorio**


├── Metodos_de_ordenamiento/

│   ├── Burbuja.java         # Implementación del algoritmo de ordenamiento e impresión

│   └── Main.java            # Clase principal de prueba y validación en consola

│   └── README.md            # Documentación e instrucciones de uso

└─   Pdf                     # Reporte de la practica



**Instrucciones de Ejecución**
Ejecutar el programa

Ejecuta la clase principal indicando el nombre del paquete:

java Metodos_de_ordenamiento.Main


**Salida Esperada en Consola**

Al correr el programa correctamente, se mostrará el estado inicial del arreglo y el resultado ordenado de menor a mayor:


=== PRÁCTICA: ALGORITMO DE ORDENAMIENTO POR BURBUJA ===

Estado inicial del arreglo:

[45, 12, 88, 3, 22, 67, 19]


Estado final del arreglo ordenado:

[3, 12, 19, 22, 45, 67, 88]
