//Exemplo EXERC13B.java
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class EXERC13B {

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
        System.out.print("Arquivo não pode serlido!");
    }
    
    System.out.println();
    System.out.print("\nO Arranjo A:\n");
    System.out.print("A = [ ");
    for (CONT = 0; CONT <= 9; CONT++) {
        if (CONT == 9) {
            System.out.print(A[CONT]);
        } else {
            System.out.print(A[CONT] + ", ");
        }
    }
    System.out.print("]");
    System.out.println();
  }
}
