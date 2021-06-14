//Exemplo EXERC08EX3B.java
import java.io.*;
import java.util.Scanner;

public class EXERC08EX3B {
  public static void main(String args[]) {

    int CONT1, CONT2, MEIO, COMECO, FINAL, ACHA, X, PESQ;
    int A[] = new int[8];
    int B[] = new int[8];
    String RESP;
    Scanner s = new Scanner(System.in);
    
    System.out.println();
    System.out.print("\nEntre com o Arranjo A\n");
    for (CONT1 = 0; CONT1 <= 7; CONT1++) {
        System.out.print("A[" + (CONT1 + 1) + "] ....: ");
        A[CONT1] = s.nextInt();
    }

    for (CONT1 = 0; CONT1 <= 7; CONT1++)
        B[CONT1] = 5 * A[CONT1];
    
    for (CONT1 = 0; CONT1 <= 6; CONT1++)
        for (CONT2 = CONT1 + 1; CONT2 <= 7; CONT2++)
            if (B[CONT1] > B[CONT2]) {
                X = B[CONT1];
                B[CONT1] = B[CONT2];
                B[CONT2] = X;
            }

    System.out.println();

    System.out.print("\nOs elementos em ordem crescente do Arranjo B são: ");
    System.out.print("\nB = [ ");
    for (CONT1 = 0; CONT1 <= 7; CONT1++) {
        if (CONT1 == 7) {
            System.out.print(B[CONT1]);
        } else {
            System.out.print(B[CONT1] + ", ");
        }
    }
    System.out.print("]");
    System.out.println();
    
    do {
        
        System.out.println();
        System.out.print("Entre o valor a ser pesquisado: ");
        PESQ = s.nextInt();
        COMECO = 0;
        FINAL = 7;
        MEIO = 0;
        ACHA = 0;
        while (COMECO <= FINAL & ACHA == 0) {
            MEIO = (COMECO + FINAL) / 2;
            if (PESQ == B[MEIO])
                ACHA = 1;
            else
                if (PESQ < B[MEIO])
                    FINAL = MEIO - 1;
                else
                    COMECO = MEIO + 1;
        }
        if (ACHA == 1)
            System.out.print("\n" + PESQ + " está na posição " + (MEIO + 1));
        else
            System.out.print("\n" + PESQ + " não foi localizado");

        System.out.println();
        System.out.println();
        System.out.println("Continua? [S]im / [N]ão + <Enter>.");
        System.out.print("Ou <Enter> para 'Não': ");
        RESP = s.next();
        RESP = RESP.toUpperCase(); 
    
    }  while (RESP.compareTo("S") == 0);
    System.out.println();
  }
}