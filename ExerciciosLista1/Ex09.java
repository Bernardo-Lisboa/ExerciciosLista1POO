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
        //Para usar o redirecionamento de saída precisamos escrever no terminal: "./gradlew run > matriz.txt"
        //ele cria um txt com a saida do programa, como se fosse no terminal 
    }
}

