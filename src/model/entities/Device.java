package model.entities;

public abstract class Device {

	private String serialNumber;

	public Device() {
		super();
	}

	public Device(String serialNumber) {
		super();
		this.serialNumber = serialNumber;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public abstract void processarDocumento(String doc);
	
}
