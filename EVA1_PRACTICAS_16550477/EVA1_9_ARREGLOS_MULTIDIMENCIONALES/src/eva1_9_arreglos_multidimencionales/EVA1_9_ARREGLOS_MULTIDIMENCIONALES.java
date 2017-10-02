/* INTRODUCCION A MATRICES Y USO DEL FOR EACH


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_9_arreglos_multidimencionales;

/**
 *
 * @author 16550477
 */
public class EVA1_9_ARREGLOS_MULTIDIMENCIONALES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Big-Oh OH(N^2)
        //Arreglos multidimencionales arreglos de arreglos
        //Matriz de 2x2 dimensiones
        int aiMatriz[][] = new int[2][2]; //4 enteros
        //llenar con valores aleatorios
        //for para filas
        //for para columnas
        for (int i = 0; i < 2; i++) { //recorre filas
            for (int j = 0; j < 2; j++) { //recorre columnas
                aiMatriz[i][j] = (int)(Math.random() * 10) + 1;
            }
        }
        for (int i = 0; i < 2; i++) { //recorre filas
            for (int j = 0; j < 2; j++) { //recorre columnas
                System.out.print("[" + aiMatriz[i][j] + "]");
            }
            System.out.println("");
        }
        //Usando for each
        for (int[] aiMatriz1 : aiMatriz) { //Recorre cada fila y regresa un arreglo
            for (int b : aiMatriz1) { //Recorre cada columna y regresa un entero
                System.out.print("[" + b + "]");
            }
            System.out.println("");
        }
    }
    
}
