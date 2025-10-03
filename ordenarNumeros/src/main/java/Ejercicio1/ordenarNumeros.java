package Ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Clase ordenarNumeros
 * ---------------------
 * Este programa lee una secuencia de números enteros desde la entrada estándar (teclado),
 * los almacena en una lista dinámica, los ordena en orden ascendente y finalmente
 * los imprime en una sola línea separados por espacios.
 *
 * Ejemplo de uso:
 * Entrada:
 *   5 10 1 7 3
 *   (Ctrl+D o Ctrl+Z para terminar la entrada)
 *
 * Salida:
 *   1 3 5 7 10
 */
public class ordenarNumeros {
    public static void main(String[] args) {
        // Scanner permite leer datos de la entrada estándar (System.in)
        Scanner scanner = new Scanner(System.in);

        // Lista dinámica para almacenar todos los números introducidos
        List<Integer> numeros = new ArrayList<>();

        /**
         * Bucle de lectura:
         * Mientras existan números enteros en la entrada,
         * los vamos leyendo y añadiendo a la lista.
         *
         * - scanner.hasNextInt() devuelve true si el siguiente token es un entero.
         * - scanner.nextInt() lee ese entero y lo almacena en la lista.
         */
        while (scanner.hasNextInt()) {
            numeros.add(scanner.nextInt());
        }

        // Cerramos el scanner porque ya no vamos a leer más datos
        scanner.close();

        /**
         * Ordenar la lista:
         * Collections.sort() ordena la lista 'numeros' en orden ascendente (menor a mayor).
         */
        Collections.sort(numeros);

        /**
         * Mostrar el resultado ordenado:
         * Recorremos la lista y vamos imprimiendo cada número separado por un espacio.
         * Nota: el resultado quedará en una sola línea.
         */
        for (int n : numeros) {
            System.out.print(n + " ");
        }
    }
}
