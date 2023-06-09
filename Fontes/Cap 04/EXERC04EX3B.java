//Exemplo EXERC04EX3B.java
import java.io.*;

public class EXERC04EX3B {
  public static void main(String args[]) {

    int NUM, SOMA;
    
    System.out.println();

    SOMA = 0;
    NUM = 1;

    while (NUM <= 100) {
        SOMA += NUM;
        NUM++;
    }
    
    System.out.println();
    System.out.print("\nO valor da soma dos 100 primeiros números é: " + SOMA);
    System.out.println();

  }
}