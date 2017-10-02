/*CREA UNA COPIA INVERSA DE UNA MATRIZ


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_23_matriz_inversa;

/**
 *
 * @author 16550477
 */
public class EVA1_23_MATRIZ_INVERSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Big-Oh   OH(N^2)
        int aiMatriz[][] = new int [5][5];
        System.out.println("Matriz original");
        for (int i = 0; i < 5; i++) { //Llena matriz original e imprime
            for (int j = 0; j < 5; j++) {
                aiMatriz[i][j] = (int)(Math.random()*100)+1;
                System.out.print("[" + aiMatriz[i][j] + "]");
            }
            System.out.println("");
        }
        
        //Invertir Matriz
        int aiMatrizI[][] = new int[5][5];
        System.out.println("Matriz inverso");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                aiMatrizI[i][j] = aiMatriz[4-i][4-j]; //Almacena el valor de la posición contraria a la matriz original
                System.out.print("[" + aiMatrizI[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}
