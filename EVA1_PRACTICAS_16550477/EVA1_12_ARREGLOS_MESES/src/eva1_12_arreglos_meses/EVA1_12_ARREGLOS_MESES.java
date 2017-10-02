/*ARREGLOS PARA IDENTIFICAR CUANTOS DIAS TIENE UN MES ESPECIFICO


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_12_arreglos_meses;

import java.util.Scanner;

/**
 *
 * @author 16550477
 */
public class EVA1_12_ARREGLOS_MESES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String asMeses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre" , "Diciembre"}; //Arreglo definido
        //Días
        int aiDias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //Solicitar el mes al usuario
        int iMes;
        Scanner dato = new Scanner(System.in);
        System.out.println("Número de Mes (1 - 12): ");
        iMes = dato.nextInt();
        System.out.println("El mes es: " + asMeses[iMes - 1] + " y tiene " + aiDias[iMes - 1] + " días");
    }
    
}
