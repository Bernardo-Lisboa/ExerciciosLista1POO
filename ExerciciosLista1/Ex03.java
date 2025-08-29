package ExerciciosLista1;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) { //String[] args cria um array "args" com todos os argumentos que tu botar na linha de comando
        Scanner sc = new Scanner(System.in);
        boolean flag1 = true;
        int soma = 0;
        do {
            int binInt[] = new int[args.length]; //Cria um array de int do mesmo tamanho do args
            int j = args.length - 1;
            try {
                for (int i = 0; i < args.length; i++) {
                    binInt[i] = Integer.parseInt(args[i]); //Transforma o numero de string para int
                    if (binInt[i] == 0 || binInt[i] == 1) {
                        soma += (Math.pow(2, j) * binInt[i]); //Passa de binario pra decimal
                        j--;
                    } else {
                        System.out.println("Digite um binário valido.");
                    }
                }
                flag1 = false;
            } catch (Exception e) {
                System.out.println("Digite um binário valido.");
            }
        } while (flag1);
        System.out.println("Decimal: "+soma);
        sc.close();
    }
}
