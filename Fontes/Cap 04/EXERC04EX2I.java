//Exemplo EXERC04EX2I.java
import java.io.*;
import java.util.Scanner;

public class EXERC04EX2I {
  public static void main(String args[]) {

    int A;
    Scanner s = new Scanner(System.in);
    
    System.out.println();

    System.out.print("Entre com um valor inteiro: ");
    A = s.nextInt();

    System.out.println();
    if (A % 2 == 0) {
        System.out.print("\nO número " + A + " é par.");
    } else {
        System.out.print("\nO número " + A + " é impar.");
    }
    System.out.println();

  }
}