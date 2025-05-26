public class Carro extends Veiculo{
    public Carro(String marca, String modelo, int ano){
        super(marca, modelo, ano);
    }
    @Override
    public void acelerar(){
        System.out.println("O " +modelo+ " está acelerando. Vá devagar!!!!" );
    }
    @Override
    public void frear(){
        System.out.println("*****CUIDADO!!!*****\nO carro está freando!!! ");
    }
}