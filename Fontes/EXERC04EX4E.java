//Exemplo EXERC04EX4E.java
import java.io.*;

public class EXERC04EX4E {
  public static void main(String args[]) {

    int NUM, SOMA;
    
    System.out.println();

    SOMA = 0;
    NUM = 1;

    do {
        if (NUM % 2 == 0) {
            SOMA += NUM;
        }
        NUM++;
    } while (NUM <= 50);
    
    System.out.println();
    System.out.print("\nA soma dos valor dos 50 primeiros números pares  é: " + SOMA);
    System.out.println();

  }
}