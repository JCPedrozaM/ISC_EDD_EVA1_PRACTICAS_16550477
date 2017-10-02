/*BUSCAR LA POSICION DE UN VALOR EN UN ARREGLO


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_16_buscar_arreglo;

import java.util.Scanner;

/**
 *
 * @author 16550477
 */
public class EVA1_16_BUSCAR_ARREGLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Big-Oh OH(N)
        System.out.println("Ingresa la cantidad de datos a capturar");
        Scanner dato = new Scanner(System.in);
        int aiArreglo[] = new int [dato.nextInt()];
        for (int i = 0; i < aiArreglo.length; i++) { //Llenar arreglo
            System.out.println("Ingresa el dato " + (i+1));
            aiArreglo[i] = dato.nextInt();
        }
        System.out.println("Ingresa un dato a buscar");
        int iBuscar = dato.nextInt(); //Almacena el dato a buscar
        for (int i = 0; i < aiArreglo.length; i++) {
            if (iBuscar==aiArreglo[i]){ //Compara con el valor que se encuentre en la pisición i
                System.out.println("El valor se encuentra en la posición " + i);
                break; //Deja de buscar
            }
        }
    }
    
}
