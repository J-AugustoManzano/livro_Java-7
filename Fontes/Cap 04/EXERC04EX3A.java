//Exemplo EXERC04EX3A.java
import java.io.*;

public class EXERC04EX3A {
  public static void main(String args[]) {

    int NUM;
    
    System.out.println();

    NUM = 15;
    
    System.out.println();
    System.out.print("\nNúmero\t\tQuadrado do Número");
    while (NUM <= 200) {
        System.out.print("\n" + NUM + "\t\t" + NUM*NUM);
        NUM++;
    }
    System.out.println();

  }
}