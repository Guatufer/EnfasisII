
package udem.edu.co.modelo;

/**
 *
 * @author Juan Fernando Arteaga Acevedo
 * @version 0.1
 */
public class Gato extends Animal{

    
    
    public Gato() {
    }
    
    
    public Gato(String nombre, int edad, String sexo, String raza) {
        super(nombre, edad, sexo, raza);
    }

    @Override
    public int PromedioVida() {
       int vida = 14;
        return vida;
    }

    @Override
    public String toString() {
        return "Gato:"+nombre+", "+edad+", "+sexo+", "+raza+"." ;
    }
    
    
}
