package udem.edu.co.modelo;

/**
 *
 * @author Juan Fernando Arteaga Acevedo
 * @version 0.1
 */
public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected String sexo;
    protected String raza;

    public Animal(String nombre, int edad, String sexo, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.raza = raza;
    }

    public Animal() {
    }
        
    public abstract int PromedioVida();
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
}
