/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablero;

import java.util.Scanner;

public class Tablero {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Sr. usuario ingrese el tamaño de la matriz, recuerde que la misma sera cuadrada"
                + "Por ej: si ingresa un (4) la matriz sera de diametro 4x4");
        int diametro = sc.nextInt();
        int contadorRojo = 0, contadorAzul = 0;
        String Azul = "A", Rojo = "R";

        String Ajedrez[][] = new String[diametro][diametro];
        int n = 0;
        for (int i = 0; i < diametro; i++) {
            for (int j = 0; j < diametro; j++) {
                if (j != n & j > n) {
                    Ajedrez[i][j] = Azul;

                } else {
                    Ajedrez[i][j] = Rojo;
                }
                if (j == diametro - 1 & i == diametro - 1) {
                    Ajedrez[i][j] = "R";
                }
                if (Ajedrez[i][j].equals("A")) {
                    contadorAzul++;
                } else {
                    contadorRojo++;
                }

            }
            n += 1;
        }

        System.out.println("Casillas azules es igual a: " + contadorAzul
                + "\nCasillas rojas es igual a: " + contadorRojo);

        for (int i = 0; i < diametro; i++) {
            for (int j = 0; j < diametro; j++) {
                if (Ajedrez[i][j].equals("R")) {
                    System.out.print("" + ANSI_RED + Ajedrez[i][j] + ANSI_RED);
                } else {
                    System.out.print("" + ANSI_BLUE + Ajedrez[i][j] + ANSI_BLUE);
                }

            }
            System.out.println("");
        }

    }

}
