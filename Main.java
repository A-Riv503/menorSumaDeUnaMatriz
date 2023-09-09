import java.util.Scanner;

public class Main {
    /*Se tiene una matriz de 3 x 3 que contiene números del 1 al 9 simulado con una matriz unidimensional. Así, por ejemplo, esta matriz:
    1 2 9
    2 5 3
    5 1 5
    Se representaría como (1,2,9,2,5,3,5,1,5). El objetivo es identificar el camino que de la menor suma al recorrer el arreglo bi-dimencional de izquierda
    a derecha. Se empieza en la columna izquierda y se mueve siempre una columna a la derecha de la misma fila o a una fila hacia arriba o hacia abajo.
    En el ejemplo, si parte de 1, puede pasar al 2 o al 5. De ahí, si pasó al 5 puede pasar al 9 al 3 o al 5. Por otro lado, si pasa del 1 al 2, desde
    el 2 de la columna del medio no podría pasar al 5 de la ultima fila en la columna derecha.

    Es necesario encontrar el camino que produce el número más bajo al suma los valores de cada número que visita. Así que para el ejemplo,
    la ruta con la menor suma sería 1,2,3

    El resultado de su programa debe ser los 3 números por los que pasó para obtener la menor suma separados por un espacio. Para el ejemplo,
    la salida sería exactamente así:
    1 2 3
    */
    static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
       llenarMatriz();
    }

    public static void llenarMatriz(){
        int matriz[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("ingrese los numeros de su matriz de un rango de 1-9");
                matriz[i][j]=scan.nextInt();
            }
        }

        detectarMenores(matriz);
    }


    public static void detectarMenores(int matriz[][]){
        int almacenarNum[]=new int[3];
        int numerosLista[]=new int[9];
        int minimo=matriz[0][0];



        for(int i=0; i<3; i++){
            for(int j=0;j<3;j++){
                numerosLista[i]=matriz[i][j];
                i++;


            }
        }

        for(int i=0;i<numerosLista.length;i++){
            System.out.print( numerosLista[i]+" ");
        }
    }

}