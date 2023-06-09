//Exemplo EXERC04EX2D.java
import java.io.*;
import java.util.Scanner;

public class EXERC04EX2D {
  public static void main(String args[]) {

    int A, B, C;
    Scanner s = new Scanner(System.in);
    
    System.out.println();

    System.out.print("Entre com <A>: ");
    A = s.nextInt();

    System.out.print("Entre com <B>: ");
    B = s.nextInt();

    System.out.print("Entre com <C>: ");
    C = s.nextInt();

    System.out.println();
    System.out.print("\nOs valores em ordem crescente são:");
    if (A < B) {
        if (B < C) {
            System.out.print("\n" + A + " - " + B + " - " + C);
        } else {
            if (A < C) {
                System.out.print("\n" + A + " - " + C + " - " + B);
            } else {
                System.out.print("\n" + C + " - " + A + " - " + B);
            }
        }
    } else {
        if (A < C) {
            System.out.print("\n" + B + " - " + A + " - " + C);
        } else {
            if (B < C) {
                System.out.print("\n" + B + " - " + C + " - " + A);
            } else {
                System.out.print("\n" + C + " - " + B + " - " + A);
            }
        }
    }
    System.out.println();

  }
}