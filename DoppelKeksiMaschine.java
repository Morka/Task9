
public class DoppelKeksiMaschine extends Maschine {
	
	public DoppelKeksiMaschine() {

		
	}
	
	public DoppelKekse reproduceKeksi(Kekse sourceCookie, Filling fill) {
		
		return new DoppelKekse(sourceCookie.getDough(), sourceCookie.getShape(), fill);
		
	}

}
