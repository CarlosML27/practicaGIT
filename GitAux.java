/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prgitejemplo;

/**
 *
 * @author CarlosML27
 */
public class GitAux {
    
    public void metodoAlumno1(){
	System.out.println("metodo 1");
	System.out.println("modificado por alumno 1"); // alumno 1
    }
    
    public void metodoAlumno2(){
        System.out.println("metodo 2");
    }
    
    public void metodoComunitario(){
        System.out.println("Aqui escribimos todos");
	// modificaciones alumno 1
	System.out.println("Alumno 1 inserta esta sentencia");
    }

    public void metodoProyecto(){
        System.out.println("¡Hola!");
    }

    public void testGitAux(){
	// Método de la rama testing
        System.out.println("Método de testing");
    }    
}
