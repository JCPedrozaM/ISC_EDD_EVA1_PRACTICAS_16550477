/* PROGRAMA QUE DETERMINA SI UN NUMERO ES PRIMO


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_20_primos;

import java.util.Scanner;

/**
 *
 * @author 16550477
 */
public class EVA1_20_PRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Big-Oh OH(N.raiz)
        Scanner dato = new Scanner(System.in);
        System.out.println("Introduce el número a analizar");
        int iSeraPrimo = dato.nextInt(); //Número a analizar
        for (int i = 2; i < Math.sqrt(iSeraPrimo); i++) {
            if (iSeraPrimo%i == 0 ) { //Comprueba si es divisible por algún número que no sea él
                System.out.println("El número no es primo");
                break;
            }
            else{
                System.out.println("El número es primo");
                break;
            }
        }
    }
    
}
