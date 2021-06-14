//Exemplo EXERC04EX3C.java
import java.io.*;

public class EXERC04EX3C {
  public static void main(String args[]) {

    int NUM;
    
    System.out.println();

    NUM = 0;

    System.out.println();
    System.out.print("\nOs valores impares entre 0 e 20 são:");
    while (NUM <= 20) {
        if (NUM % 2 == 1) {
            System.out.print("\n " + NUM);
        }
        NUM++;
    }
    System.out.println();

  }
}