package pack2;
import java.util.Arrays;

/**
 *
 * @author Camilo González
 */

public class Equipaje {
    private final int MaxW = 18000;  
    private int numbultos;
    private final double pdolar = 0.00030;
    private double promW;   //Peso promedio
    private double pacum;   //Precio acumulado
    private double Hbult;   //Bulto más pesado
    private double Lbult;   //Bulto más liviano
    private int nbini;      //Número de bultos inicial

    public void setNbini(int nbini) {
        this.nbini = nbini;
    }

    public double getHbult(double[]pb) {
        Arrays.sort(pb);
        Hbult = pb[nbini-1];
        return Hbult;
    }

    public double getLbult(double[]pb) {
        Arrays.sort(pb);
        Lbult = pb[nbini-numbultos];
        return Lbult;
    }
    
    
    public Equipaje(){
        numbultos=0;
        promW=0;
        pacum=0;
        Hbult = 0;
        Lbult = 0;
    }
    public int Maxwdata(){
        return MaxW;
    }
    public double pdolardata(){
        return pdolar;
    }   //getter precio del dolar
    public void setNumbultos(int numbultos) {
        this.numbultos = numbultos;
    }

    public int Numbultosdata() {
        return numbultos;
    }   //Getter numero de bultos

    public void setPromW(double promW) {
        
        this.promW = promW / numbultos;
    }

    public double PromWdata() {
        return promW;
    }

    public void setPacum(double pacum) {
        this.pacum = pacum;
    }

    public double getPacum() {
        return pacum;
    }
}
