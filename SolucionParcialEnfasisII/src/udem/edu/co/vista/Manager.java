
package udem.edu.co.vista;

import udem.edu.co.controlador.Controlador;
import udem.edu.co.modelo.Animal;
import udem.edu.co.modelo.Gato;
import udem.edu.co.modelo.Perro;
import udem.edu.co.modelo.Tortuga;

/**
 *
 * @author Juan Fernando Arteaga Acevedo
 * @version 0.1
 */
public class Manager {
    private Controlador controlador;

    public Manager() {
        controlador = new Controlador();
    }
    public Animal crearPerro(String nombre, int edad, String sexo, String raza){
        Animal animal = new Perro(nombre, edad, sexo, raza);    
        return animal;
    }
    public Animal crearGato(String nombre, int edad, String sexo, String raza){
        Animal animal = new Gato(nombre, edad, sexo, raza);    
        return animal;
    }
    public Animal crearTortuga(String nombre, int edad, String sexo){
        Animal animal = new Tortuga(nombre, edad, sexo);    
        return animal;
    }
    
    public void agregar(Animal animal) {
        controlador.agregar(animal);
    }
    public String mostrar(){
        String datosMostrar = controlador.mostraAnimal();
        return datosMostrar;
    }

    public Controlador getControlador() {
        return controlador;
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }
    
}
