public abstract class Veiculo{
    protected String marca;
    protected String modelo;
    protected int ano;
    
    //construtor 
    public Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    //Métodos abstratos 
    public abstract void acelerar();
    public abstract void frear();
    
}