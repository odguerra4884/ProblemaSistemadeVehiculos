
package transporte;
import java.util.Scanner;


public class Transporte {

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Que tipo de vehiculo deseas crear? \n1. Vehiculo motorizado. \n2. Bicicleta. \n3. Salir.");
            String tipoVehiculo = scanner.nextLine();

            if (tipoVehiculo.equalsIgnoreCase("3")) {
                System.out.println("Saliendo del programa.");
                break;
            }

            switch (tipoVehiculo.toLowerCase()) {
                case "1":
                    System.out.println("Los vehiculos motorizados pueden ser:\nCarros\nMotocicleta\nAvion\nTren\nLancha\n");
                    System.out.println("Ingrese el nombre del vehiculo:");
                    String nombreAuto = scanner.nextLine();
                    System.out.println("Ingrese la cantidad maxima de pasajeros:");
                    int pasajerosAuto = scanner.nextInt();
                    scanner.nextLine(); 

                    Automovil auto = new Automovil(nombreAuto, pasajerosAuto);

                    System.out.println("Ingrese la velocidad de aceleracion del automovil:");
                    int velocidadAceleracionAuto = scanner.nextInt();
                    scanner.nextLine(); 

                    auto.acelerar(velocidadAceleracionAuto);
                    auto.frenar();
                    break;
                case "2":
                    System.out.println("Ingrese el nombre de la bicicleta:");
                    String nombreBici = scanner.nextLine();
                    Bicicleta bicicleta = new Bicicleta(nombreBici);

                    System.out.println("Ingrese la velocidad de aceleracion de la bicicleta:");
                    int velocidadAceleracionBici = scanner.nextInt();
                    scanner.nextLine(); 

                    bicicleta.acelerar(velocidadAceleracionBici);
                    bicicleta.frenar();
                    break;
                default:
                    System.out.println("Tipo de vehiculo no valido.");
            }
        }
    }
}

