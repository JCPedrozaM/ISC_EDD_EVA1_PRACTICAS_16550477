/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_stack;

/**
 *
 * @author 16550477
 */
public class Principal {

    /**
     * Stack Esto explica el como funciona el stack, al ejecutar el programa se van ejecutando de abajo a arriba y cuando termina
     * se va desde arriba hasta abajo
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Llamando a A");
        A();
        System.out.println("Termino llamada a A");
        
        
    }
    
    public static void A(){
        System.out.println("Llamando a B");
        B();
        System.out.println("Termino llamada a A");
    }
    public static void B(){
        System.out.println("Llamando a C");
        C();
        System.out.println("Termino llamada a C");
    }
    public static void C(){
        System.out.println("Fin del camino");
    }
}
