//Exemplo EXERC04EX1J.java
import java.io.*;
import java.util.Scanner;

public class EXERC04EX1J {
  public static void main(String args[]) {

    int A, B, AUX;
    Scanner s = new Scanner(System.in);

    System.out.println();

    System.out.print("Entre com o valor de A .....: ");
    A = s.nextInt();

    System.out.print("Entre com o valor de B .....: ");
    B = s.nextInt();

    AUX = A;
    A = B;
    B = AUX;

    df.applyPattern("0.00");
    System.out.print("\nO valor de A ....: " + A);
    System.out.print("\nO valor de B ....: " + B);
    System.out.println();

  }
}