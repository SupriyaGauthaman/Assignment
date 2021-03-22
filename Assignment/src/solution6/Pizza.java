package solution6;

public class Pizza {
	
	public static int fetchCalories(Pizza p) {
		int cal=0;
		if(p instanceof MargheritaPizza) {
		cal=200;
		}
		else if(p instanceof CheesePizza) {
		cal=150;
		}
		return cal;
		
	}

}
