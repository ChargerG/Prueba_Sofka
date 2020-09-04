package pack1;

import java.util.Scanner;

/**
 *
 * @author Camilo González
 */
public class Usuario {

    public static void main(String[] args) {
        
        Precio data = new Precio();
        final double Preciokm = 35.00;
        
        System.out.println("Ingrese la distancia de su viaje:");
        Scanner escaner = new Scanner(System.in);
        double distancia = escaner.nextDouble();
        
        data.distancia(distancia);
        
        System.out.println("La distancia que ingresó es: " + data.distdata() + " Km");
        System.out.println("Ingrese la cantidad de días de estancia:");
        
        int dias = escaner.nextInt();
        data.dias(dias);
        
        System.out.println("La cantidad de dias que ingresó es: " + data.diasdata());
        double pxk = data.distdata() * Preciokm;
        
        if (distancia > 1000 && dias > 7) {
            double pfinal = pxk - data.descuento() * pxk;
            data.pfinal(pfinal);
            System.out.println("El precio de su viaje, con descuento, es: " + data.precioFinal() + "$");
        } else {
            data.pfinal(pxk);
            System.out.println("El precio de su viaje es: " + data.precioFinal() + "$");
        }

    }
}
