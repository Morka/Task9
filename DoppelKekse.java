/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */
public class DoppelKekse extends Kekse {
	private final Filling filling;
	
	public DoppelKekse(Dough dough, Shape shape, Filling filling){
		super(dough, shape);
		
		this.filling = filling;
	}
	
	public Filling getFilling(){
		return filling;
	}
	
	public String toString(){
		return super.toString() + " Filling: " + filling;
	}
}
