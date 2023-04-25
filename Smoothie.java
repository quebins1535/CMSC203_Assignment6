public class Smoothie extends Beverage{
	
	int numOfFruits;
	boolean addProtein;
	final double PROTEIN_PRICE = 1.50;
	final double FRUIT_PRICE = .5;
	
	public Smoothie(String bevName, SIZE size, int numOfFruits, boolean addProtein) {
		super(bevName, TYPE.SMOOTHIE, size);
		this.numOfFruits = numOfFruits;
		this.addProtein = addProtein;
	}
	
	public int getNumOfFruits() {
		return numOfFruits;
	}
	
	public boolean getAddProtein() {
		addProtein = true;
		return addProtein;
	}
	
	public String toString() {
		String toReturn = super.toString();
		toReturn += "," + addProtein + "," + numOfFruits + "," + calcPrice();
		
		return toReturn;
	}
	
	public double calcPrice() {
		double price = super.addSizePrice();
		price += numOfFruits * FRUIT_PRICE;
		if(addProtein == true)
			price += PROTEIN_PRICE;
		
		return price;
	}
	
	public boolean equals(Smoothie anotherBev) {
		if(super.equals(anotherBev) == true && numOfFruits == anotherBev.numOfFruits && addProtein == anotherBev.addProtein)
			return true;
		else
			return false;
	}
}
