package ExerciciosLista1;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        System.out.print("Digite a matriz 3x3 do tabuleiro (-1 = minha peça, 0 = vazio, 1 = oponente):");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        boolean flag = false;
        for (int i = 0; i < matriz.length && !flag; i++) {
            for (int j = 0; j < matriz.length && !flag; j++) {
                if (matriz[i][j] == 0) {
                    System.out.println("Sua próxima jogada deve ser na posição: (" + i + ", " + j + ")");
                    flag = true;
                }
            }
        }
        if (!flag) {
            System.out.println("Tabuleiro cheio.");
        }
    }
}
