package guitarInventory;

public class GuitarSpec {
	
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	private int numOfStrings;
	
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
		if (builder != otherSpec.builder)
			return false;
		if (model != null && !model.equalsIgnoreCase(otherSpec.model))
			return false;
		if (type != otherSpec.type)
			return false;
		if (backWood != otherSpec.backWood)
			return false;
		if (topWood != otherSpec.topWood)
			return false;
		if (numOfString != otherSpec.numOfString)
			return false;
		return true;
	}
	
}
