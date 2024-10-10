package uttt.edu.mx.vectores.Arreglos.Vectores;

public class TestvectorEntero {
    public static void main(String[] args) {
        Vector ve = new Vector(3);


        int[] vector = {3, 5, 10};

        ve.setVector(vector);
        String resultado = "Vector Original: " + VectorFormating(ve.getVector()) +
                "\nVector Inverso: " + VectorFormating(ve.invertirVector());

        System.out.println(resultado);
    }

    public static String VectorFormating(int[] vector) {
        String formato = "[";
        for (int i = 0; i < vector.length; i++) {
            if (i == vector.length - 1) {
                formato += vector[i];
            } else {
                formato += vector[i] + ",";
            }
        }
        formato += "]";
        return formato;
    }
}
