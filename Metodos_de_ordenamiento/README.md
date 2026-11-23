# práctica con QuickSort y ShellSort

**Fátima Itzel Martínez Salamanca**  
Estructura de Datos · Tarea 2 de la Unidad 5 · 22 de noviembre de 2026

El proyecto ordena el mismo arreglo mediante dos programas Java. Las dos ejecuciones muestran qué valores recibe cada método y cómo quedan al final. El desarrollo y la comparación están en el [reporte en pdf](Reporte_QuickSort_ShellSort).

## Preparar y ejecutar el proyecto

Abre github en la carpeta que contiene este README. Usa un JDK con `java` y `javac` disponibles. El paquete se comprobó con Java 21.


New-Item -ItemType Directory -Force out | Out-Null
javac -encoding UTF-8 -Xlint:all -d out src\Metodos_de_ordenamiento\*.java
java -cp out Metodos_de_ordenamiento.MainQuick
java -cp out Metodos_de_ordenamiento.MainShell
```

Abre la carpeta completa y usa ** Java**. En **Ejecutar y depurar**, elige **QuickSort** o **ShellSort** y pulsa **F5**.
La salida aparece en la consola de depuración.

## Comprobar la salida

La entrada es `[6, 1, 5, 8, 3, 2, 7, 4]`. En los dos programas, el último renglón debe ser `[1, 2, 3, 4, 5, 6, 7, 8]`. Puedes comparar con los registros de la comprobación del paquete.

- [Salida de MainQuick](evidencias/MainQuick.txt)
- [Salida de MainShell](evidencias/MainShell.txt)

## Dónde está cada parte

| Archivo | Qué contiene |
| --- | --- |
| [QuickSort.java](src/Metodos_de_ordenamiento/QuickSort.java) | Partición de Lomuto con el último valor del rango como pivote. |
| [ShellSort.java](src/Metodos_de_ordenamiento/ShellSort.java) | Inserciones con intervalos que se reducen a la mitad hasta llegar a uno. |
| [MainQuick.java](src/Metodos_de_ordenamiento/MainQuick.java) y [MainShell.java](src/Metodos_de_ordenamiento/MainShell.java) | Preparan la misma entrada y muestran el resultado de cada método. |

QuickSort y su programa de demostración se basan en el código de la asignatura del maestro Víctor Hugo Vásquez Herrera
