//Exemplo EXERC04EX2H.java
import java.io.*;
import java.math.*;
import java.util.Scanner;

public class EXERC04EX2H {
  public static void main(String args[]) {

    int A, B, C, D, E, MAIOR, MENOR;
    Scanner s = new Scanner(System.in);
    
    System.out.println();

    System.out.print("Entre com <A>: ");
    A = s.nextInt();

    System.out.print("Entre com <B>: ");
    B = s.nextInt();

    System.out.print("Entre com <C>: ");
    C = s.nextInt();

    System.out.print("Entre com <D>: ");
    D = s.nextInt();

    System.out.print("Entre com <E>: ");
    E = s.nextInt();

    if (A > B) {
        if (A > C) {
           if (A > D) {
               if (A > E){
                   MAIOR = A;
               } else {
                   MAIOR = E;
               }
           } else {
               if (D > E) {
                   MAIOR = D;
               } else {
                   MAIOR = E;
               }
           }
        } else {
           if (C > D) {
               if (C > E){
                   MAIOR = C;
               } else {
                   MAIOR = E;
               }
           } else {
               if (D > E) {
                   MAIOR = D;
               } else {
                   MAIOR = E;
               }
           }
        }
    } else {
        if (B > C) {
           if (B > D) {
               if (B > E){
                   MAIOR = B;
               } else {
                   MAIOR = E;
               }
           } else {
               if (D > E) {
                   MAIOR = D;
               } else {
                   MAIOR = E;
               }
           }
        } else {
           if (C > D) {
               if (C > E){
                   MAIOR = C;
               } else {
                   MAIOR = E;
               }
           } else {
               if (D > E) {
                   MAIOR = D;
               } else {
                   MAIOR = E;
               }
           }
        }
    }

    if (A < B) {
        if (A < C) {
           if (A < D) {
               if (A < E){
                   MENOR = A;
               } else {
                   MENOR = E;
               }
           } else {
               if (D < E) {
                   MENOR = D;
               } else {
                   MENOR = E;
               }
           }
        } else {
           if (C < D) {
               if (C < E){
                   MENOR = C;
               } else {
                   MENOR = E;
               }
           } else {
               if (D < E) {
                   MENOR = D;
               } else {
                   MENOR = E;
               }
           }
        }
    } else {
        if (B < C) {
           if (B < D) {
               if (B < E){
                   MENOR = B;
               } else {
                   MENOR = E;
               }
           } else {
               if (D < E) {
                   MENOR = D;
               } else {
                   MENOR = E;
               }
           }
        } else {
           if (C < D) {
               if (C < E){
                   MENOR = C;
               } else {
                   MENOR = E;
               }
           } else {
               if (D < E) {
                   MENOR = D;
               } else {
                   MENOR = E;
               }
           }
        }
    }
    System.out.println();
    System.out.print("\nO maior valor é: " + MAIOR);
    System.out.print("\nO menor valor é: " + MENOR);
    System.out.println();

  }
}
