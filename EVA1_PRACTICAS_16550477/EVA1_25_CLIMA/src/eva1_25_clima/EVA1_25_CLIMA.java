/* BASE DE DATOS DEL CLIMA DE CHIHUAHUA


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_25_clima;

import java.util.Scanner;

/**
 *
 * @author 16550477
 */
public class EVA1_25_CLIMA {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        //Matriz llenada al momento de dimensionar
        double [][] aaMatriz = {{30.0,32.0,34.0,38.8,39.6,41.4,41.6,39.2,39.0,35.0,34.6,29.0,41.6},{18.1,21.2,24.2,27.9,32.2,34.0,32.1,30.3,29.2,26.8,21.9,18.2,26.3},
                               {10.0,12.9,15.7,19.2,23.6,26.3,25.6,24.3,22.6,18.7,13.7,10.3,18.6},{2.0,4.5,7.1,10.4,14.9,18.6,19.1,18.2,16.0,10.7,5.5,2.4,10.8},
                               {-12.8,-18.0,-5.8,-3.4,3.8,6.1,10.6,10.0,3.7,-2.4,-6.1,-11.5,-18.0},{9.9,3.7,7.7,12.9,26.1,34.7,94.7,89.3,66.4,21.6,8.7,9.9,385.7},
                               {2.5,1.6,1.5,2.5,4.0,6.7,11.4,12.0,8.0,4.0,2.0,2.3,58.4},{0.30,0.18,0.09,0.09,0.00,0.00,0.00,0.00,0.00,0.00,0.50,0.88,2.04},
                               {55,49,39,37,37,42,53,61,61,56,55,57,50},{185,204,254,278,299,273,240,242,229,238,191,174,2807}};
        int iPosi, iPosj;
        System.out.println("Base de datos clima Chihuahua");
        System.out.println("Ingresa el número de lo que desees ver");
        System.out.println("1. Record de temperatura más alta (ºC)");
        System.out.println("2. Promedio temperatura más alta (ºC)");
        System.out.println("3. Media diaria (ºC)");
        System.out.println("4. Promedio temperatura más baja (ºC)");
        System.out.println("5. Record de temperatura más baja (ºC)");
        System.out.println("6. Promedio de lluvia (mm)");
        System.out.println("7. Promedio de días lluviosos (>=0.1mm)");
        System.out.println("8. Promnedio días nevados");
        System.out.println("9. Promedio de humedad relativa(%)");
        System.out.println("10. Media mensual hora de luz solar");
        
        Scanner dato = new Scanner(System.in);
        iPosi = dato.nextInt()-1;
        
        System.out.println("Ingresa el número del mes que deseas ver o 13 si deseas ver el año");
        iPosj = dato.nextInt()-1;
        
        System.out.println("Resultado de la busqueda: " + aaMatriz[iPosi][iPosj]);
    }
    
}
