/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */


public class Position {	
	private int numberOfCookies;
	private Dough dough;
	private Shape shape;
	private Filling filling;
	
	public Position(int numberOfCookies, Dough dough, Shape shape, Filling filling){
		this.numberOfCookies = numberOfCookies;
		this.dough = dough;
		this.shape = shape;
		this.filling = filling;
	}
	
	public int getnumberOfCookies(){
		return numberOfCookies;
	}
	
	public Dough getDough(){
		return dough;
	}
	
	public Shape getShape(){
		return shape;
	}
	
	public Filling getFilling(){
		return filling;
	}
	
	public String toString(){
		String ret;
		
		if(filling != null){
			ret = "Anzahl: " + this.numberOfCookies + " Teig: " + dough + " Form: " + shape + " Fuellung: " + filling;
		}else{
			ret = "Anzahl: " + this.numberOfCookies + " Teig: " + dough + " Form: " + shape;
		}
		
		return ret;
	}
}
