//Exemplo EXERC13C.java
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class EXERC13C {

  public static void main(String args[]) {

    int CONT = 0;
    int A[] = new int[10];

    String ST;
    try	{
        BufferedReader IN = new BufferedReader(new FileReader("DADOS13A.DBC"));
        while ((ST = IN.readLine()) != null){
            A[CONT] = Integer.parseInt(ST);
            CONT ++;
        }
        IN.close();
        System.out.println();
        System.out.print("Arquivo lido com sucesso!");
    } catch (IOException ioe) {
        System.out.print("Arquivo n�o pode serlido!");
    }

    System.out.println();
    System.out.print("\nO Arranjo A:\n");
    for (CONT = 0; CONT <= 9; CONT++) {
        if ((A[CONT] % 2) == 0) {
            System.out.print("O valor: " + A[CONT] + " está na posição: " + (CONT + 1) + "\n");
        }
    }
    System.out.println();
  }
}
