/*PRACTICA QUE MUESTRA COMO SE DEBE COPIAR UN OBJETO

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_copia_objetos;

/**
 *
 * @author 16550477
 */
public class EVA1_4_COPIA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        int i = 5;
        System.out.println("i = " + i);
        //Crear copia de i
        int iCopia = i; //Asignamos el valor de i a la variable iCopia
        System.out.println("Copia de i = " + iCopia);
        i++;
        System.out.println("i++ = " + i);
        System.out.println("iCopia = " + iCopia);
        //Declarar un objeto de tipo numero
        Numero nVal = new Numero();//Creamos el objeto
        System.out.println("Valor de nVal.i = " + nVal.i);
        Numero nCopiaVal = nVal;//Creamos un "copia" <---NO ES UNA COPIA
        System.out.println("Valor de nCopiaVal.i = " + nCopiaVal.i);
        nVal.i++;
        //Imprimimos nVal y nCopiaVal
        System.out.println("Valor de nVal.i++ = " + nVal.i);
        System.out.println("Valor de nCopiaVal.i = " + nCopiaVal.i);
        //Imprimir los objetos
        System.out.println(nVal);
        System.out.println(nCopiaVal);
        //Copia real de un objeto
        Numero nCopiaReal = new Numero();
        nCopiaReal.i = nVal.i;
        System.out.println("Valor de nVal.i = " + nVal.i);
        System.out.println("Valor de nCopiaReal.i = " + nCopiaReal.i);
        nVal.i++;
        System.out.println("Valor de nVal.i = " + nVal.i);
        System.out.println("Valor de nCopiaReal.i = " + nCopiaReal.i);
        //Imprimir objetos
        System.out.println(nVal);
        System.out.println(nCopiaReal);
    }
    
}

class Numero{
    public int i = 10;
}
