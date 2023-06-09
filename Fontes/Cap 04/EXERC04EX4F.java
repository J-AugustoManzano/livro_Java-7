//Exemplo EXERC04EX4F.java
import java.io.*;
import java.util.Scanner;

public class EXERC04EX4F {
  public static void main(String args[]) {

    int CONT, NUM, FAT;
    Scanner s = new Scanner(System.in);
    
    CONT = 1;
    FAT = 1;
    
    System.out.println();

    System.out.print("Entre o uma valor inteiro: ");
    NUM = s.nextInt();

    do {
        FAT *= CONT;
        CONT++;
    } while (CONT <= NUM);

    System.out.println();
    System.out.print("\nO fatorial de " + NUM + " é: " + FAT);
    System.out.println();

  }
}