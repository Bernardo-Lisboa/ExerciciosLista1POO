package ExerciciosLista1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int n = 0;
        do {
            System.out.printf("Entre com a quantidade de linhas: ");
            try {
                n = sc.nextInt();
                flag=false;
            }
            catch(Exception e) {
                System.out.println("Entre com um número valido.");
            }
        } while (flag);
        criarPascal(n);
        sc.close();
    }
    public static void criarPascal(int n){
        int[] pascal = new int[n];
        int[] pascalanterior = new int[n];
        pascalanterior[0] = 1;
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < i; j++) {
                if (j == 0){
                    System.out.print("1 ");
                    pascal[0]=1;
                }else {
                    pascal[j] = pascalanterior[j] + pascalanterior[j - 1];
                    System.out.printf("%d ", pascal[j]);
                }
            }
            pascalanterior=Arrays.copyOf(pascal, pascal.length);
            System.out.println();
        }
    }
}
