//Exemplo EXERC04EX2C.java
import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class EXERC04EX2C {
  public static void main(String args[]) {


    float NOTA1, NOTA2, NOTA3, NOTA4, MEDIA;
    DecimalFormat df = new DecimalFormat();
    Scanner s = new Scanner(System.in);
    
    System.out.println();

    System.out.print("Entre com a nota 1: ");
    NOTA1 = s.nextFloat();

    System.out.print("Entre com a nota 2: ");
    NOTA2 = s.nextFloat();

    System.out.print("Entre com a nota 3: ");
    NOTA3 = s.nextFloat();

    System.out.print("Entre com a nota 4: ");
    NOTA4 = s.nextFloat();

    MEDIA = (NOTA1 + NOTA2 + NOTA3 + NOTA4)/4;
    
    System.out.println();
    df.applyPattern("0.0");
    if (MEDIA > 5.0) {
        System.out.print("\nAluno está APROVADO com média: " + df.format(MEDIA);
    } else {
        System.out.print("\nAluno está REPROVADO com média: " + df.format(MEDIA);
    }
    System.out.println();

  }
}
