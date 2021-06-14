//Exemplo EXERC04EX1I.java
import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class EXERC04EX1I {
  public static void main(String args[]) {

    double P, D, R;
    DecimalFormat df = new DecimalFormat();
    Scanner s = new Scanner(System.in);

    System.out.println();

    System.out.print("Entre com a densidade da esfera ........: ");
    D = s.nextFloat();

    System.out.print("Entre com o raio da esfera .............: ");
    R = s.nextFloat();

    P = D * 4 * 3.141592653589793 * R * R * R / 3;

    df.applyPattern("0.00");
    System.out.print("\nO peso da esfera ........: " + df.format(P));
    System.out.println();

  }
}
