//Exemplo EXERC04EX2B.java
import java.io.*;
import java.math.*;
import java.util.Scanner;

public class EXERC04EX2B {
  public static void main(String args[]) {

    int A;
    Scanner s = new Scanner(System.in);
    
    System.out.println();

    System.out.print("Entre com um valor inteiro: ");
    A = s.nextInt();

    if (A < 0) {
        A = Math.abs(A);
    }

    System.out.println();
    System.out.print("\nO valor inteiro é: " + A);
    System.out.println();

  }
}