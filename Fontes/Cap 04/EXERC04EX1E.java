//Exemplo EXERC04EX1E.java
import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class EXERC04EX1E {
  public static void main(String args[]) {

    double C, K;
    DecimalFormat df = new DecimalFormat();
    Scanner s = new Scanner(System.in);

    System.out.println();

    System.out.print("Entre com a temperatura em Kelvin .......: ");
    K = s.nextFloat();

    C = K - 273.15;

    df.applyPattern("0.00");
    System.out.print("\nTemperatura em Celsius ........: " + df.format(C));
    System.out.println();

  }
}
