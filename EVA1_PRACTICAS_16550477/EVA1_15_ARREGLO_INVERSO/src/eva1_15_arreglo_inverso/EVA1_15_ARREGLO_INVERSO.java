/*COPIAR UN ARREGLO DE FORMA INVERSA


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_15_arreglo_inverso;

import java.util.Scanner;

/**
 *
 * @author 16550477
 */
public class EVA1_15_ARREGLO_INVERSO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Big-Oh OH(N)
        System.out.println("Ingresa la cantidad de datos a capturar");
        Scanner dato = new Scanner(System.in);
        int aiArre1[] = new int [dato.nextInt()];
        int aiArreCopia[] = new int [aiArre1.length];
        for (int i = 0; i < aiArre1.length; i++) { //Llenar arreglo original
            System.out.println("Ingresa el dato " + (i+1));
            aiArre1[i] = dato.nextInt();
        }
        int iPos=0; //Posición en la copia
        for (int i = (aiArre1.length - 1); i >=0; i--) { //Recorrer arreglo original de fin a inicio
            aiArreCopia[iPos] = aiArre1[i]; //Copia inversa
            iPos++; //Cambio en la posición de la copia
        }
        for (int i = 0; i < aiArreCopia.length; i++) {
            System.out.println("Copia[" + i + "]: " + aiArreCopia[i]);
        }
    }
    
}
