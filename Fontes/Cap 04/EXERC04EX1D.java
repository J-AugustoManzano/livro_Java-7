//Exemplo EXERC04EX1D.java
import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class EXERC04EX1D {
  public static void main(String args[]) {

    double C, K;
    DecimalFormat df = new DecimalFormat();
    Scanner s = new Scanner(System.in);

    System.out.println();

    System.out.print("Entre com a temperatura em Celsius .......: ");
    C = s.nextFloat();

    K = C + 273.15;

    df.applyPattern("0.00");
    System.out.print("\nTemperatura em Kelvin ........: " + df.format(K));
    System.out.println();

  }
}