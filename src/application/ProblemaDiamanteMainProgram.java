package application;

import model.entities.ComboDevice;
import model.entities.ImpressoraConcreta;
import model.entities.ScannerConcreta;

public class ProblemaDiamanteMainProgram {

	public static void main(String[] args) {
		ImpressoraConcreta p = new ImpressoraConcreta("1080");
		p.processarDocumento("Minha carta");
		p.imprimir("Minha Carta 2");
		System.out.println();
		ScannerConcreta s = new ScannerConcreta("2003");
		s.processarDocumento("Meu Email");
		System.out.println("Resultado do scanner: " + s.scanner());

		System.out.println();
		ComboDevice c = new ComboDevice("2081");
		c.processarDocumento("Minha Dissertação");
		c.imprimir("Minha Dissertação");
		System.out.println("Scanner resultado: " + c.scanner());
	}

}
