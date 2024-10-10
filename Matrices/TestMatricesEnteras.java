package uttt.edu.mx.vectores.Arreglos.Matrices;

public class TestMatricesEnteras {

    public static void main(String[] args) {

        MatrizEntera obj1 = new MatrizEntera(3);
        MatrizEntera obj2 = new MatrizEntera(-2);

//        System.out.println(obj1.getTamanio());
//        System.out.println(obj2.getTamanio());
        int ma1 [][]= {{1,2,3},{4,5,6},{7,8,9}};
        int ma2[][]={{2,3},{4,5}};
        obj1.setMa(ma1);
        obj2.setMa(ma2);
//        for (int i = 0; i <obj1.getMa().length ; i++) {
//            for (int j = 0; j < obj1.getMa()[0].length; j++) {
//                System.out.print(obj1.getMa()[i][j]+" | ");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//
//        for (int i = 0; i <obj2.getMa().length; i++) {
//            for (int j = 0; j < obj2.getMa()[0].length; j++) {
//                System.out.println(obj2.getMa()[i][j]+" | ");
//            }
//            System.out.println();
//        }


        System.out.println(imprimir(ma1));
    }
    public static String imprimir(int [][] m){
        String salida = "";
        for (int i = 0; i <m.length ; i++) {
            salida+= "[";
            for (int j = 0; j < m[0].length; j++) {
                if (j==m[0].length-1) {
                    salida += m[i][j];
                }else {
                    salida +=m[i][j]+ ",";
                }
            }
            salida += "] \n";
        }
        return salida;
    }

}
