package guitarInventory;

public class Guitar {
	
	/* 1st optimization: ditch String comparisons.
	 * For those String type variables, except model, all can be represented using Enum. */
	private String serialNumber, model;
	private Wood topWood;
	private Wood backWood;
	private Type type;
	private Builder builder;
	private double price;
	
	
	public Guitar(String serialNumber, double price, Builder builder, String model,
			Type type, Wood backWood, Wood topWood) {
		this.serialNumber = serialNumber;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}
}
