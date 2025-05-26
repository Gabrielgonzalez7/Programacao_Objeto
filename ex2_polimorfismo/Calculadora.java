class Calculadora{
    public int somar(int a,  int b){
        return a+b;
    }
    public int somar(int a, int b, int c){
        return a+b+c;
    }
    //subtração
    public int subtrair(int a, int b){
        return a-b;
    }
    public int subtrair(int a, int b, int c){
        return a-b-c;
    }
       public int multiplicar(int a, int b) {
        return a * b;
    }
    public int multiplicar(int a, int b, int c){
        return a*b*c;
    }
       public double dividir(double a, double b) {
        return b != 0 ? a / b : 0;
    }
    public double dividir( double a, double b, double c){
        if (b == 0 || c == 0) {
            return 0;
        }
        return a / b / c;
    }
}