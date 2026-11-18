## Mezcla Directa

## Estructura del proyecto

├── src/

│   └── MezclaDirectaPractica.java   # Clase principal con la lógica de intercalación

├── f1.txt                           # Archivo auxiliar de entrada 1

├── f2.txt                           # Archivo auxiliar de entrada 2

├── f3.txt                           # Archivo de salida generado automáticamente

└── README.md                        # Documentación del proyecto


**Cómo clonar y ejecutar el proyecto en IntelliJ IDEA**
 * Asegúrate de tener instalado Git, un JDK compatible (Java 8 o superior) e IntelliJ IDEA.
 * Abre tu terminal o Git Bash y clona el repositorio con el siguiente comando:
git clone [https://github.com/tu-usuario/tu-repositorio.git](https://github.com/tu-usuario/tu-repositorio.git)
cd tu-repositorio

 * Abre IntelliJ IDEA, selecciona File > Open y elige la carpeta del proyecto. Si el IDE no detecta el SDK de forma automática, ve a File > Project Structure > Project y selecciona tu versión de JDK instalada.
 * Configuración previa importante: Comprueba que los archivos f1.txt y f2.txt se encuentren en la carpeta raíz del proyecto (exactamente al mismo nivel que la carpeta src), colocando un número entero por renglón (por ejemplo, 45 en f1.txt y 12 en f2.txt). Si aún no existen, créalos manualmente antes de ejecutar, de lo contrario el programa lanzará una excepción de lectura (IOException).
 * Abre la clase MezclaDirectaPractica.java y haz clic en el botón de reproducción Run (o presiona Shift + F10).
 * Por último, abre el archivo f3.txt recién generado en el explorador lateral del IDE para verificar que los datos se hayan intercalado y ordenado correctamente.
***Compilación y ejecución desde la terminal (PowerShell / Bash)***
Si prefieres compilar y ejecutar el programa directamente desde la línea de comandos, sitúate en la carpeta raíz del proyecto y ejecuta lo siguiente:
New-Item -ItemType Directory -Force -Path out
javac -encoding UTF-8 -d out src/MezclaDirectaPractica.java
java -cp out MezclaDirectaPractica

**Salida esperada en consola**
Al ejecutar correctamente el programa con los archivos de entrada listos, la consola mostrará de inmediato el mensaje de éxito:

C:\Users\x\.jdks\ms-21.0.12.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2026.2.2\lib\idea_rt.jar=63363" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\x\OneDrive\Practicas Itzel\Estructura_de_datos_U5\out\production\MezclaDirectaU5" mezcladirecta.MezclaDirecta
Mezcla completada. Se generó f3.txt.

Process finished with exit code 0

Como resultado, el archivo f3.txt contendrá los valores de ambas entradas intercalados en orden ascendente (un número por renglón). 
resultado en f3.txt será:
1 1 2 2 3 3 4 5 5 6 8 9 9 10 11 
12 12 15 16 17 18 20 21 21 32 45 56 76 89 98
