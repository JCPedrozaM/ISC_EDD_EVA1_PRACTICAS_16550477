/*PRACTICA PARA EL MANEJO DE ARREGLOS: LLENADO, COPIADO, IMPRESION


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_arreglos_2;

import java.util.Scanner;

/**
 *
 * @author 16550477
 */
public class EVA1_6_ARREGLOS_2 {

    /**
     */
    public static final int TAMA_ARRE = 5;//Tamaño del arreglo constante. Evita cambiar el tamaño en todas las referencias
    
    public static void main(String[] args) { //Big-Oh OH(N) N=TAMA_ARRE
        int aiEdad[]; 
        aiEdad = new int[TAMA_ARRE];
        Scanner sCaptu = new Scanner(System.in);
        for (int i = 0; i < aiEdad.length; i++) { //lenght da el tamaño del arreglo
            System.out.println("Introduce una edad: ");
            aiEdad[i] = sCaptu.nextInt();
        }
        //Imprimir
        for(int x: aiEdad){
            System.out.println("Edades: " + x);
        }
        //Crear duplicado 
        int aiCopiaEdad[];
        /*aiCopiaEdad = aiEdad;*/ //No crea un duplicado
        aiCopiaEdad = new int[TAMA_ARRE];
        for (int i = 0; i < TAMA_ARRE; i++) {
            aiCopiaEdad[i] = aiEdad[i];
        }
        for(int x: aiCopiaEdad){
            System.out.println("Copia Edad: " + x);
        }
        System.out.println(aiCopiaEdad);
        System.out.println(aiEdad);
        
    }
    
}
