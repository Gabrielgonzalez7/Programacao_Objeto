public class Moto extends Veiculo{
    
    public Moto(String marca, String modelo, int ano){
        super(marca, modelo, ano);
    }
    @Override
    public void acelerar(){
        System.out.println("A " +modelo+ " está acelerando, vá devagar!!!" );
    }
    @Override
    public void frear(){
        System.out.println("****CUIDADO!!**** \n A moto está freando!!!");
    }
}