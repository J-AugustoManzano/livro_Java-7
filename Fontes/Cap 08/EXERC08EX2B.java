//Exemplo EXERC08EX2B.java
import java.io.*;
import java.util.Scanner;

public class EXERC08EX2B {
  public static void main(String args[]) {

    int CONT1, CONT2, FAT;
    int A[] = new int[5];
    int B[][] = new int[5][3];
    Scanner s = new Scanner(System.in);
    
    System.out.println();
    System.out.print("\nEntre com o Arranjo A\n");
    for (CONT1 = 0; CONT1 <= 4; CONT1++) {
        System.out.print("A[" + (CONT1 + 1) + "] ....: ");
        A[CONT1] = s.nextInt();
    }

    for (CONT1 = 0; CONT1 <= 4; CONT1++) {
        B[CONT1][0] = A[CONT1] + 5;
    }

    for (CONT1 = 0; CONT1 <= 4; CONT1++) {
        FAT = 1;
        for (CONT2 = 1; CONT2 <= A[CONT1]; CONT2++) 
            FAT *= CONT2;
        B[CONT1][1] = FAT;
    }

    for (CONT1 = 0; CONT1 <= 4; CONT1++) {
        B[CONT1][2] = A[CONT1] * A[CONT1];
    }

    System.out.println();

    System.out.print("\nOs elementos do Arranjo C são: \n");
    for (CONT1 = 0; CONT1 <= 4; CONT1++) {
        for (CONT2 = 0; CONT2 <= 2; CONT2++) {
            System.out.print(B[CONT1][CONT2] + "\t");
        }
        System.out.println();
    }
    System.out.println();

  }
}
