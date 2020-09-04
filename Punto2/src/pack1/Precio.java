package pack1;

/**
 *
 * @author Camilo González
 */
public class Precio {
    private double distancia;
    private int dias;
    private double pxk;
    private double descuento;
    private double pfinal;
    
    public Precio(){
        descuento = 0.3;
        distancia = 0;
        dias = 0;
        pxk = 0;
        pfinal = 0;
    }
    public void distancia (double distancia) {
        this.distancia = distancia;
    }
    public double distdata () {
        return distancia;
    }
    public void dias(int dias){
        this.dias=dias;
    }
    public int diasdata(){
        return dias;
    }
    public void pfinal(double pfinal){
        this.pfinal=pfinal;
    }
    public double precioFinal(){
        return pfinal;
    }
    public double descuento(){
        return descuento;
    }
}

