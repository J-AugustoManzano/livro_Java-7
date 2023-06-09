//Exemplo EXERC08EX1E.java
import java.io.*;
import java.util.Scanner;

public class EXERC08EX1E {
  public static void main(String args[]) {

    int CONT;
    int A[] = new int[15];
    int B[] = new int[15];
    Scanner s = new Scanner(System.in);
    
    System.out.println();
    System.out.print("\nEntre com o Arranjo A\n");
    for (CONT = 0; CONT <= 14; CONT++) {
        System.out.print("A[" + (CONT + 1) + "] ....: ");
        A[CONT] = s.nextInt();
    }

    for (CONT = 0; CONT <= 14; CONT++)
        B[CONT] = A[CONT] * A[CONT];

    System.out.println();

    System.out.print("\nOs elementos do Arranjo B são: ");
    System.out.print("\nB = [ ");
    for (CONT = 0; CONT <= 14; CONT++) {
        if (CONT == 14) {
            System.out.print(B[CONT]);
        } else {
            System.out.print(B[CONT] + ", ");
        }
    }
    System.out.print("]");
    System.out.println();

  }
}

