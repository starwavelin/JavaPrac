package guitarInventory;

public class Guitar {
	
	private String serial;
	private double price;
	private GuitarSpec spec;
	
	public Guitar(String serial, double price, GuitarSpec spec) {
		this.serial = serial;
		this.price = price;
		this.spec = spec;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSerial() {
		return serial;
	}
	public GuitarSpec getSpec() {
		return spec;
	}
	
	public String toString() {
		return "This guitar had properties: Serial: " + serial + ", Price: " + price + spec.toString();
	}
}
