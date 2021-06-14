//Exemplo EXERC08EX3D.java
import java.io.*;
import java.util.Scanner;

public class EXERC08EX3D {
  public static void main(String args[]) {

    int CONT1, CONT2;
    String A[] = new String[12];
    String B[] = new String[11];
    String C[] = new String[23];
    String X;
    Scanner s = new Scanner(System.in);
    
    System.out.println();
    System.out.print("\nEntre com o Arranjo A:\n");
    for (CONT1 = 0; CONT1 <= 11; CONT1++) {
        System.out.print("Entre o " + (CONT1 + 1) + "o. nome feminino: ");
        A[CONT1] = s.next();
    }

    System.out.println();
    System.out.print("\nEntre com o Arranjo B:\n");
    for (CONT1 = 0; CONT1 <= 10; CONT1++) {
        System.out.print("Entre o " + (CONT1 + 1) + "o. nome masculino: ");
        B[CONT1] = s.next();
    }

    for (CONT1 = 0; CONT1 <= 11; CONT1++)
        C[CONT1] = A[CONT1];

    for (CONT1 = 0; CONT1 <= 10; CONT1++)
        C[CONT1 + 12] = B[CONT1];

    for (CONT1 = 0; CONT1 <= 21; CONT1++)
        for (CONT2 = CONT1 + 1; CONT2 <= 22; CONT2++)
            if (C[CONT1].compareTo(C[CONT2]) > 0) {
                X = C[CONT1];
                C[CONT1] = C[CONT2];
                C[CONT2] = X;
            }

    System.out.print("\nOs nomes em ordem crecentes são: \n");
    for (CONT1 = 0; CONT1 <= 22; CONT1++) {
        System.out.print(C[CONT1] + "\n");
    }
    System.out.println();
  }
}
