//Exemplo EXERC04EX2A.java
import java.io.*;
import java.util.Scanner;

public class EXERC04EX2A {
  public static void main(String args[]) {

    int A, B, C;
    Scanner s = new Scanner(System.in);
    
    System.out.println();

    System.out.print("Entre o valor <A>: ");
    A = s.nextInt();

    System.out.print("Entre o valor <B>: ");
    B = s.nextInt();

    if (A > B) {
        C = A - B;
    } else {
        C = B - A;
    }

    System.out.println();
    System.out.print("\nA diferença do maior pelo menor ....: " + C);
    System.out.println();

  }
}