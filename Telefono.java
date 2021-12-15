
/**
 * Write a description of class Telefono here.
 * 
 * @author (Alejandro Fernandez y Andrea Gonzalez) 
 * @version (15/12/2021)
 */
public class Telefono {
    // instance variables - replace the example below with your own
    private String marca;
    // Id del ordenador
    private long imei;
    // Objeto teclado
    private Bateria bateria;
    /**
     * Constructor for objects of class Telefono
     */
    public Telefono(String fabricante, int codigo, Bateria laBateria) {
        // initialise instance variables
        marca = fabricante; 
        imei = codigo;
        bateria = laBateria;
    }
    
    /**
     * Devuelve la marca del teléfono.
     */
    public String getMarca() {
        return marca;
    }
    
    /**
     * Devuelve el IMEI del teléfono
     */
    public long getImei () {
        return imei;
    }
    
    /**
     * Devuelve el estado de la bateria.
     */
    public Bateria getLaBateria() {
        return bateria;
    }
    
    /**
     * Nos permite cambiar el IMEI del telefono.
     */
    public void setImei (long codigo) {
        imei = codigo;
    }
    
    /**
     * Nos permite cambiar la marca del telefono.
     */    
    public void setMarca (String fabricante) {
        marca = fabricante;
    }
    
    /**
     * Nos permite cambiar el estado.
     */    
    public void setBateria (Bateria nuevaBateria) {
        nuevaBateria = bateria;
    }
    
    public void imprimirDetalles () { 
        System.out.println ("El teledono es de la marca " + marca + " con imei " + imei + " con bateria " + bateria + ".");
    }
}

