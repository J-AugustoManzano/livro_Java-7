//Exemplo EXERC04EX1A.java
import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class EXERC04EX1A {
  public static void main(String args[]) {

    float TEMPO, VELOCIDADE, DISTANCIA, LITROS_USADOS;
    DecimalFormat df = new DecimalFormat();
    Scanner s = new Scanner(System.in);

    System.out.println();

    System.out.print("Entre com o tempo .......: ");
    TEMPO = s.nextFloat();

    System.out.print("Entre com a velocidade ...: ");
    VELOCIDADE = s.nextFloat();

    DISTANCIA = TEMPO * VELOCIDADE;
    LITROS_USADOS = DISTANCIA / 12;

    df.applyPattern("0.00");
    System.out.print("\nVelocidade ........: " + df.format(VELOCIDADE));
    System.out.print("\nTempo .............: " + df.format(TEMPO));
    System.out.print("\nDistância .........: " + df.format(DISTANCIA));
    System.out.print("\nLitros Usados .....: " + df.format(LITROS_USADOS));

    System.out.println();
  }
}
