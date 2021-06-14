//Exemplo EXERC04EX4A.java
import java.io.*;

public class EXERC04EX4A {
  public static void main(String args[]) {

    int NUM;
    
    System.out.println();

    NUM = 15;
    
    System.out.println();
    System.out.print("\nNúmero\t\tQuadrado do Número");
    do {
        System.out.print("\n" + NUM + "\t\t" + NUM*NUM);
        NUM++;
    } while (NUM <= 200);
    System.out.println();

  }
}