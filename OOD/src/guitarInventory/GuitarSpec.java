package guitarInventory;

public class GuitarSpec {
	
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	private int numOfStrings;
	
	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numOfStrings) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.numOfStrings = numOfStrings;
	}
	
	public Builder getBuider() {
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
	
	public boolean matchSpec(GuitarSpec otherSpec) {
		return (builder == otherSpec.builder && model.equalsIgnoreCase(otherSpec.model) 
				&& type == otherSpec.type && backWood == otherSpec.backWood 
				&& topWood == otherSpec.topWood && numOfStrings == otherSpec.numOfStrings);
	}
	
	public String toString() {
		return ", Builder: " + builder + ", Model: " + model + ", Type: " + type + ", BackWood: " + backWood 
				+ ", TopWood: " + topWood + ", number of strings: " + numOfStrings; 
	}
	
}
