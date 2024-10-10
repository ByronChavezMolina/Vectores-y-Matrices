package uttt.edu.mx.vectores.Arreglos.Vectores;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class numerosAleatorios {
    private int[] v1;
    private int tamanio;

    public numerosAleatorios(int tamanio) {
        if (tamanio > 0) {
            v1 = new int[tamanio];
            this.tamanio = tamanio;
            generarNumerosAleatorios();
        } else {
            v1 = new int[1];
            this.tamanio = 1;
        }
    }

    private void generarNumerosAleatorios() {
        Random random = new Random();
        for (int i = 0; i < tamanio; i++) {
            v1[i] = random.nextInt(30) + 1; // Números entre 1 y 30
        }
    }

    public int[] getV1() {
        return v1;
    }

    public int getTamanio() {
        return tamanio;
    }

    public int obtenerMaximo() {
        int max = v1[0];
        for (int num : v1) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public int obtenerMinimo() {
        int min = v1[0];
        for (int num : v1) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public double calcularMedia() {
        int suma = 0;
        for (int num : v1) {
            suma += num;
        }
        return (double) suma / tamanio;
    }

    public int calcularModa() {
        int[] conteo = new int[31]; // Para contar del 1 al 30
        for (int num : v1) {
            conteo[num]++;
        }
        int moda = 1;
        for (int i = 2; i < conteo.length; i++) {
            if (conteo[i] > conteo[moda]) {
                moda = i;
            }
        }
        return moda;
    }

    public double calcularMediana() {
        int[] datos = v1.clone();
        Arrays.sort(datos);
        if (tamanio % 2 == 0) {
            return (datos[tamanio / 2 - 1] + datos[tamanio / 2]) / 2.0;
        } else {
            return datos[tamanio / 2];
        }
    }

    public String obtenerConteoYPorcentaje() {
        int[] conteo = new int[10];
        String resultado = "Conteo y porcentaje de números del 1 al 10:\n";
        for (int num : v1) {
            if (num >= 1 && num <= 10) {
                conteo[num - 1]++;
            }
        }
        for (int i = 0; i < conteo.length; i++) {
            double porcentaje = (double) conteo[i] / tamanio * 100;
            resultado += "Número " + (i + 1) + ": Cantidad = " + conteo[i] + ", Porcentaje de = " + porcentaje + "%\n";
        }
        return resultado;
    }

    public void mostrarResultados() {
        String resultados = "Números generados: " + Arrays.toString(v1) + "\n" +
                "Número máximo: " + obtenerMaximo() + "\n" +
                "Número mínimo: " + obtenerMinimo() + "\n" +
                "Media Arimetica: " + calcularMedia() + "\n" +
                "Moda: " + calcularModa() + "\n" +
                "Mediana: " + calcularMediana() + "\n" +
                obtenerConteoYPorcentaje();
               JOptionPane.showMessageDialog(null, resultados, "Resultados de Estadísticas", JOptionPane.INFORMATION_MESSAGE);
    }
}
