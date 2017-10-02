/*DETERMINA LA MEDIA, MODA Y DESVISION ESTANDAR DE LAS EDADES DE UN GRUPO


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_21_medidas_centralizacion;

import java.util.Scanner;

/**
 *
 * @author 16550477
 */
public class EVA1_21_MEDIDAS_CENTRALIZACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Big-Oh   OH(N)
        int aiEdades[] ;
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de edades");
        aiEdades = new int[dato.nextInt()];
        for (int i = 0; i < aiEdades.length; i++) { //Llenar edades
            System.out.println("Ingresa una edad");
            aiEdades[i] = dato.nextInt();
        }
        
        //Calcular media
        int iSuma=0, iMedia;
        for (int aiEdade : aiEdades) {
            iSuma+=aiEdade;
            
        }
        iMedia=iSuma/aiEdades.length;
        System.out.println("El promedio es: " + iMedia);
        
        //Calcular moda
        int iModa=0,iContM=0,iCont;
        for (int i = 0; i < aiEdades.length; i++) { //Valor pivote
            iCont=0;
            for (int j = 0; j < aiEdades.length; j++) { //Comparar Pivote con los valores del arreglo
                if(aiEdades[i]==aiEdades[j]){
                    iCont++;
                }
            }
            if(iCont>iContM){
                iContM=iCont;
                iModa=aiEdades[i];
            }
            if(iContM>aiEdades.length-iContM)break;
        }
        System.out.println("Moda: " + iModa);
        //Calcular desviación estandar
        iSuma=0;
        for (int i = 0; i < aiEdades.length; i++) {
            iSuma+= Math.pow(aiEdades[i]-iMedia,2 );
        }
        System.out.println("Desviación estandar: " + (Math.sqrt(iSuma/aiEdades.length)));
    }
    
}
