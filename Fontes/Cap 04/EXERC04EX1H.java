//Exemplo EXERC04EX1H.java
import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class EXERC04EX1H {
  public static void main(String args[]) {

    double V, R, A;
    DecimalFormat df = new DecimalFormat();
    Scanner s = new Scanner(System.in);

    System.out.println();

    System.out.print("Entre com o raio da lata ........: ");
    R = s.nextFloat();

    System.out.print("Entre com a altura da lata ......: ");
    A = s.nextFloat();

    V = 3.141592653589793 * R * R * A;

    df.applyPattern("0.00");
    System.out.print("\nO volume da lata ........: " + df.format(V));
    System.out.println();

  }
}
