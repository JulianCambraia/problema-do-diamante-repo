package model.entities;

public class ScannerConcreta extends Device implements Scanner {

	public ScannerConcreta(String serialNumber) {
		super(serialNumber);
	}
	@Override
	public void processarDocumento(String doc) {
		System.out.println("Processo de Scanner: " + doc);

	}

	@Override
	public String scanner() {
		return "conteúdo Scanneado!";
	}
}
