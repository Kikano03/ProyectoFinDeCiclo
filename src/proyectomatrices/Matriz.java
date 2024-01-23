package proyectomatrices;

import java.util.Scanner;

/**
 * @author Cristhian Gutierrez
 */
public class Matriz {

    public void Triangulito(int altura) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que tamaño desea que tenga el triangulo?");
        altura = sc.nextInt();
        String[][] triangulito = new String[altura][altura];
        for (int i = 0; i < triangulito.length; i++) {
            for (int j = 0; j < triangulito.length; j++) {
                if (j <= i) {
                    triangulito[i][j] = "* ";
                } else {
                    triangulito[i][j] = "";
                }
            }
        }

        for (int i = 0; i < triangulito.length; i++) {
            for (int j = 0; j < triangulito.length; j++) {
                System.out.print(triangulito[i][j]);
            }
            System.out.println();
        }
    }

    public void TriangulitoAlreves(int altura) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que tamaño desea que tenga el triangulo?");
        altura = sc.nextInt();
        String[][] triangulito = new String[altura][altura];
        for (int i = 0; i < triangulito.length; i++) {
            for (int j = 0; j < triangulito.length; j++) {
                if (j >= i) {
                    triangulito[i][j] = "* ";
                } else {
                    triangulito[i][j] = "  ";
                }
            }
        }

        for (int i = 0; i < triangulito.length; i++) {
            for (int j = 0; j < triangulito.length; j++) {
                System.out.print(triangulito[i][j]);
            }
            System.out.println();
        }
    }
}
