//Exemplo EXERC04EX4B.java
import java.io.*;

public class EXERC04EX4B {
  public static void main(String args[]) {

    int NUM, SOMA;
    
    System.out.println();

    SOMA = 0;
    NUM = 1;

    do {
        SOMA += NUM;
        NUM++;
    } while (NUM <= 100);
    
    System.out.println();
    System.out.print("\nO valor da soma dos 100 primeiros números é: " + SOMA);
    System.out.println();

  }
}