package uttt.edu.mx.vectores.Arreglos.Vectores;

import javax.swing.*;

public class MenuVectores {

    public static String Menu() {
        return "Ejercicios Vectores\n" +
                "1) Suma de vectores\n" +
                "2) Productos a escalar de dos vectores\n" +
                "3) Vectores inversos\n" +
                "4) Multiplicación de un producto a escalar\n" +
                "5) Valor máximo y mínimo de un vector\n" +
                "6) Vector sin duplicados\n" +
                "7) Intercambio de vectores\n" +
                "8) Escalar los números primos\n" +
                "9) Escalar los pares e impares\n" +
                "10) Volver al menú principal\n" +
                "Elija una opción:";
    }

    public void MenuVectores() {
        String input;
        int opcion = 0;

        do {
            input = JOptionPane.showInputDialog(null, Menu());

                opcion = Integer.parseInt(input);

                switch (opcion) {
                    case 1:
                        SumaVectores();
                        break;
                    case 2:
                        VectorEntero();
                        break;
                    case 3:
                        VectoresInvertido();
                        break;
                    case 4:
                        Multiplicacion();
                        break;
                    case 5:

                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Vector sin duplicados seleccionada.");
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Intercambio de vectores seleccionada.");
                        break;
                    case 8:
                        JOptionPane.showMessageDialog(null, "Escalar los números primos seleccionada.");
                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null, "Escalar los pares e impares seleccionada.");
                        break;
                    case 10:
                        JOptionPane.showMessageDialog(null, Menu.mostrarMenuPrincipal());
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida.");
                }
        } while (opcion != 10);
    }
    public static void SumaVectores() {
        String inputTamanio = JOptionPane.showInputDialog("Introduce el tamaño de los vectores:");
        int tamanio = Integer.parseInt(inputTamanio);

        VectoresEnteros vectores = new VectoresEnteros(tamanio);

        int[] vector1 = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            String valor = JOptionPane.showInputDialog("Introduce el valor[" + (i + 1) + "] del primer vector:");
            vector1[i] = Integer.parseInt(valor);
        }
        vectores.setV1(vector1);

        int[] vector2 = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            String valor = JOptionPane.showInputDialog("Introduce el valor[" + (i + 1) + "] del segundo vector:");
            vector2[i] = Integer.parseInt(valor);
        }
        vectores.setV2(vector2);

        int[] resultado = vectores.sumarVectores();

        String output = "La suma de los vectores es: ";
        for (int i : resultado) {
            output += i + " ";
        }
        JOptionPane.showMessageDialog(null, output);
    }

    public static void VectorEntero() {
        String inputTamanio = JOptionPane.showInputDialog("Introduce el tamaño de los vectores:");
        int tamanio = Integer.parseInt(inputTamanio);

        Operaciones vectores = new Operaciones(tamanio);

        int[] vector1 = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            String valor = JOptionPane.showInputDialog("Introduce el valor[" + (i + 1) + "]");
            vector1[i] = Integer.parseInt(valor);
        }
        vectores.setV1(vector1);

        int[] vector2 = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            String valor = JOptionPane.showInputDialog("Introduce el valor [" + (i + 1) + "] del vector 2:");
            vector2[i] = Integer.parseInt(valor);
        }
        vectores.setV2(vector2);

        int productoEscalar = vectores.calcularProductoEscalar();
        JOptionPane.showMessageDialog(null, "El producto escalar de los vectores es: " + productoEscalar);
    }

    public static void VectoresInvertido() {
        String inputTamanio = JOptionPane.showInputDialog("Introduce el tamaño del vector:");
        int tamanio = Integer.parseInt(inputTamanio);

        vectorInvertido ve = new vectorInvertido(tamanio);

        int[] v1 = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            String valor = JOptionPane.showInputDialog("Introduce el valor[" + (i + 1) + "]");
            v1[i] = Integer.parseInt(valor);
        }
        ve.setV1(v1);

        int[] resultado = ve.invertirVector();

        String output = "El vector invertido es: ";
        for (int i = 0; i < resultado.length; i++) {
            output += resultado[i] + "|";
        }
        JOptionPane.showMessageDialog(null, output);
    }
    public static void Multiplicacion(){
        String inputTamanio = JOptionPane.showInputDialog("Introduce el tamaño del vector:");
        int tamanio = Integer.parseInt(inputTamanio);

        MultiplicarVectores m1 = new MultiplicarVectores(tamanio);

        int[] vector = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            String valor = JOptionPane.showInputDialog("Introduce el valor[" + (i + 1) + "]");
            vector[i] = Integer.parseInt(valor);
        }
        m1.setV1(vector);

        String inputEscalar = JOptionPane.showInputDialog("Introduce el número escalar:");
        int escalar = Integer.parseInt(inputEscalar);

        int[] resultado =m1.multiplicarPorEscalar(escalar);

        String output = "El vector resultante es: ";
        for (int i : resultado) {
            output += i + "|";
        }
        JOptionPane.showMessageDialog(null, output);

    }

}
