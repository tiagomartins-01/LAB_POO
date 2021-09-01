public class CarroTeste {

    public static void main(String[] args) {
        Carro c1 = new Carro();

        c1.marca = "FIAT";
        c1.modelo = "147";
        c1.ano = 1979;
        c1.cor = "amarelo";
        c1.velocidade = 80;

        //metodos

        c1.acelerar(20);
        System.out.println("Velocidade: " + c1.velocidade + "Km/h");

        c1.frear(55);
        System.out.println("Velocidade: " + c1.velocidade + "Km/h");
    }

}