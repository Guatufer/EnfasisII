
package udem.edu.co.controlador;

import java.util.ArrayList;
import java.util.List;
import udem.edu.co.modelo.Animal;

/* ESto no va a funcionar jaja pero bueno ya que, MODIFIQUEMOS
:D
esto es otra prueba
/**
 *
 * @author Juan Fernando Arteaga Acevedo
 * @version 0.1
 */
public class Controlador {
    List<Animal> listaAnimales;

    public Controlador() {
        listaAnimales = new ArrayList<Animal>();
    }
    
    public void agregar(Animal animal){
        listaAnimales.add(animal);
    }

    public List<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(List<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }
    
    public String mostraAnimal(){
        String listadoAnimales = "";
        for (Animal listaAnimale : listaAnimales) {
            listadoAnimales = listadoAnimales+listaAnimale.toString()+ "\n";
        }
        return listadoAnimales;  
    }
    
    
    
    
}
