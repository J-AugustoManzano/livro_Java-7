//Exemplo EXERC08EX3E.java
import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class EXERC08EX3E {
  public static void main(String args[]) {

    int CONT, ACHA;
    float A[] = new float[10];
    float B[] = new float[10];
    float PESQ;
    String RESP;
    DecimalFormat df = new DecimalFormat();
    Scanner s = new Scanner(System.in);
    
    System.out.println();
    System.out.print("\nEntre com o Arranjo A:\n");
    for (CONT = 0; CONT <= 9; CONT++) {
        System.out.print("A[" + (CONT + 1) + "] ....: ");
        A[CONT] = s.nextFloat();
    }

    for (CONT = 0; CONT <= 9; CONT++)
        B[CONT] = A[CONT] + 2;

    do {
        
        System.out.println();
        System.out.print("Entre o valor a ser pesquisado: ");
        PESQ = s.nextFloat();
        
        CONT = 0;
        ACHA = 0;
        while (CONT <= 9 & ACHA == 0)
            if (PESQ == B[CONT])
                ACHA = 1;
            else
                CONT++;
        
        System.out.println();
        df.applyPattern("0.00");
        if (ACHA == 1)
            System.out.print(df.format(PESQ) + " localizado na posição " + (CONT + 1));
        else
            System.out.print(df.format(PESQ) + " nao foi localizado");
        
        System.out.println();
        System.out.println();
        System.out.println("Continua? [S]im / [N]ao + <Enter>.");
        System.out.print("Ou <Enter> para 'Nao': ");
        RESP = s.next();
        RESP = RESP.toUpperCase();
    } while (RESP.compareTo("S") == 0);
    System.out.println();
  }
}
