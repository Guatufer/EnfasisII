
package udem.edu.co.vista;

/**
 *
 * @author Juan Fernando Arteaga Acevedo
 * @version 0.1
 */
public class Main {

   
    public static void main(String[] args) {
       Manager man = new Manager(); 
      
       man.agregar(man.crearPerro("Bruno", 5, "Masculino", "Pastor Collie"));
       man.agregar(man.crearGato("Zasha", 12, "Femenino", "Criollo"));
       man.agregar(man.crearTortuga("Crital", 26, "Femenino"));
       
       System.out.println(man.mostrar());
    }


    
}
