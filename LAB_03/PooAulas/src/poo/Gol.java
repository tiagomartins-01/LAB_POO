package poo;

public class Gol {
	
	public static void main(String[] args) {
		Carro gol = new Carro();
		gol.ano = 1994;
		gol.cor = "Azul";
		gol.fabricante = "VW";
		gol.modelo = "GTS";
		System.out.println("Carro: Gol");
		System.out.println("Ano: " + gol.ano);
		System.out.println("Cor: " + gol.cor);
		System.out.println("Fabricante: " + gol.fabricante);
		System.out.println("Modelo: " + gol.modelo);
		gol.ligar();
		gol.acelerar();
		gol.frear();
		gol.buzinar();
		gol.desligar();
	}

}
