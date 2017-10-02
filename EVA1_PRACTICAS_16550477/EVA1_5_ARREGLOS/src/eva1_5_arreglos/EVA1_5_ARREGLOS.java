/*PRACTICA DE INTRODUCCION A LOS ARREGLOS: COMO DECLARARLOS


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_arreglos;

/**
 *
 * @author 16550477
 */
public class EVA1_5_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Big-Oh OH(N) N=datos en aiMisNume
        int aiMisNume[] = new int [10];
        for (int i = 0; i < 10; i++) {
            aiMisNume[i] = (int)(Math.random() * 10) + 1;
        }
        //for each
        for(int x : aiMisNume){//int x; for(int i=0; i<10; i++
            System.out.println("x = " + x);
        }
        //Multiples Arreglos
        int[] aiArreglo1, aiArreglo2, aiArreglo3;//Todos son Arreglos
        aiArreglo1 = new int[3];
        aiArreglo2 = new int [10];
        aiArreglo3 = new int[100];
        
        //Arreglos y variables
        int aiArre[], iVar, iVar2;//Solo aiArre es Arreglo
        aiArre = new int[10];
        iVar = 10;
        iVar=30;
    }
    
}
