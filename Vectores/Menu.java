package uttt.edu.mx.vectores.Arreglos.Vectores;

import uttt.edu.mx.vectores.Arreglos.Matrices.MenuMatrices;

import javax.swing.*;

public class Menu {

    public static String mostrarMenuPrincipal() {
        return "Menú\n" +
                "1) Vectores\n" +
                "2) Matrices\n" +
                "3) Salir\n" +
                "Elija una opción:";
    }

    public static void main(String[] args) {
        String input;
        int opcion = 0;

        do {
            input = JOptionPane.showInputDialog(null, mostrarMenuPrincipal(), "Menú Principal", JOptionPane.QUESTION_MESSAGE);
                opcion = Integer.parseInt(input);

                switch (opcion) {
                    case 1:
                        MenuVectores m1=new MenuVectores();
                        m1.MenuVectores();
                        break;
                    case 2:
                        MenuMatrices m2 = new MenuMatrices();
                        m2.MenuMatrices();
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
}
