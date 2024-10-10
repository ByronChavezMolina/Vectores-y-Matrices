package uttt.edu.mx.vectores.Arreglos.Matrices;
import javax.swing.*;

public class MenuMatrices {
    public static String Menu(){
        return "Menu Matrices\n"+
                "1)Matriz Identidad\n"+
                "2)Suma de Matrices\n"+
                "3)Resta Matrices\n"+
                "4)Multiplicacion Matrices\n"+
                "5)Matrices transpuesta\n"+
                "6)Suma de la diagonal \n"+
                "7)Suma de la diagonal inversa \n"+
                "8)Salir";
    }

    public void MenuMatrices() {
        String poner;
        int opcion;
        do {
            poner = JOptionPane.showInputDialog(Menu());
            opcion = Integer.parseInt(poner) ;
            switch (opcion){
                case 1:
                    Matriz();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:
                    JOptionPane.showMessageDialog(null,"Saliendo del programa");
                    System.exit(0);
                    break;
            }
        }while (opcion !=8);
    }
    public static void Matriz(){
        String tam = JOptionPane.showInputDialog("Introduce el tamaño de la matriz identidad:");
        int tamanio = Integer.parseInt(tam);

        MatrizEntera matriz = new MatrizEntera(tamanio);
        matriz.setMa(matriz.getMa());

        StringBuilder matrizTexto = new StringBuilder();
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                matrizTexto.append(matriz.getMa()[i][j]).append(" ");
            }
            matrizTexto.append("\n");
        }
        TestMatricesEnteras t1 = new TestMatricesEnteras();
        JOptionPane.showMessageDialog(null, "Matriz Identidad:\n" + t1.imprimir(matriz.getMa()));

    }
}
