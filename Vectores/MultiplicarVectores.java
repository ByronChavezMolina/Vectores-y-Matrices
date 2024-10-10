package uttt.edu.mx.vectores.Arreglos.Vectores;

public class MultiplicarVectores {
    private int[] v1;
    private int tamanio;

    public MultiplicarVectores(int tamanio) {
        this.tamanio= tamanio;
        v1 = new int[tamanio];
    }

    public int[] getV1() {
        return v1;
    }

    public void setV1(int[] v1) {
        this.v1 = v1;
    }
    public int[] multiplicarPorEscalar(int escalar) {
        int[] resultado = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            resultado[i] = v1[i] * escalar;
        }
        return resultado;
    }
}
