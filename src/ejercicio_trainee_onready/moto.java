package ejercicio_trainee_onready;

/**
 *
 * @author Casa
 */
public class moto extends vehiculo{
    private String cilindrada;

    public moto(String marca, String modelo, String cilindrada, double precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }
    @Override
    public String toString() {
        return "Marca: "+getMarca()+" // Modelo: "+getModelo()+" // Cilindrada: " + getCilindrada()+" // Precio: $"+stringPrecio();
    }
}