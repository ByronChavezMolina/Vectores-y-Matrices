package uttt.edu.mx.vectores.Arreglos.Vectores;

public class VectoresEnteros {
    private int[] v1;
    private int[] v2;
    private int tamanio;

    public VectoresEnteros(int tamanio) {
        if (tamanio > 0) {
            v1 = new int[tamanio];
            v2 = new int[tamanio];
            this.tamanio = tamanio;
        } else {
            v1 = new int[1];
            v2 = new int[1];
            this.tamanio = 1;
        }
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int[] getV1() {
        return v1;
    }

    public void setV1(int[] v1) {
        if (v1.length == tamanio) {
            for (int i = 0; i < v1.length; i++) {
                this.v1[i] = v1[i];
            }
        }
    }

    public int[] getV2() {
        return v2;
    }

    public void setV2(int[] v2) {
        if (v2.length == tamanio) {
            for (int i = 0; i < v2.length; i++) {
                this.v2[i] = v2[i];
            }
        }
    }

    public int[] sumarVectores() {
        int[] suma = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            suma[i] = v1[i] + v2[i];
        }
        return suma;
    }
}