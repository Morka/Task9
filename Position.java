/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

/**
 * At the moment Position filling is null for EinfacheKese and not null for Doppelkekse. I am not yet sure, 
 * whether or not i like it that way...
 * 
 * A Position could also contain only the number of Cookies and an object of either Doppelkeks or Einfachkeks. 
 * */
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
			ret = "Quantity: " + this.numberOfCookies + " Dough: " + dough + " Shape: " + shape + " Filling: " + filling;
		}else{
			ret = "Quantity: " + this.numberOfCookies + " Dough: " + dough + " Shape: " + shape;
		}
		
		return ret;
	}
}
