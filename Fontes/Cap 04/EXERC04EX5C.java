//Exemplo EXERC04EX5C.java
import java.io.*;

public class EXERC04EX5C {
  public static void main(String args[]) {

    int NUM;
    
    System.out.println();

    NUM = 0;

    System.out.println();
    System.out.print("\nOs valores impares entre 0 e 20 são:");
    for (NUM = 0; NUM <= 20; NUM++) {
        if (NUM % 2 == 1) {
            System.out.print("\n " + NUM);
        }
    }
    System.out.println();

  }
}