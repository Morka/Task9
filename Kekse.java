/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public abstract class Kekse {
	private final Dough dough;
	private final Shape shape;
	
	public Kekse(Dough dough, Shape shape){
		this.dough = dough;
		this.shape = shape;		
	}
	
	public Dough getDough(){
		return dough;
	}
	
	public Shape getShape(){
		return shape;
	}
}
