/* USO DE MATRIZ DE 3 DIMENSIONES(NO CUBICA)


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11_arreglo_multi_referencias;

/**
 *
 * @author 16550477
 */
public class EVA1_11_ARREGLO_MULTI_REFERENCIAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Big-Oh   OH(N^3)
        int aiArray3D[][][] = new int [10][2][7];
        
        System.out.println(aiArray3D.length); //Filas
        System.out.println(aiArray3D[0].length); //Columnas
        System.out.println(aiArray3D[0][0].length); //NIveles
        
        for (int i = 0; i < aiArray3D.length; i++) {
            for (int j = 0; j < aiArray3D[i].length; j++) {
                for (int k = 0; k < aiArray3D[i][j].length; k++) {
                    aiArray3D[i][j][k] = (int)(Math.random() * 100) + 1;
                }
            }
        }
        //Imprimir
        for (int[][] aiArray3D1 : aiArray3D) {
            for (int[] aiArray3D11 : aiArray3D1) {
                for (int b : aiArray3D11) {
                    System.out.println("[" + b + "]");
                }
            }
        }
    }
    
}
