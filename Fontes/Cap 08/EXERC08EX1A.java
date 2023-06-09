//Exemplo EXERC08EX1A.java
import java.io.*;
import java.util.Scanner;

public class EXERC08EX1A {
  public static void main(String args[]) {

    int CONT;
    int A[] = new int[8];
    int B[] = new int[8];
    Scanner s = new Scanner(System.in);
    
    System.out.println();
    System.out.print("\nEntre com o Arranjo A\n");
    for (CONT = 0; CONT <= 7; CONT++) {
        System.out.print("A[" + (CONT + 1) + "] ....: ");
        A[CONT] = s.nextInt();
    }

    for (CONT = 0; CONT <= 7; CONT++)
        B[CONT] = 3 * A[CONT];

    System.out.println();

    System.out.print("\nOs elementos do Arranjo B são: ");
    System.out.print("\nB = [ ");
    for (CONT = 0; CONT <= 7; CONT++) {
        if (CONT == 7) {
            System.out.print(B[CONT]);
        } else {
            System.out.print(B[CONT] + ", ");
        }
    }
    System.out.print("]");
    System.out.println();

  }
}