//Exemplo EXERC04EX1G.java
import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class EXERC04EX1G {
  public static void main(String args[]) {

    double F, K;
    DecimalFormat df = new DecimalFormat();
    Scanner s = new Scanner(System.in);

    System.out.println();

    System.out.print("Entre com a temperatura em Kelvin .......: ");
    K = s.nextFloat();

    F = (9 * (K - 273.15) + 160) / 5;

    df.applyPattern("0.00");
    System.out.print("\nTemperatura em Fahrenheit ........: " + df.format(F));
    System.out.println();

  }
}
