package uttt.edu.mx.vectores.Arreglos.Vectores;

import java.util.Random;

public class Puntajes {
    private int[] puntajes;
    private int tamanio;

    public Puntajes(int tamanio) {
        if (tamanio > 0) {
            this.tamanio = tamanio;
            puntajes = new int[tamanio];
            generarPuntajesAleatorios();
        } else {
            this.tamanio = 1;
            puntajes = new int[1];
        }
    }

    private void generarPuntajesAleatorios() {
        Random random = new Random();
        for (int i = 0; i < tamanio; i++) {
            puntajes[i] = random.nextInt(21); // Genera puntajes entre 0 y 20
        }
    }

    public int[] getPuntajes() {
        return puntajes;
    }

    public int getTamanio() {
        return tamanio;
    }

    public String clasificarEstudiantes() {
        int deficientes = 0;
        int regulares = 0;
        int buenos = 0;
        int excelentes = 0;

        for (int puntaje : puntajes) {
            if (puntaje >= 0 && puntaje <= 5) {
                deficientes++;
            } else if (puntaje >= 6 && puntaje <= 10) {
                regulares++;
            } else if (puntaje >= 11 && puntaje <= 15) {
                buenos++;
            } else if (puntaje >= 16 && puntaje <= 20) {
                excelentes++;
            }
        }

        return "Deficientes: " + deficientes + "\n" +
                "Regulares: " + regulares + "\n" +
                "Buenos: " + buenos + "\n" +
                "Excelentes: " + excelentes;
    }

    public String mostrarPuntajes() {
        StringBuilder resultado = new StringBuilder("Puntajes generados:\n");
        for (int puntaje : puntajes) {
            resultado.append(puntaje).append(" ");
        }
        return resultado.toString();
    }
}
