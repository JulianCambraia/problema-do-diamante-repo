package model.entities;

/**
 * É perfeitamente possível implementar várias Interfaces para resolver o problema do Diamante
 * Isto não é Herança Múltipla, pois não há reuso na relação entre ComboDevice e as interfaces Scanner e Impressora.
 * 
 * @author julian
 *
 */
public class ComboDevice extends Device implements Scanner, Impressora {

	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void imprimir(String doc) {
		System.out.println("Combo Impressão: " + doc);

	}

	@Override
	public String scanner() {
		// TODO Auto-generated method stub
		return "Combo Scanner resultado:";
	}

	@Override
	public void processarDocumento(String doc) {
		System.out.println("Combo Processo Documento: "+ doc);

	}

}
