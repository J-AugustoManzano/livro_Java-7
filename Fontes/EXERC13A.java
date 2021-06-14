//Exemplo EXERC13A.java
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

public class EXERC13A {

  public static void main(String args[]) {

    int CONT;
    int A[] = new int[10];
    Scanner s = new Scanner(System.in);
    
    System.out.println();
    System.out.print("\nEntre com o Arranjo A:\n");
    for (CONT = 0; CONT <= 9; CONT++) {
        System.out.print("A[" + (CONT + 1) + "] ....: ");
        A[CONT] = s.nextInt();
    }

    try {
        FileWriter ARQTEXTO = new FileWriter("DADOS13A.DBC");
        for (CONT = 0; CONT <= 9; CONT++) {
            ARQTEXTO.write(A[CONT] + "\n");
        }
        ARQTEXTO.close();
        System.out.println();
        System.out.print("Arquivo gravado com sucesso!");
    } catch (IOException ioe) {
        System.out.println();
        System.out.print("Arquivo não pode ser gravado!");
    }
    System.out.println();
  }
}
