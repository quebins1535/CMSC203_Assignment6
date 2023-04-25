public class Alcohol extends Beverage{
	
	boolean isWeekend;
	final double WEEKEND_PRICE = .60;
	
	public Alcohol(String bevName, SIZE size, boolean isWeekend) {
		super(bevName, TYPE.ALCOHOL, size);
		this.isWeekend = isWeekend;
	}
	
	public double calcPrice() {	
		double price = super.addSizePrice();
		
		if(isWeekend == true)	
			price += WEEKEND_PRICE;
		
		return price;
	}
	
	public String toString() {
		String toReturn = super.toString();
		toReturn += "," + isWeekend + "," + calcPrice();
		
		return toReturn;
	}
	
	public boolean equals(Alcohol anotherBev) {
		if(super.equals(anotherBev) == true && isWeekend == anotherBev.isWeekend)
			return true;
		else 
			return false;
	}
}
