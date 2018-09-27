
package udem.edu.co.modelo;

/**
 *
 * @author Juan Fernando Arteaga Acevedo
 * @version 0.1
 */
public class Tortuga extends Animal{

 
    public Tortuga() {
    }   
    
    public Tortuga(String nombre, int edad, String sexo) {
        super(nombre, edad, sexo, "Morrocoy");
    }
    

    @Override
    public int PromedioVida() {
       int vida = 40;
        return vida;
    }

    @Override
    public String toString() {
        return "Tortuga:"+nombre+", "+edad+", "+sexo+", "+raza+"." ;
    }
    
}
