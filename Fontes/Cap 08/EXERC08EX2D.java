//Exemplo EXERC08EX2D.java
import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class EXERC08EX2D {
  public static void main(String args[]) {

    int CONT1, CONT2;
    float A[][] = new float[4][4];
    DecimalFormat df = new DecimalFormat();
    Scanner s = new Scanner(System.in);
    
    System.out.println();
    System.out.print("\nEntre com o Arranjo A\n");
    for (CONT1 = 0; CONT1 <= 3; CONT1++) {
        for (CONT2 = 0; CONT2 <= 3; CONT2++) {
            System.out.print("A[" + (CONT1 + 1) + "][" + (CONT2 + 1) + "] ....: ");
            A[CONT1][CONT2] = s.nextFloat();
        }
    }

    System.out.println();

    System.out.print("\nOs elementos da diagonal do Arranjo C são: \n");
    df.applyPattern("0.00");
    System.out.print("\n[ ");
    for (CONT1 = 0; CONT1 <= 3; CONT1++) {
        if (CONT1 == 3) {
            System.out.print(df.format(A[CONT1][CONT1]));
        } else {
            System.out.print(df.format(A[CONT1][CONT1]) + ", ");
        }
    }
    System.out.print("]");
    System.out.println();
  }
}
