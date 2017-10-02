/*COMO SE DESTRUYE UN OBJETO


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_7_killing_objects;

/**
 *
 * @author 16550477
 */
public class EVA1_7_KILLING_OBJECTS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Prueba pObj = new Prueba();
        pObj = null; //Así se destruye un objeto en java
    }
    
}

class Prueba{
    
}