package poo;

import java.util.Random;

public class Carro {
	String fabricante;
	String modelo;
	String cor;
	int ano;
	
	/*
	 * primeiro construtor
	 */
	public Carro() {
		Random gerador = new Random();
		int chassi = gerador.nextInt(10000);
		System.out.println("Chassi: " + chassi);
	}
	
	/*
	 * segundo construtor
	 */
	public Carro(int ano, String cor) {
		this.ano = ano;
		this.cor = cor;
	}
	
	void ligar() {
		System.out.println("Foi dada a partida! | Engine ON ");
	}
	
	void desligar() {
		System.out.println("Motor desligado. | Engine OFF ");
	}
	
	void acelerar() {
		System.out.println("VRUMMMMMMMMM");
	}
	
	void frear() {
		System.out.println("Velocidade Reduzida");
	}
	
	void buzinar() {
		System.out.println("BIBIBIBIBI");
	}
	
}
