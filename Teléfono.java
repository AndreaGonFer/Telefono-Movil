
/**
 * Write a description of class Teléfono here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Teléfono {
    // instance variables - replace the example below with your own
    private String marca;
    // Id del ordenador
    private long IMEI;
    // Objeto teclado
    private Bateria bateria;
    /**
     * Constructor for objects of class Teléfono
     */
    public Teléfono(String fabricante, int codigo, Bateria laBateria) {
        // initialise instance variables
        marca = fabricante; 
        IMEI = codigo;
        bateria = laBateria;
    }
}
