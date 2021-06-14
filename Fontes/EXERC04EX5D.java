//Exemplo EXERC04EX5D.java
import java.io.*;

public class EXERC04EX5D {
  public static void main(String args[]) {

    int NUM;
    
    System.out.println();

    NUM = 1;

    System.out.println();
    System.out.print("\nOs valores divisiveis por 4 entre 1 e 30 são:");
    for (NUM = 1; NUM <= 30; NUM++) {
        if (NUM % 4 == 0) {
            System.out.print("\n " + NUM);
        }
    }
    System.out.println();

  }
}