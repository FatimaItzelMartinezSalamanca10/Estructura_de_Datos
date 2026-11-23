# Una práctica con QuickSort y ShellSort

**Fátima Itzel Martínez Salamanca**  
Estructura de Datos · Tarea 2 de la Unidad 5 · 22 de noviembre de 2026

El proyecto ordena el mismo arreglo mediante dos programas Java. Las dos ejecuciones muestran qué valores recibe cada método y cómo quedan al final. El desarrollo y la comparación están en el [reporte en Word](Reporte_QuickSort_ShellSort_Itzel.docx).

## Preparar y ejecutar el proyecto

Descomprime el ZIP y abre PowerShell en la carpeta que contiene este README. Usa un JDK con `java` y `javac` disponibles. El paquete se comprobó con Java 21.

```powershell
New-Item -ItemType Directory -Force out | Out-Null
javac -encoding UTF-8 -Xlint:all -d out src\Metodos_de_ordenamiento\*.java
java -cp out Metodos_de_ordenamiento.MainQuick
java -cp out Metodos_de_ordenamiento.MainShell
```

En Visual Studio Code abre la carpeta completa y usa **Extension Pack for Java**. En **Ejecutar y depurar**, elige **QuickSort** o **ShellSort** y pulsa **F5**. La salida aparece en la consola de depuración.

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

QuickSort y su programa de demostración se basan en el [código de la asignatura del maestro Víctor Hugo Vásquez Herrera](https://github.com/victorvasher/Estructura-de-datos-ITSX/tree/67e946e5c5968042ee57b19f42d0024b0e7e4f0d/M%C3%A9todos_de_ordenamiento). ShellSort sigue la base de la consigna de la Unidad 5. El [repositorio de referencia de la práctica](https://github.com/mahued73/estructura-de-datos/tree/main/quicksort-shellsort) se puede consultar o clonar con `git clone https://github.com/mahued73/estructura-de-datos.git`. La práctica está en `quicksort-shellsort`.
