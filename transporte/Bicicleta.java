
package transporte;


public class Bicicleta extends Vehiculo {
    public Bicicleta(String nombre) {
        super(nombre);
    }

    @Override
    public void acelerar(int velocidad) {
        System.out.println(getNombre() + " esta pedaleando mas rapido");
    }

    @Override
    public void frenar() {
        System.out.println(getNombre() + " esta frenando con los frenos de la bicicleta");
    }
}

