/**
 * @author (Alejandro Fernandez y Andrea Gonzalez) 
 * @version (09/12/2021)
 */
public class Bateria {
    // Capacidad de la bateria.
    private int capacidad;
    // Estado de la bateria.
    private boolean cargada;

    /**
     * Crea una Bateria
     */
    public Bateria(int mAh, boolean charge){
        capacidad  = mAh;
        cargada = charge;
    }
    
    public int getCapacidad(){
        return capacidad;
    }
    
    public boolean getCharge(){
        return cargada;
    }
    
    public void setCapacidad(int laCapacidad){
        capacidad = laCapacidad;    
    }
    
    public void setCharge(boolean charged){
        cargada= charged;
    }
}
