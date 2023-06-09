//Exemplo EXERC04EX5F.java
import java.io.*;
import java.util.Scanner;

public class EXERC04EX5F {
  public static void main(String args[]) {

    int CONT, NUM, FAT;
    Scanner s = new Scanner(System.in);
    
    FAT = 1;
    
    System.out.println();

    System.out.print("Entre o uma valor inteiro: ");
    NUM = s.nextInt();

    for (CONT = 1; CONT <= NUM; CONT++) {
        FAT *= CONT;
    }

    System.out.println();
    System.out.print("\nO fatorial de " + NUM + " é: " + FAT);
    System.out.println();

  }
}