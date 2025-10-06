# Gestión de Procesos 1

Este proyecto demuestra el uso de procesos en Java para la generación y posterior ordenación de números aleatorios utilizando dos programas independientes que se comunican a través de una tubería (pipe) en la línea de comandos.

## Ejecución del Proyecto

La imagen a continuación muestra cómo ejecutar ambos programas usando la terminal de Windows:

![Ejecución del proyecto](./ruta/a/la/captura.png) <!-- Reemplaza la ruta según donde guardes la imagen -->

```sh
C:\Users\pabli\IdeaProjects>java -jar ./aleatorios/target/aleatorios.jar | java -jar ./ordenarNumeros/target/ordenarNumeros.jar
4 12 13 18 23 25 26 28 30 32 37 41 43 46 47 47 49 54 57 59 67 69 70 72 76 76 77 79 80 81 87 87 88 90 92 93 97 98 99
C:\Users\pabli\IdeaProjects>
```

## Descripción

- **aleatorios.jar**: Genera una lista de números aleatorios y los muestra por la salida estándar.
- **ordenarNumeros.jar**: Recibe los números desde la entrada estándar, los ordena y los muestra por pantalla.

La ejecución conjunta permite observar cómo los números generados aleatoriamente son recibidos y ordenados en tiempo real por el segundo programa.

## Uso

1. Compila ambos proyectos y asegúrate de tener los archivos JAR en las rutas indicadas.
2. Ejecuta el comando mostrado en la terminal:
   ```sh
   java -jar ./aleatorios/target/aleatorios.jar | java -jar ./ordenarNumeros/target/ordenarNumeros.jar
   ```
3. El resultado será una lista de números ordenados, como se muestra en la imagen.

## Créditos

Proyecto realizado para la materia de Gestión de Procesos.

---