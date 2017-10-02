/*HOLA MUNDO CON METODO STATIC


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_2_static;

/**
 *
 * @author 16550477
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MiClasePrueba mpcObjeto = new MiClasePrueba();
        mpcObjeto.imprimirMensaje();
        System.out.println(mpcObjeto.sNom);
        MiClasePrueba2.sNom = "RUBEN AKOEFJ"; //Se pueden modificar los static
        MiClasePrueba2.imprimirMensaje();
        System.out.println(MiClasePrueba2.sNom);
    }
    
}

class MiClasePrueba{
    public String sNom = "Ruben";
    public void imprimirMensaje(){
        System.out.println("Hola Mundo!!");
    }
}
class MiClasePrueba2{
    public static String sNom = "Ruben";
    public static void imprimirMensaje(){
        System.out.println("Hola Mundo!!");
        
    }
}