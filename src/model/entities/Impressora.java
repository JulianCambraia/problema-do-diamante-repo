package model.entities;

public class Impressora extends Device {

	public Impressora(String serialNumber) {
		super(serialNumber);
	}
	@Override
	public void processarDocumento(String doc) {
		System.out.println("Processo de impressão: " + doc);

	}

	public void imprimir(String doc) {
		System.out.println("Documento impresso: " + doc);
	}
}
