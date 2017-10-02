/*PRACTICA PARA VER EL TIEMPO DE EJECUCION AL LLENAR UN ARREGLO


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_19_million_dollar_baby;

/**
 *
 * @author 16550477
 */
public class EVA1_19_MILLION_DOLLAR_BABY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Big-OH OH(N)
        int aiMillion[] = new int [200000000];
        for (int i = 0; i < aiMillion.length; i++) { //Llena arreglo
            aiMillion[i] = (int)(Math.random() + 100) + 1;
        }
    }
    
}
