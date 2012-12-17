
public class DoppelKekse extends Kekse {
	private final Filling filling;
	
	public DoppelKekse(Dough dough, Shape shape, Filling filling){
		super(dough, shape);
		
		this.filling = filling;
	}
	
	public Filling getFilling(){
		return filling;
	}
}
