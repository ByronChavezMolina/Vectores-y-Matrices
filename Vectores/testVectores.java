package uttt.edu.mx.vectores.Arreglos.Vectores;

import javax.swing.*;

public class testVectores {
    public static void main(String[] args) {
        //DECLARACION DE VECTORES
//        int tam =4;
//        int [] x= new int[3];
//        System.out.println(x[1]);
//
//        double  y [] = new double[tam];
//        System.out.println(y[3]);
//
//        boolean z1[];
//        z1 = new boolean[4];
//
//        System.out.println(z1[3]);
//
//        char x1[],x2[], x3[];
//        x1 = new char[tam];
//        tam = 8;
//        x2 = new char[tam];
//
//        System.out.println(x2[3]);
//
//        String zz [] ={"luis","william", "Ezequiel","Arcadia"};
//        try{
//
//        }catch(ArrayIndexOutOfBoundsException ex){
//            System.out.println("Error:"+ex.getMessage());
//        }
//        zz[1]="Mark";
//        System.out.println(zz[1]);
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del arreglo"));
        double estaturas[] = new double[tamaño];
        llenarArreglo(estaturas);
        imprimir(estaturas);

    }

    public static void imprimir(double arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "->");
        }
    }

    public static void llenarArreglo(double arr[]) {
        int i = 0;
        while (i <= arr.length) {
            arr[i] = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de arreglo[" + (i + 1) + "]"));
            i++;
        }
    }

    public static double sumarValores(double arr[]) {
        //For
        double suma = 0;
        for (int i = 0; i < arr.length; i++) {
            suma += arr[i];
        }
        return suma;
    }
    public static double calcularMedia(double arr[]){
        //While
        double suma =0.0;
        int i = 0;
        while (i< arr.length){
            suma+=arr[i];
            i++;
        }
        return suma;
    }
    public static double obtenerValorMaximo(double arr[]){
        //DoWhile
        double maximo= arr[0];
        int i =1;
        do {
        if (arr[i]>maximo){
            maximo= arr[i];
        }
        i++;
        }while(i< arr.length);
        return maximo;
    }

}

