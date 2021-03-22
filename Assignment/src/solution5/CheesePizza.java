package solution5;

public class CheesePizza extends Pizza{
	private int cCalories=250;
	
	public void makePizza() {
		System.out.println("Making Cheese Pizza");
	}

	public int getcCalories() {
		return cCalories;
	}

	public void setcCalories(int cCalories) {
		this.cCalories = cCalories;
	}

}
