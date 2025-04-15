import java.util.Scanner;

public class Retangulo{
    private double base;
    private double altura;
    
    public Retangulo(){
        this.base = 0.0;
        this.altura = 0.0;
        
    }
    
    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;
    }
    public void setBase(double base){
        this.base = base;
    }
    public void setAltura( double altura){
        this.altura = altura;
    }
    
    public double calcularArea(){
        return this.base * this.altura;
    }
}