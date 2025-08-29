package ExerciciosLista1;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero real a: ");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite o numero real b: ");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite o numero real c: ");
        double c = sc.nextDouble();
        double delta = Math.pow(b, 2)-(4*a*c);
        System.out.println("Delta = "+delta);
        sc.close();
    }
}
