package model.entities;

public class Scanner extends Device {

	public Scanner(String serialNumber) {
		super(serialNumber);
	}
	@Override
	public void processarDocumento(String doc) {
		System.out.println("Processo de Scanner: " + doc);

	}

	public String scanner() {
		return "conteúdo Scanneado!";
	}
}
