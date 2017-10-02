/*CALCULAR LA CANTIDAD DE VECES QUE SE REPITE UN VALOR EN UN ARREGLO


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_17_repite_arreglo;

import java.util.Scanner;

/**
 *
 * @author 16550477
 */
public class EVA1_17_REPITE_ARREGLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Big-Oh OH(N)
        System.out.println("Ingresa la cantidad de datos a capturar");
        Scanner dato = new Scanner(System.in);
        int aiArreglo[] = new int[dato.nextInt()];
        for (int i = 0; i < aiArreglo.length; i++) { //Llenar arreglo
            System.out.println("Ingresa un dato");
            aiArreglo[i] = dato.nextInt();
        }
        int iAcum = 0; //Almacena la cantidad de datos repetidos
        System.out.println("Ingresa un dato a buscar");
        int iDato = dato.nextInt(); // Almacena dato a buscar
        for (int i = 0; i < aiArreglo.length; i++) {
            if (aiArreglo[i] == iDato) { //Compara el valor de cada posición con el valor buscado
                iAcum++; //Acumula la cantidad de veces que se encuentra el dato buscado
            }
        }
        System.out.println("La cantidad de datos iguales es: " + iAcum);
    }
}
