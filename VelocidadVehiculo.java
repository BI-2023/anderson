package VelocidadVehiculo;

import java.util.*;

public class VelocidadVehiculo {
	
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\t\t\t\t\t\tPROGRAMA DE VELOCIDAD PROMEDIO DE UN VEHICULO DE CARRERAS\n");
          //variables a utilizar
        int opcion;
        int NumerodeVueltas = 0;
        int NumerodeVehiculos = 0;
        float velocidad;
        float promedio;
        String NombrePista;
            //INCISOS PARA VER EL MENU
              System.out.println("MENU");
              System.out.println("");
              System.out.println("1. INGRESAR AUTO NUEVO");
              System.out.println("2. SALIR");
        
              
           System.out.print("DIGITE SU OPCION:"); opcion= entrada.nextInt();
        //DIGITANDO OPCION
           switch(opcion){ 
            case 1:
                System.out.println("DIGITE EL NOMBRE DE LA PISTA");
                NombrePista= entrada.nextLine();
                NombrePista= entrada.nextLine();
        //solicitud de datos
        System.out.println("DIGITE EL NUMERO DE VEHICULOS ");
        NumerodeVehiculos = entrada.nextInt();
        System.out.println("INGRESE EL NUMERO DE VUELTAS");
        NumerodeVueltas = entrada.nextInt();
        //bucle para el numero de vehiculos
        int i = 1;
            while (i <= NumerodeVehiculos) {
              System.out.println("\nDatos del Vehiculo No. " + i);
        //bucle para el numero de vueltas
        int iterador = 1;
           float sumaVehiculo = 0;
        while (iterador <= NumerodeVueltas) {
            System.out.print("Ingrese la velocidad de la vuelta no " + iterador + " para el vehiculo No. " + i + ": ");
        velocidad = entrada.nextFloat();
        //suma de las velocidades del vehiculo
        sumaVehiculo = sumaVehiculo + velocidad;
        iterador++;
        }
        //operacion para obtener promedio de velocidad
            promedio = sumaVehiculo / NumerodeVueltas;
        //if para comprobar que la suma tenga valores de lo contrario no se puede obtener un promedio
        if(sumaVehiculo==0){
             System.out.println("error no se puede obtener promedio por medio de un 0");
        }
        //el promedio obtenido}
             System.out.println("La velocidad promedio del vehiculo No. " + i + " es: " + promedio);
        i++;
        }
        break;
           case 2: 
            default:System.out.println("GRACIAS POR USAR ESTE PROGRAMA");
    }
          }
}