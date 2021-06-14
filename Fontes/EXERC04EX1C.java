//Exemplo EXERC04EX1C.java
import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class EXERC04EX1C {
  public static void main(String args[]) {

    float C, F;
    DecimalFormat df = new DecimalFormat();
    Scanner s = new Scanner(System.in);
    
    System.out.println();

    System.out.print("Entre com a temperatura em Fahrenheit .......: ");
    C = s.nextFloat();

    C = (F - 32) * 5 / 9;

    df.applyPattern("0.00");
    System.out.print("\nTemperatura em Celsius ........: " + df.format(C));
    System.out.println();

  }
}