package uttt.edu.mx.vectores.Arreglos.Matrices;

public class MatrizEntera {
    //Variables
    private int [][] ma;
    private int tamanio;
    //Constructor (El contrsuctor no tiene valor entero y se debe llamar igual que las clases

    public MatrizEntera(int tamanio){
        if (tamanio>2){
            this.tamanio = tamanio;
            ma =new int[tamanio][this.tamanio];
        }else{
            this.tamanio = 2;
            ma =new int[this.tamanio][this.tamanio];
        }
    }

    public int[][] getMa() {
        return ma;
    }

    public void setMa(int[][] ma) {
        if (ma.length==this.tamanio && ma[0].length == this.ma[0].length){
            for (int i = 0; i < this.ma.length; i++) {
                for (int j = 0; j < this.ma[0].length; j++) {
                    this.ma[i][j] = ma[i][j];
                }
            }
        }
    }

    public int getTamanio() {
        return tamanio;
    }







}
