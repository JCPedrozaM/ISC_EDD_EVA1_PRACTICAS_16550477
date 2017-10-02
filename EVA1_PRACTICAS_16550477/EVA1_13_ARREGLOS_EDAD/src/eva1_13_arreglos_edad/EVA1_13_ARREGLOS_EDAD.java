/*PROMEDIO DE EDAD DE UN GRUPO


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_13_arreglos_edad;

import java.util.Scanner;

/**
 *
 * @author 16550477
 */
public class EVA1_13_ARREGLOS_EDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Big-OH OH(N) N=número de alumnos
        //Preguntar cuantas edades
        Scanner dato = new Scanner(System.in);
        System.out.println("¿Cuantas edades se van a capturar?");
        int iCant = dato.nextInt(); //Cantidad a capturar
        //Inicializar arreglo
        int aiEdades[] = new int[iCant];
        //Capturar
        for (int i = 0; i < iCant; i++) {
            System.out.println("Ingresa una edad");
            aiEdades[i] = dato.nextInt();
        }
        //Calcular promedio
        int iAcum = 0;
        for (int iVal : aiEdades) {
            iAcum += iVal;
        }
        double dProm = iAcum/iCant;
        System.out.println("El promedio de edad es: " + dProm);
    }
    
}
