package pojos;

public class HealthProfile {
	private double weight; // in kg
	private double height; // in m
    private double BMI;     // score

	public HealthProfile(double weight, double height) {
		this.weight = weight;
		this.height = height;
        this.BMI = getBMI();
	}

	public HealthProfile() {
		this.weight = 85.5;
		this.height = 1.72;
        this.BMI = getBMI();
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public String toString() {
		return "Height="+height+", Weight="+weight+", BMI="+BMI;
	}

	// add accessor for the newly created BMI
	// the getter can respond with the calculation (weight divided the height in meters elevated to the power of 2)

    public double getBMI(){
        return this.weight/(this.height*this.height);
    }
}
