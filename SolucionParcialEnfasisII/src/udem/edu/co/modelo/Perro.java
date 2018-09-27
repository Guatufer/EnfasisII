
package udem.edu.co.modelo;

/**
 *
 * @author Juan Fernando Arteaga Acevedo
 * @version 0.1
 */
public class Perro extends Animal{

   
    public Perro() {
    }
    
    
    public Perro(String nombre, int edad, String sexo, String raza) {
        super(nombre, edad, sexo, raza);
    }

    @Override
    public int PromedioVida() {
        int vida = 10;
        return vida;
    }

    @Override
    public String toString() {
        return "Perro:"+nombre+", "+edad+", "+sexo+", "+raza+"." ;
    }
    
}
