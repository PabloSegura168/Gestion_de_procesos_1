package Ejercicio1;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class aleatorios {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            // Generamos 40 números aleatorios
            for (int i = 0; i < 40; i++) {
                // Generamos número aleatorio entre 0 y 100
                int numeroAleatorio = (int)(Math.random() * 101);

                // Escribimos el número usando BufferedWriter
                bw.write(String.valueOf(numeroAleatorio));
                bw.newLine(); // Añade un salto de línea
            }
            // Aseguramos que todos los datos se escriban
            bw.flush();
        } catch (IOException e) {
            System.err.println("Error al escribir: " + e.getMessage());
        }
    }
}