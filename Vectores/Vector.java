package uttt.edu.mx.vectores.Arreglos.Vectores;

public class Vector {
    private int[] vector;
    private int tamanio;

    public Vector(int tamanio){
        if (tamanio>0){
            this.tamanio=tamanio;
        }else{
            this.tamanio=1;
        }
        this.vector = new int[this.tamanio];
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        if(tamanio>0) {
            this.tamanio = tamanio;
        }
    }

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        if (vector.length == this.tamanio) {
            for (int i = 0; i < vector.length; i++) {
                this.vector[i] = vector[i];
            }
        }
    }


    public int[]  invertirVector(){
        int j = 0;
        int [] vectorInverso = new int[tamanio];
        for (int i = this.tamanio-1; i >= 0; i--) {
            vectorInverso[j] = this.vector[i];
            j++;
        }
        return vectorInverso;
    }


}
