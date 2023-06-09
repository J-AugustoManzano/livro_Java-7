//Exemplo EXERC04EX1B.java
import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class EXERC04EX1B {
  public static void main(String args[]) {

    float C, F;
    DecimalFormat df = new DecimalFormat();
    Scanner s = new Scanner(System.in);

    System.out.println();

    System.out.print("Entre com a temperatura em Celsius .......: ");
    C = s.nextFloat();

    F = (9 * C + 160) / 5;

    df.applyPattern("0.00");
    System.out.print("\nTemperatura em Fahrenheit ........: " + df.format(F));
    System.out.println();

  }
}
