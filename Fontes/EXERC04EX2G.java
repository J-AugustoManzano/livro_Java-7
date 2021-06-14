//Exemplo EXERC04EX2G.java
import java.io.*;
import java.util.Scanner;

public class EXERC04EX2G {
  public static void main(String args[]) {

    int A;
    Scanner s = new Scanner(System.in);
    
    System.out.println();

    System.out.print("Entre com um valor inteiro: ");
    A = s.nextInt();

    System.out.println();
    if (A >= 1 && A <= 9) {
        System.out.print("\nO valor " + A + " está dentro da faixa de 1 a 9");
    } else {
        System.out.print("\nO valor " + A + " está fora da faixa de 1 a 9");
    }
    System.out.println();

  }
}