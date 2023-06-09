//Exemplo EXERC04EX1F.java
import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class EXERC04EX1F {
  public static void main(String args[]) {

    double F, K;
    DecimalFormat df = new DecimalFormat();
    Scanner s = new Scanner(System.in);

    System.out.println();

    System.out.print("Entre com a temperatura em Fahrenheit .......: ");
    F = s.nextFloat();

    K = (F - 32) * 5 / 9 + 273.15;

    df.applyPattern("0.00");
    System.out.print("\nTemperatura em Kelvin ........: " + df.format(K));
    System.out.println();

  }
}
