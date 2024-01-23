
package proyectomatrices;

import java.util.Scanner;

/**
 * @author Cristhian Gutierrez
 */
public class ProyectoMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matriz triangulo = new Matriz();
        int altura, op;
        altura=0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("----Menu----");
            System.out.println("1. Triangulo Normal");
            System.out.println("2. Triangulo Invertido");
            System.out.println("3. Salir");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    triangulo.Triangulito(altura);
                    break;
                case 2:
                    triangulo.TriangulitoAlreves(altura);
                    break;
                default:
                    return;
            }
        }
    }

}
