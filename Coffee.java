public class Coffee extends Beverage{
	
	boolean extraShot;
	boolean extraSyrup;
	final double SHOT_PRICE = .5;
	final double SYRUP_PRICE = .5;
	
	public Coffee(String bevName, SIZE size, boolean extraShot, boolean extraSyrup) {
		
		super(bevName, TYPE.COFFEE, size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
	}
	
	public boolean getExtraShot() {
		
		return extraShot;
	}
	
	public boolean getExtraSyrup() {
		
		return extraSyrup;
	}
	
	public double calcPrice() {
		
		double price = super.addSizePrice();
		
		if(extraShot == true)
			price += SHOT_PRICE;
		else if(extraSyrup == true)
			price += SYRUP_PRICE;
		
		return price;
	}
	
	public String toString() {
		
		String toReturn = super.toString();
		toReturn += "," + extraShot + "," + extraSyrup + "," + calcPrice();
		return toReturn;	
	}
	
	public boolean equals(Coffee anotherBev) {
		
		if(super.equals(anotherBev) == true && extraShot == anotherBev.extraShot && extraSyrup == anotherBev.extraSyrup)
			return true;
		else
			return false;
	}

}
