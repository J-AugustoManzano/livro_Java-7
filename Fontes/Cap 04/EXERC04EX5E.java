//Exemplo EXERC04EX5E.java
import java.io.*;

public class EXERC04EX5E {
  public static void main(String args[]) {

    int NUM, SOMA;
    
    System.out.println();

    SOMA = 0;

    for (NUM = 1; NUM <= 50; NUM++) {
        if (NUM % 2 == 0) {
            SOMA += NUM;
        }
    }
    
    System.out.println();
    System.out.print("\nA soma dos valor dos 50 primeiros números pares  é: " + SOMA);
    System.out.println();

  }
}