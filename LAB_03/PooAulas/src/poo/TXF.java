package poo;

public class TXF {
	
	public static void main(String[] args) {
		Cidade txf = new Cidade("Nordeste", "BA");
		
		txf.habitantes = 10000;
		
		System.out.println("Cidade: Teixeira de Freitas");
		System.out.println("Habitantes: " + txf.habitantes);
		System.out.println("Região: " + txf.regiao);
		System.out.println("UF: " + txf.UF);
	}	
}
