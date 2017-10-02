/*USO DE ARREGLOS DE OBJETOS Y COMO COPIARLOS


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_8_array_objetos;

/**
 *
 * @author 16550477
 */
public class EVA1_8_ARRAY_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Big-Oh OH(N) N=número de alumnos
        Alumno aaDatosAlumno[];//El identificador es nulo 
        aaDatosAlumno = new Alumno[10]; //Creamos un arreglo de 10 alumnos
        for (int i = 0; i < aaDatosAlumno.length; i++) {
            aaDatosAlumno[i] = new Alumno("Carlos", "16550477", 0);
        }
        
        for (Alumno aaDatosAlumno1 : aaDatosAlumno) {
            System.out.println("Nombre: " + aaDatosAlumno1.getsNom());
            System.out.println("Matricula: " + aaDatosAlumno1.getsMatricula());
            System.out.println("Carrera: " + aaDatosAlumno1.getiCarrera());
        }
        
        //Crear copia del arreglo
        Alumno aaCopiaAlumno[];
        aaCopiaAlumno = new Alumno[10];
        for (int i = 0; i < aaCopiaAlumno.length; i++) {
            aaCopiaAlumno[i] = new Alumno(aaDatosAlumno[i].getsNom(),aaDatosAlumno[i].getsMatricula(), aaDatosAlumno[i].getiCarrera());
        }
        for (Alumno aaCopiaAlumno1 : aaCopiaAlumno) {
            System.out.println("Nombre: " + aaCopiaAlumno1.getsNom());
            System.out.println("Matricula: " + aaCopiaAlumno1.getsMatricula());
            System.out.println("Carrera: " + aaCopiaAlumno1.getiCarrera());
        }
        
        }
    }
    


class Alumno{
    private String sNom;
    private String sMatricula;
    private int iCarrera;

    public Alumno(String sNom, String sMatricula, int iCarrera) {
        this.sNom = sNom;
        this.sMatricula = sMatricula;
        this.iCarrera = iCarrera; //0 = Sistemas
        
    }

    public String getsNom() {
        return sNom;
    }

    public void setsNom(String sNom) {
        this.sNom = sNom;
    }

    public String getsMatricula() {
        return sMatricula;
    }

    public void setsMatricula(String sMatricula) {
        this.sMatricula = sMatricula;
    }

    public int getiCarrera() {
        return iCarrera;
    }

    public void setiCarrera(int iCarrera) {
        this.iCarrera = iCarrera;
    }
    
    
}