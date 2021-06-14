//Exemplo EXERC08EX2C.java
import java.io.*;
import java.util.Scanner;

public class EXERC08EX2C {
  public static void main(String args[]) {

    int CONT1, CONT2;
    int A[][] = new int[4][4];
    int B[][] = new int[4][4];
    int C[][] = new int[4][4];
    Scanner s = new Scanner(System.in);
    
    System.out.println();
    System.out.print("\nEntre com o Arranjo A\n");
    for (CONT1 = 0; CONT1 <= 3; CONT1++) {
        for (CONT2 = 0; CONT2 <= 3; CONT2++) {
            System.out.print("A[" + (CONT1 + 1) + "][" + (CONT2 + 1) + "] ....: ");
            A[CONT1][CONT2] = s.nextInt();
        }
    }

    System.out.println();
    System.out.print("\nEntre com o Arranjo B\n");
    for (CONT1 = 0; CONT1 <= 3; CONT1++) {
        for (CONT2 = 0; CONT2 <= 3; CONT2++) {
            System.out.print("B[" + (CONT1 + 1) + "][" + (CONT2 + 1) + "] ....: ");
            B[CONT1][CONT2] = s.nextInt();
        }
    }

    for (CONT1 = 0; CONT1 <= 3; CONT1++) {
        for (CONT2 = 0; CONT2 <= 3; CONT2++) {
            C[CONT1][CONT2] = A[CONT1][CONT2] - B[CONT1][CONT2];
        }
    }

    System.out.println();

    System.out.print("\nOs elementos do Arranjo C são: \n");
    for (CONT1 = 0; CONT1 <= 3; CONT1++) {
        for (CONT2 = 0; CONT2 <= 3; CONT2++) {
            System.out.print(C[CONT1][CONT2] + "\t");
        }
        System.out.println();
    }
    System.out.println();
  }
}
