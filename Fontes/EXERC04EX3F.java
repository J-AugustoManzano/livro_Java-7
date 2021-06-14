//Exemplo EXERC04EX3F.java
import java.io.*;
import java.util.Scanner;

public class EXERC04EX3F {
  public static void main(String args[]) {

    int CONT, NUM, FAT;
    Scanner s = new Scanner(System.in);
    
    CONT = 1;
    FAT = 1;
    
    System.out.println();

    System.out.print("Entre o uma valor inteiro: ");
    NUM = s.nextInt();

    while (CONT <= NUM) {
        FAT *= CONT;
        CONT++;
    }

    System.out.println();
    System.out.print("\nO fatorial de " + NUM + " é: " + FAT);
    System.out.println();

  }
}