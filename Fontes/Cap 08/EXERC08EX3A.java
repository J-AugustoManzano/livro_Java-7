//Exemplo EXERC08EX3A.java
import java.io.*;
import java.util.Scanner;

public class EXERC08EX3A {
  public static void main(String args[]) {

    int CONT1, CONT2;
    String A[] = new String[12], X;
    Scanner s = new Scanner(System.in);
    
    System.out.println();
    System.out.print("\nEntre com o Arranjo A:\n");
    for (CONT1 = 0; CONT1 <= 11; CONT1++) {
        System.out.print("Entre o " + (CONT1 + 1) + "o. nome: ");
        A[CONT1] = s.next();
    }

    for (CONT1 = 0; CONT1 <= 10; CONT1++)
        for (CONT2 = CONT1 + 1; CONT2 <= 11; CONT2++)
            if (A[CONT1].compareTo(A[CONT2]) < 0) {
                X = A[CONT1];
                A[CONT1] = A[CONT2];
                A[CONT2] = X;
            }

    System.out.println();

    System.out.print("\nOs nomes em ordem descrecentes são: \n");
    for (CONT1 = 0; CONT1 <= 11; CONT1++) {
        System.out.print(A[CONT1] + "\n");
    }
    System.out.println();
  }
}
