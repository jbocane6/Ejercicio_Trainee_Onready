package ejercicio_trainee_onready;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Casa
 */
public class main {
    
    public static void main(String[] args) {

        ArrayList<vehiculo> cars = new ArrayList<vehiculo>();
        cars = cargar(cars);        
        mostrar(cars);
    }
    
    private static ArrayList<vehiculo> cargar(ArrayList<vehiculo> cars){
        carro opcion1 = new carro("Peugeot","206","4",200000);
        moto opcion2 = new moto("Honda","Titan","125cc",60000);
        carro opcion3 = new carro("Peugeot","208","5",250000);
        moto opcion4 = new moto("Yamaha","YBR","160cc",80500.50);
        cars.add(opcion1);
        cars.add(opcion2);
        cars.add(opcion3);
        cars.add(opcion4);
        return cars;
    }

    private static void mostrar(ArrayList<vehiculo> cars) {
        String separador ="=============================";
        for (vehiculo opcion: cars)
            System.out.println(opcion.toString());
        System.out.println(separador);
        cars=ordenar(cars);
        comparador(cars);
        contiene(cars);
        System.out.println(separador);
        ordenarPrecio(cars);
    }

    private static void comparador(ArrayList<vehiculo> cars) {
        System.out.println("Vehículo más caro: "+cars.get(0).marcaModelo());
        System.out.println("Vehículo más barato: "+cars.get(cars.size()-1).marcaModelo());
    }

    private static void contiene(ArrayList<vehiculo> cars) {
        vehiculo valor=null;
        for (vehiculo opcion: cars){
            if (opcion.getModelo().charAt(0)=='Y') {
                valor=opcion;
            }
        }
        System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: "+valor.marcaModelo()+" $"+valor.stringPrecio());
    }

    private static ArrayList<vehiculo> ordenar(ArrayList<vehiculo> cars) {
        Collections.sort(cars, (vehiculo v1, vehiculo v2) -> new Double(v2.getPrecio()).compareTo(v1.getPrecio()));
        return cars;
    }

    private static void ordenarPrecio(ArrayList<vehiculo> cars) {
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        for (vehiculo opcion: cars){
            System.out.println(opcion.marcaModelo());
        }
    }    
}
