//Exemplo EXERC04EX3E.java
import java.io.*;

public class EXERC04EX3E {
  public static void main(String args[]) {

    int NUM, SOMA;
    
    System.out.println();

    SOMA = 0;
    NUM = 1;

    while (NUM <= 50) {
        if (NUM % 2 == 0) {
            SOMA += NUM;
        }
        NUM++;
    }
    
    System.out.println();
    System.out.print("\nA soma dos valor dos 50 primeiros números pares  é: " + SOMA);
    System.out.println();

  }
}