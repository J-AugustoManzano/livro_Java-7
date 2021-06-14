//Exemplo EXERC04EX4C.java
import java.io.*;

public class EXERC04EX4C {
  public static void main(String args[]) {

    int NUM;
    
    System.out.println();

    NUM = 0;

    System.out.println();
    System.out.print("\nOs valores impares entre 0 e 20 são:");
    do {
        if (NUM % 2 == 1) {
            System.out.print("\n " + NUM);
        }
        NUM++;
    } while (NUM <= 20);
    System.out.println();

  }
}