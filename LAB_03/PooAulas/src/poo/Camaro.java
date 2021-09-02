package poo;

public class Camaro {
	
	public static void main(String[] args) {
		Carro camaro = new Carro(2005, "Verde");
		//camaro.ano = 2015;
		//camaro.cor = "Amarelo";
		camaro.fabricante = "GM";
		camaro.modelo = "Sport";
		System.out.println("Carro: Camaro");
		System.out.println("Ano: " + camaro.ano);
		System.out.println("Cor: " + camaro.cor);
		System.out.println("Fabricante: " + camaro.fabricante);
		System.out.println("Modelo: " + camaro.modelo);
		camaro.ligar();
		camaro.acelerar();
		camaro.frear();
		camaro.buzinar();
		camaro.desligar();
	}

}
