//Exemplo EXERC04EX5B.java
import java.io.*;

public class EXERC04EX5B {
  public static void main(String args[]) {

    int NUM, SOMA;
    
    System.out.println();

    SOMA = 0;

    for (NUM = 1; NUM <= 100; NUM++) {
        SOMA += NUM;
    }
    
    System.out.println();
    System.out.print("\nO valor da soma dos 100 primeiros números é: " + SOMA);
    System.out.println();

  }
}