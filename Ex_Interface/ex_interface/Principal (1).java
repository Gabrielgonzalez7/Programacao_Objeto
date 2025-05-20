public class Principal {
    public static void main(String[] args) {
        Smartphone meuSmartphone = new Smartphone("919191919", "exemplo@email.com");
        meuSmartphone.verificaEmail();
        meuSmartphone.realizarChamada();
    }
}
