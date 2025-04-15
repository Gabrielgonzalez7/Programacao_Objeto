import java.util.Scanner;
public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    
    public Carro(){
        this.marca  = "";
        this.modelo = "";
        this.ano = 0;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibeDetalhes() {
        System.out.println("=== Detalhes do Carro ===");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }


}
