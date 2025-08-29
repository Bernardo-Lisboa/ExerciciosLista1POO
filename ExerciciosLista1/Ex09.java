package ExerciciosLista1;

public class Ex09 {
    public static void main(String[] args) {
        int matriz[][]= new int[10][10];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i==j) {
                    matriz[i][j]=3*(i*i)-1;
                    System.out.print(matriz[i][j]);
                }else if (i>j) {
                    matriz[i][j]=4*(i*i*i)-5*(j*j);
                    System.out.print(matriz[i][j]);
                }else if (i<j) {
                    matriz[i][j]=2*i+7*j-2;
                    System.out.print(matriz[i][j]);
                }
            }
            System.out.println();
        }
        //Para usar o redirecionamento de saída precisamos primeiro compilar o codigo e depois rodar ele redirecionando a saida para um txt
        //Por exemplo no terminal: "javac Ex09.java" e depois: "java Ex09 > matriz.txt"
    }
}
