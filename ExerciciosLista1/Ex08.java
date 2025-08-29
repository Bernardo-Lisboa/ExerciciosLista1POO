package ExerciciosLista1;

public class Ex08 {
    public static void main(String[] args) {
        int matriz[][]= new int[5][5]; //criação da matriz 5x5
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i==j) {
                    //quando i=j ele escreve na diagonal principal 1
                    matriz[i][j]=1;
                    System.out.print(matriz[i][j]);
                }
                else{
                    matriz[i][j]=0;
                    System.out.print(matriz[i][j]);
                }
            }
            System.out.println();
        }
    }
}
