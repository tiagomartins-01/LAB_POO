package poo;

public class AE86 {
	
	public static void main(String[] args) {
		Carro ae86 = new Carro();
		ae86.ano = 1983;
		ae86.cor = "Branco";
		ae86.fabricante = "Toyota";
		ae86.modelo = "AE86";
		System.out.println("Carro: Sprinter Trueno");
		System.out.println("Ano: " + ae86.ano);
		System.out.println("Cor: " + ae86.cor);
		System.out.println("Fabricante: " + ae86.fabricante);
		System.out.println("Modelo: " + ae86.modelo);
		ae86.ligar();
		ae86.acelerar();
		ae86.frear();
		ae86.buzinar();
		ae86.desligar();
	}

}
