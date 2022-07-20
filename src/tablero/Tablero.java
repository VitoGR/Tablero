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
        
        /*
         Un niño está jugando a colorear su tablero de ajedrez y va a pintar cada 
        casilla toda de azul o toda de rojo. Para darle un toque personalizado, 
        quiere pintar la misma cantidad de casillas rojas que de azules, pero no 
        quiere que le queden dos columnas con la misma cantidad de casillas rojas 
        pintadas, ni quiere que le queden dos filas con la misma cantidad de 
        casillas rojas pintadas.
        
         ¿Puede lograr pintarlo cumpliendo esas condiciones?
        
         Respuesta: No es posible pintar el tablero siguiendo las condiciones, dado
        que al menos tendria que repetirse una vez las mismas cantidades de casillas
        rojas en las columna. Lo mismo sucede con con las filas.
        
         ¿Y si en vez de un tablero de ajedrez normal de 8x8 fuese un tablero 
        de ajedrez gigante de 1000x1000?
        
         Respuesta: Como se demostró en el caso anterior, no es posible cumplir
        con las condiciones, en una matriz cuadrada (8x8), (1000x1000), etc.
        
         Es importante incluir y detallar el razonamiento y/o programa usado 
        para determinar la respuesta.
        
         Razonamiento: para entender el problema planteado observé el libro de 
        colorear de un niño, después de un rato, concluí que el tablero debía 
        estar pintado de manera diagonal, no tiene que seguir una lógica o tener
        algún tipo de practicidad, como si lo hace un tablero que tiene sus 
        casillas blancas y negras para poder guiarte a la hora de mover tus piezas 
        sobre el mismo.
 
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Sr. usuario ingrese el tamaño de la matriz, recuerde que la misma sera cuadrada"
                + "\nPor ej: si ingresa un (4) la matriz sera de diametro 4x4: ");
        
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
