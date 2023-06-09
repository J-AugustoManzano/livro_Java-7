//Exemplo EXERC04EX2F.java
import java.io.*;
import java.util.Scanner;

public class EXERC04EX2F {
  public static void main(String args[]) {

    int A, B, C, D;
    Scanner s = new Scanner(System.in);
    
    System.out.println();

    System.out.print("Entre com <A>: ");
    A = s.nextInt();

    System.out.print("Entre com <B>: ");
    B = s.nextInt();

    System.out.print("Entre com <C>: ");
    C = s.nextInt();

    System.out.print("Entre com <D>: ");
    D = s.nextInt();

    System.out.println();
    if (A % 2 == 0 || A % 3 == 0) {
        System.out.print("\nO valor de " + A + " é divisivel por 2 ou por 3");
    }
    if (B % 2 == 0 || B % 3 == 0) {
        System.out.print("\nO valor de " + B + " é divisivel por 2 ou por 3");
    }
    if (C % 2 == 0 || C % 3 == 0) {
        System.out.print("\nO valor de " + C + " é divisivel por 2 ou por 3");
    }
    if (D % 2 == 0 || D % 3 == 0) {
        System.out.print("\nO valor de " + D + " é divisivel por 2 ou por 3");
    }
    System.out.println();

  }
}