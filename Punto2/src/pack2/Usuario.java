package pack2;

/**
 *
 * @author Camilo González
 */
import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Equipaje datos = new Equipaje();
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de bultos:");
        int nb = escaner.nextInt();      //nb será el número de bultos inicial
        
        if (nb <= 0) {                              
            System.out.println("Número de bultos incorrecto, ingrese el número de nuevo:");
            nb = escaner.nextInt();
        }               //Si ingresa un valor negativo o igual a cero
        double Pmax = 0;                 // Peso máximo
        double[] PB = new double[nb];    // Matriz que contendrá todos los pesos
        datos.setNumbultos(nb);          //Set el número de bultos acumulativo
        datos.setNbini(nb);              //Guarda el número de bultos inicial
        
        for (int i=0; i < nb; i++){
            int y = i + 1;
            System.out.println("Ingrese el peso (en kg) del bulto número " + y + ":");
            double check = escaner.nextDouble();        //Check guarda el peso del bulto actual i
            if (check > 500 || check > datos.Maxwdata() || check <= 0){
                System.out.println("El bulto excede el peso límite permitido (500 kg), o es menor o igual a cero, por lo que se restará del total"); 
                int x = datos.Numbultosdata() - 1;
                datos.setNumbultos(x);
                x = 0;
            } //Si el peso del bulto no cumple las condiciones
            else {
                if (check > 25 && check <= 300){
                    double pacum = (check * 1500) + datos.getPacum();
                    datos.setPacum(pacum);
                    pacum = 0;
                }                        //Precio para bultos entre 25 y 300
                else if (check > 300 && check <= 500){
                    double pacum = (check * 2500) + datos.getPacum();
                    datos.setPacum(pacum);
                    pacum = 0;
                }                  //Precio para bultos entre 300 y 500 kg.
            PB[i] = check;                                                  //Vector que acumula los pesos individuales
            Pmax = Pmax + check;                                            //Acumula el peso total
            }                           //Si el peso cumple las condiciones
            if (Pmax > datos.Maxwdata()) {
                System.out.println("Se ha superado el límite máximo de carga del avión, no se aceptarán más bultos");
                int x = datos.Numbultosdata() - (nb-i);
                datos.setNumbultos(x);
                break;
            }   //Si se excede el peso máximo del avión
            check = 0;
        }   //Ciclo for para cada bulto
        
        escaner.close();
        datos.setPromW(Pmax);           //Envía el peso acumulado para el promedio
        
        //Resultados---------------
        System.out.println("El número total de bultos ingresados es: " + datos.Numbultosdata());
        System.out.println("El bulto que más peso tiene: " + datos.getHbult(PB) + "kg");
        System.out.println("El bulto que menos peso tiene: " + datos.getLbult(PB) + "kg");
        System.out.println("El peso promedio de todos los bultos es: " + datos.PromWdata() + "kg");
        System.out.println("El valor total de la carga es: " + datos.getPacum() + " pesos");
        double PacumUs = datos.getPacum() * datos.pdolardata();
        System.out.println("El valor total de la carga, en dólares, es: " + PacumUs + "$");
    }
}

