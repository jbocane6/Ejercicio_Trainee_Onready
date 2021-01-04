package ejercicio_trainee_onready;

import java.text.DecimalFormat;

/**
 *
 * @author Casa
 */
public class vehiculo {
    private String marca;
    private String modelo;
    private double precio;
    DecimalFormat formato = new DecimalFormat("###,###.00");

    public vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String marcaModelo() {
        return getMarca()+" "+getModelo();
    }
    public String stringPrecio() {
        return formato.format(getPrecio());
    }
}
