/* ALMACENAR EN UNA MATRIZ LA MULTIPLICACION DE LA MISMA POSICION DE OTRAS DOS MATRICES


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_24_multiplicacion_matrices;

/**
 *
 * @author 16550477
 */
public class EVA1_24_MULTIPLICACION_MATRICES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Big-Oh   OH(N^2)
        double adMatriz1[][] = new double [5][5];
        double adMatriz2[][] = new double [5][5];
        //LLenar matrices e imprimir
        System.out.println("Matriz 1");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                adMatriz1[i][j] = Math.random()*100 +1;
                System.out.print("[" + adMatriz1[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("Matriz 2");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                adMatriz2[i][j] = Math.random()*100 +1;
                System.out.print("[" + adMatriz2[i][j] + "]");
            }
            System.out.println("");
        }
        //Multiplicar Matrices
        double adMatrizMulti[][] = new double [5][5];
        System.out.println("Matriz Multiplicación");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                adMatrizMulti[i][j] = adMatriz1[i][j] * adMatriz2[i][j];
                System.out.print("[" + adMatrizMulti[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}
