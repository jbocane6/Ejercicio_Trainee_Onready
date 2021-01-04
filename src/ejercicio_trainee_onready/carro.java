package ejercicio_trainee_onready;

/**
 *
 * @author Casa
 */
public class carro extends vehiculo{
    private String puertas;

    public carro(String marca, String modelo, String puertas, double precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    public String getPuertas() {
        return puertas;
    }

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Marca: "+getMarca()+" // Modelo: "+getModelo()+" // Puertas: " + getPuertas()+" // Precio: $"+stringPrecio();
    }    
}
