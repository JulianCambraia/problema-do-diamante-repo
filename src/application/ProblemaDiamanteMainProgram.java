package application;

import model.entities.Impressora;
import model.entities.Scanner;

public class ProblemaDiamanteMainProgram {

	public static void main(String[] args) {
		Impressora p = new Impressora("1080");
		p.processarDocumento("Minha carta");
		p.imprimir("Minha Carta 2");

		Scanner s = new Scanner("2003");
		s.processarDocumento("Meu Email");
		System.out.println("Resultado do scanner: " + s.scanner());
	}

}
