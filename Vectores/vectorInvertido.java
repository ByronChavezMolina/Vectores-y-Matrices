package uttt.edu.mx.vectores.Arreglos.Vectores;

public class vectorInvertido {
    private int[] v1;
    private int tamanio;

    public vectorInvertido(int tamanio) {
        if (tamanio>0) {
            v1 =new int[tamanio];
            this.tamanio = tamanio;
        }else{
            v1=new int[1];
            this.tamanio=1;
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
        if (v1.length ==tamanio){
            for (int i=0; i< v1.length; i++){
                this.v1[i] = v1[i];
            }
        }
    }
    public int[] invertirVector(){
        int[] vInvertido = new int[tamanio];
        for (int i=0; i<tamanio; i++){
            vInvertido[i] =v1[tamanio-1 - i];
        }
        return vInvertido;
    }

}
