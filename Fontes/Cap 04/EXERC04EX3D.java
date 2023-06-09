//Exemplo EXERC04EX3D.java
import java.io.*;

public class EXERC04EX3D {
  public static void main(String args[]) {

    int NUM;
    
    System.out.println();

    NUM = 1;

    System.out.println();
    System.out.print("\nOs valores divisiveis por 4 entre 1 e 30 são:");
    while (NUM <= 30) {
        if (NUM % 4 == 0) {
            System.out.print("\n " + NUM);
        }
        NUM++;
    }
    System.out.println();

  }
}