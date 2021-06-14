//Exemplo EXERC13E.java
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class EXERC13E {

  public static void main(String args[]) {

    int CONT = 0, SOMA = 0;
    int X[] = new int[10];
    String ST;
    try	{
        BufferedReader IN = new BufferedReader(new FileReader("DADOS13F.DBC"));
        while ((ST = IN.readLine()) != null) {
            X[CONT] = Integer.parseInt(ST);
            CONT ++;
        }
        IN.close();
        System.out.println();
        System.out.print("Arquivo lido com sucesso!");
    } catch (IOException ioe) {
        System.out.print("Arquivo não pode serlido!");
    }

    System.out.println();
    for (CONT = 0; CONT <= 9; CONT++) {
        if (X[CONT] % 2 == 0) {
            SOMA += X[CONT];
        }
    }
    
    System.out.print("\nA soma de todos os valores pares e ...: " + SOMA);
    System.out.println();
  }
}
