import java.util.Scanner;
    public class Circulo{
        private double raio;
        public Circulo(){
            this.raio = 0.0;
        }
        public double getRaio(){
            return this.raio;
        }
        public void setRaio(double raio){
            this.raio = raio;
        }
        public double calculaArea(){
            return Math.PI *Math.pow(this.raio, 2);
        }
        
    }