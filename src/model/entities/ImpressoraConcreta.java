package model.entities;

public class ImpressoraConcreta extends Device implements Impressora {

	public ImpressoraConcreta(String serialNumber) {
		super(serialNumber);
	}
	@Override
	public void processarDocumento(String doc) {
		System.out.println("Processo de impressão: " + doc);

	}

	@Override
	public void imprimir(String doc) {
		System.out.println("Documento impresso: " + doc);
	}
}
