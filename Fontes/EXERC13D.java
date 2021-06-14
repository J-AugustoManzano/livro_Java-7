//Exemplo EXERC13D.java
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

public class EXERC13D {

  public static void main(String args[]) {

    int CONT = 0;
    int A[] = new int[10];
    int B[] = new int[10];
    int C[] = new int[10];
    String ST;
    Scanner s = new Scanner(System.in);

    System.out.print("\nEntre com o Arranjo A\n");
    for (CONT = 0; CONT <= 9; CONT++) {
        System.out.print("Entre com o elemento A[" + (CONT + 1) + "] ....: ");
        A[CONT] = s.nextInt();
    }

    for (CONT = 0; CONT <= 9; CONT++) {
		B[CONT] = 2 * A[CONT];
    }

    try {
        FileWriter ARQTEXTO = new FileWriter("DADOS13F.DBC");
        for (CONT = 0; CONT <= 9; CONT++) {
            ARQTEXTO.write(B[CONT] + "\n");
        }
        ARQTEXTO.close();
        System.out.println();
        System.out.print("Arquivo gravado com sucesso!");
    } catch (IOException ioe) {
        System.out.println();
        System.out.print("Arquivo não pode ser gravado!");
    }

    System.out.println();
    CONT = 0;
    try	{
        BufferedReader IN = new BufferedReader(new FileReader("DADOS13F.DBC"));
        while ((ST = IN.readLine()) != null){
            C[CONT] = Integer.parseInt(ST);
            CONT ++;
        }
        IN.close();
        System.out.println();
        System.out.print("Arquivo lido com sucesso!");
    } catch (IOException ioe) {
        System.out.print("Arquivo não pode ser lido!");
    }

    System.out.println();
    System.out.print("\nO Arranjo C\n");
    System.out.print("C = [ ");
    for (CONT = 0; CONT <= 9; CONT++) {
        if (CONT == 9) {
            System.out.print(C[CONT]);
        } else {
            System.out.print(C[CONT] + ", ");
        }
    }
    System.out.print("]");
    System.out.println();
  }
}
