/*IMPRIME 1 EN LA DIAGONAL PRINCIPAL DE UNA MATRIZ Y CERO EN EL RESTO


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_22_matriz_diagonal_principal;

/**
 *
 * @author 16550477
 */
public class EVA1_22_MATRIZ_DIAGONAL_PRINCIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Bih-Oh   OH(N^2)
        int aiMatriz[][] = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(i==j){ //Verifica si es parte de la diagonal principal
                    System.out.print("[" + 1 + "]");
                }
                else{
                    System.out.print("[" + 0 + "]");
                }
            }
            System.out.println("");
        }
    }
    
}
