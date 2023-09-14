package Singleton;

public class Constante {
    private static Constante instancia;
    private String nombreConstante;
    private double valorConstante;
    //Constructo
    private Constante(){
        nombreConstante="N/A";
        valorConstante=0;
    }
    public static Constante getInstance(){
        if(instancia==null){
            instancia=new Constante();
            System.out.println("Instancia Creada por Primara vez");
        }
        return instancia;
    }
    @Override
    public String toString() {
        return "Constante [nombreConstante=" + nombreConstante + ", valorConstante=" + valorConstante + "]";
    }
    public void setDatos (String name, double value){
        this.nombreConstante=name;
        this.valorConstante=value;
    }
}
