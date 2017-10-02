/* USO DE MATRIZ DE 3 DIMENSIONES(CUBO)


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_10_arreglo_multi_3d;

/**
 *
 * @author 16550477
 */
public class EVA1_10_ARREGLO_MULTI_3D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Big-Oh OH(N^3)
        //Cubo (3 dimensiones)
        int aiArreglo3D[][][] = new int[3][3][3];
        //Recorrerlo y llenarlo
        for (int i = 0; i < 3; i++) { //Filas
            for (int j = 0; j < 3; j++) { //Columnas
                for (int k = 0; k < 3; k++) { //Niveles
                    aiArreglo3D[i][j][k] = (int)(Math.random()*100) + 1;
                }
            }
        }
        //Imprimir
        for (int[][] aiArreglo3D1 : aiArreglo3D) {
            for (int[] aiArreglo3D11 : aiArreglo3D1) {
                for (int b : aiArreglo3D11) {
                    System.out.println("[" + b + "]");
                }
            }
        }
    }
    
}
