
public class DoppelKeksiMaschine extends Maschine {
	
	private Filling filling;
	
	public DoppelKeksiMaschine(Filling fill) {
		
		this.filling = fill;
		
	}
	
	public void insertNewFilling(Filling fill) {
		
		this.filling = fill;
		
	}
	
	public DoppelKekse reproduceKeksi(Kekse sourceCookie) {
		
		return new DoppelKekse(sourceCookie.getDough(), sourceCookie.getShape(), this.filling);
		
	}

}
