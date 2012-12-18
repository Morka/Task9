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
	/*
	 * 
	 * 
	 * MEMO: NOT SURE IF WE NEED ALL OF THE GETTER METHOD!!!
	 * DELETE IF UNNECESSARY
	 * 
	 * 
	 * 
	 * */
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
			ret = "Quantity: " + this.numberOfCookies + " Dough: " + dough + " Shape: " + shape + " Filling: " + filling;
		}else{
			ret = "Quantity: " + this.numberOfCookies + " Dough: " + dough + " Shape: " + shape;
		}
		
		return ret;
	}
}
