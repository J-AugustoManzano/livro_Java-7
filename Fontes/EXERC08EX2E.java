//Exemplo EXERC08EX2E.java
import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class EXERC08EX2E {
  public static void main(String args[]) {

    int CONT1, CONT2;
    float A[][] = new float[3][3];
    float B[][] = new float[3][3];
    DecimalFormat df = new DecimalFormat();
    Scanner s = new Scanner(System.in);
    
    System.out.println();
    System.out.print("\nEntre com o Arranjo A\n");
    for (CONT1 = 0; CONT1 <= 2; CONT1++) {
        for (CONT2 = 0; CONT2 <= 2; CONT2++) {
            System.out.print("A[" + (CONT1 + 1) + "][" + (CONT2 + 1) + "] ....: ");
            A[CONT1][CONT2] = s.nextFloat();
        }
    }

    System.out.println();

    System.out.print("\nOs elementos alterados do Arranjo A são: \n");
    df.applyPattern("0.00");
    for (CONT1 = 0; CONT1 <= 2; CONT1++) {
        for (CONT2 = 0; CONT2 <= 2; CONT2++) {
            if (CONT1 == CONT2)
                System.out.print(df.format(A[CONT1][CONT2]*2) + "\t");
            else
                System.out.print(df.format(A[CONT1][CONT2]*3) + "\t");
        }
        System.out.println();
    }
    System.out.println();
  }
}
