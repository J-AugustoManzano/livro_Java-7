//Exemplo EXERC08EX1D.java
import java.io.*;
import java.util.Scanner;

public class EXERC08EX1D {
  public static void main(String args[]) {

    int CONT, AUX;
    int A[] = new int[5];
    int B[] = new int[10];
    int C[] = new int[15];
    Scanner s = new Scanner(System.in);
    
    System.out.println();
    System.out.print("\nEntre com o Arranjo A\n");
    System.out.print("Tome cuidado para que esse valor seja par\n");
    for (CONT = 0; CONT <= 4; CONT++) {
        System.out.print("A[" + (CONT + 1) + "] ....: ");
        do {
            AUX = s.nextInt();
            if (AUX % 2 != 0) {
                System.out.println();
                System.out.print("O valor do elemento A[" + (CONT + 1) + "] nao é par.\n");
                System.out.print("Entre novamente com o elemento A[" + (CONT + 1) + "] ....: ");
            } 
        } while (AUX % 2 != 0);
        A[CONT] = AUX;
    }

    System.out.println();
    System.out.print("\nEntre com o Arranjo B\n");
    System.out.print("Tome cuidado para que esse valor seja impar\n");
    for (CONT = 0; CONT <= 9; CONT++) {
        System.out.print("A[" + (CONT + 1) + "] ....: ");
        do {
            AUX = s.nextInt();
            if (AUX % 2 != 1) {
                System.out.println();
                System.out.print("O valor do elemento B[" + (CONT + 1) + "] nao é impar.\n");
                System.out.print("Entre novamente com o elemento B[" + (CONT + 1) + "] ....: ");
            } 
        } while (AUX % 2 != 1);
        B[CONT] = AUX;
    }

    for (CONT = 0; CONT <= 4; CONT++)
        C[CONT] = A[CONT];

    for (CONT = 0; CONT <= 9; CONT++)
        C[CONT + 5] = B[CONT];

    System.out.println();

    System.out.print("\nOs elementos do Arranjo C são: ");
    System.out.print("\nC = [ ");
    for (CONT = 0; CONT <= 14; CONT++) {
        if (CONT == 14) {
            System.out.print(C[CONT]);
        } else {
            System.out.print(C[CONT] + ", ");
        }
    }
    System.out.print("]");
    System.out.println();

  }
}
