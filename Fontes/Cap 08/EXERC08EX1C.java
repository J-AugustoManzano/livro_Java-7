//Exemplo EXERC08EX1C.java
import java.io.*;
import java.util.Scanner;

public class EXERC08EX1C {
  public static void main(String args[]) {

    int CONT;
    int A[] = new int[10];
    int B[] = new int[10];
    int C[] = new int[20];
    Scanner s = new Scanner(System.in);
    
    System.out.println();
    System.out.print("\nEntre com o Arranjo A\n");
    for (CONT = 0; CONT <= 9; CONT++) {
        System.out.print("A[" + (CONT + 1) + "] ....: ");
        A[CONT] = s.nextInt();
    }

    System.out.print("\nEntre com o Arranjo B\n");
    for (CONT = 0; CONT <= 9; CONT++) {
        System.out.print("B[" + (CONT + 1) + "] ....: ");
        B[CONT] = s.nextInt();
    }

    for (CONT = 0; CONT <= 9; CONT++)
        C[CONT] = A[CONT];

    for (CONT = 0; CONT <= 9; CONT++)
        C[CONT + 10] = B[CONT];

    System.out.println();

    System.out.print("\nOs elementos do Arranjo C são: ");
    System.out.print("\nC = [ ");
    for (CONT = 0; CONT <= 19; CONT++) {
        if (CONT == 19) {
            System.out.print(C[CONT]);
        } else {
            System.out.print(C[CONT] + ", ");
        }
    }
    System.out.print("]");
    System.out.println();

  }
}
