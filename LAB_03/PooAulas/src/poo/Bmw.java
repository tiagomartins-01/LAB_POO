package poo;

public class Bmw {
	
	public static void main(String[] args) {
		Carro bmw = new Carro();
		bmw.ano = 2021;
		bmw.cor = "Preto";
		bmw.fabricante = "BMW Motors";
		bmw.modelo = "M3";
		System.out.println("Carro: BMW");
		System.out.println("Ano: " + bmw.ano);
		System.out.println("Cor: " + bmw.cor);
		System.out.println("Fabricante: " + bmw.fabricante);
		System.out.println("Modelo: " + bmw.modelo);
		bmw.ligar();
		bmw.acelerar();
		bmw.frear();
		bmw.buzinar();
		bmw.desligar();
	}

}
