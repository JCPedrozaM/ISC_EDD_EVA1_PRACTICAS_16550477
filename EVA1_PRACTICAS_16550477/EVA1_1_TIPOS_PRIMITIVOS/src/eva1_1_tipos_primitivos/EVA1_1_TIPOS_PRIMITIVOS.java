/*PROYECTO INICIAL PARA CONOCER E IDENTIFICAR LOS TIPOS DE DATOS PRIMITIVOS EN JAVA*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_1_tipos_primitivos;

import java.util.Scanner;

/**
 *
 * @author 16550477
 */
public class EVA1_1_TIPOS_PRIMITIVOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String sNom;
        int iEdad;
        double dSal;
        Scanner sScanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        sNom = sScanner.nextLine();
        System.out.println("Introduce tu edad:");
        iEdad = sScanner.nextInt();
        System.out.println("Introduce tu salario:");
        dSal = sScanner.nextDouble();
        
        hacerAlgo(sNom, iEdad, dSal);
    }

    /**
     * Ejemplos comentarios usadno javadoc
     *
     * @param sNombre ejemplo usando String
     * @param iEdad ejemplo usando enteros
     * @param dSalario ejemplo usando doubles
     */
    public static void hacerAlgo(String sNombre, int iEdad, double dSalario) {
        System.out.println(sNombre + " " + iEdad + " " + dSalario);

    }

}
