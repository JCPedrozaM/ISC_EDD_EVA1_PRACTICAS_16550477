/*CALCULAR EL VALOR MAX Y MIN DE UN ARREGLO


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_18_min_max_arreglo;

import java.util.Scanner;

/**
 *
 * @author 16550477
 */
public class EVA1_18_MIN_MAX_ARREGLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Big-Oh OH(N)
        System.out.println("Ingresa la cantidad de datos a capturar");
        Scanner dato = new Scanner(System.in);
        int aiArreglo[] = new int [dato.nextInt()];
        for (int i = 0; i < aiArreglo.length; i++) { //Llenar arreglo
            System.out.println("Ingresa un dato");
            aiArreglo[i] = dato.nextInt();
        }
        int iMin, iMax;
        iMin= aiArreglo[0]; //Almacena el valor de la posición 0 para usarlo de pívote
        iMax = aiArreglo[0];// ""
        for (int i = 0; i < aiArreglo.length; i++) {
            if(aiArreglo[i] >iMax){ //Compara si el valor de la posición es mayor al último máximo almacenado
                iMax = aiArreglo[i];
            }
            if(aiArreglo[i]< iMin){ //Compara si el valor de la posición es mayor al último mínimo almacenado
                iMin = aiArreglo[i];
            }
        }
        System.out.println("El valor minimo es: " + iMin);
        System.out.println("El valor maximos es: " + iMax);
    }
    
}
