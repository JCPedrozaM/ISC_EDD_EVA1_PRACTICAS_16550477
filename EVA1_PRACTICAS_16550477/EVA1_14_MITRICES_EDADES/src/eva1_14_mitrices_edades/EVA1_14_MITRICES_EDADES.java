/*PROMEDIO DE EDAD DE DIFERENTES GRUPOS (TODOS ALMACENADOS EN UNA MATRIZ)


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_14_mitrices_edades;

import java.util.Scanner;

/**
 *
 * @author 16550477
 */
public class EVA1_14_MITRICES_EDADES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Big-Oh OH(N^2)
        System.out.println("Ingrese la cantidad de grupos");
        Scanner dato = new Scanner(System.in);
        int iGrupos = dato.nextInt();
        int aaGrupos[][] = new  int [iGrupos][]; //Dimensionar con la cantidad de grupos
        for (int i = 0; i < iGrupos; i++) {
            System.out.println("Ingrese la cantidad de alumnos del grupo " + (i+1));
            aaGrupos[i] = new int[dato.nextInt()]; //Dimensionar los alumnos de cada grupo
        }
        for (int i = 0; i < iGrupos; i++) {
            for (int j = 0; j < aaGrupos[i].length; j++) {
                System.out.println("Ingrese la edad de un alumno del grupo " + (i+1));
                aaGrupos[i][j] = dato.nextInt(); //Se llenan los campos con la edades de cada alumno (por grupo)
            }
        }
        int iAcum;
        for (int i = 0; i < iGrupos; i++) {
            iAcum=0;
            for (int j = 0; j < aaGrupos[i].length; j++) {
                iAcum+=aaGrupos[i][j]; //Se suman las edades por grupo
            }
            System.out.println("Promedio del grupo "  + (i+1) + " es: " + iAcum/aaGrupos[i].length); //Se calcula e imprime el promedio de cada grupo
        }
    }
    
}
