//Exemplo EXERC08EX3C.java
import java.io.*;
import java.util.Scanner;

public class EXERC08EX3C {
  public static void main(String args[]) {

    int CONT1, CONT2, FAT, X;
    int A[] = new int[10];
    int B[] = new int[10];
    String RESP;
    Scanner s = new Scanner(System.in);
    
    System.out.println();
    System.out.print("\nEntre com o Arranjo A:\n");
    for (CONT1 = 0; CONT1 <= 9; CONT1++) {
        System.out.print("A[" + (CONT1 + 1) + "] ....: ");
        A[CONT1] = s.nextInt();
    }
    FAT = 1;
    for (CONT1 = 0; CONT1 <= 9; CONT1++) {
        FAT = 1;
        for (CONT2 = 1; CONT2 <= A[CONT1]; CONT2++)
            FAT *= CONT2;
        B[CONT1] = FAT;
    }
    
    for (CONT1 = 0; CONT1 <= 8; CONT1++)
        for (CONT2 = CONT1 + 1; CONT2 <= 9; CONT2++)
            if (B[CONT1] > B[CONT2]) {
                X = B[CONT1];
                B[CONT1] = B[CONT2];
                B[CONT2] = X;
            }

    System.out.println();

    System.out.print("\nOs elementos em ordem crescente do Arranjo B são: ");
    System.out.print("\nB = [ ");
    for (CONT1 = 0; CONT1 <= 8; CONT1++) {
        if (CONT1 == 8) {
            System.out.print(B[CONT1]);
        } else {
            System.out.print(B[CONT1] + ", ");
        }
    }
    System.out.print("]");
    System.out.println();
  }
}