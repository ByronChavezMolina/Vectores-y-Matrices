package uttt.edu.mx.vectores.Arreglos.Vectores;
import javax.swing.*;

public class MenuEjercicios {
    public static String mostrarMenuPrincipal() {
        return "Menú\n" +
                "1) Numeros Aleatorios\n" +
                "2) Notas\n" +
                "3) Salir\n" +
                "Elija una opción:";
    }

    public static void main(String[] args) {
        String input;
        int opcion = 0;

        do {
            input = JOptionPane.showInputDialog(null, mostrarMenuPrincipal());
            opcion = Integer.parseInt(input);

            switch (opcion) {
                case 1:
                    numerosAleatorios();
                    break;
                case 2:
                    puntaje();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }

        } while (opcion != 3);
    }
    public static void numerosAleatorios(){
        int cantidad = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            String input = JOptionPane.showInputDialog("Ingrese la cantidad de números a generar (entre 1 y 30):");

            if (input == null) {
                JOptionPane.showMessageDialog(null, "Operación cancelada.");
                return;
            }


            cantidad = Integer.parseInt(input);


            if (cantidad >= 1 && cantidad <= 30) {
                entradaValida = true;
            } else {
                JOptionPane.showMessageDialog(null, "La cantidad debe estar entre 1 y 30. Inténtalo de nuevo.");
            }
        }

        numerosAleatorios vectores = new numerosAleatorios(cantidad);
        vectores.mostrarResultados();
    }

    public static void puntaje() {


        int cantidad = 0;
        boolean entradaValida = false;


        while (!entradaValida) {
            String input = JOptionPane.showInputDialog("Ingrese la cantidad de puntajes a generar (N):");

            if (input == null) {
                JOptionPane.showMessageDialog(null, "Operación cancelada.");
                return;
            }


            cantidad = Integer.parseInt(input);


            if (cantidad >= 1) {
                entradaValida = true;
            } else {
                JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor o igual a 1. Inténtalo de nuevo.");
            }
        }

        Puntajes puntajes = new Puntajes(cantidad);


        String resultadoPuntajes = puntajes.mostrarPuntajes();
        String clasificacion = puntajes.clasificarEstudiantes();

        JOptionPane.showMessageDialog(null, resultadoPuntajes + "\n\n" + clasificacion, "Resultados de Puntajes", JOptionPane.INFORMATION_MESSAGE);
    }

}
