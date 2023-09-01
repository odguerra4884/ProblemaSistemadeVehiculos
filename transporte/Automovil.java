
package transporte;

public class Automovil extends Vehiculo {
    private int maxPasajeros;

    public Automovil(String nombre, int maxPasajeros) {
        super(nombre);
        this.maxPasajeros = maxPasajeros;
        System.out.println("Se ha creado un vehiculo llamado " + getNombre() + " con capacidad para " + maxPasajeros + " pasajeros.");
    }

    @Override
    public void acelerar(int velocidad) {
        System.out.println(getNombre() + " esta acelerando a " + velocidad + " km/h");
    }

    @Override
    public void frenar() {
        System.out.println(getNombre() + " esta frenando");
    }
}

