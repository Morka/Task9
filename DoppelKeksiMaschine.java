/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */
//Is a subtype of Maschine
public class DoppelKeksiMaschine extends Maschine {
	
	public DoppelKeksiMaschine() {

		
	}
	
	//Precondition: sourceCookie != null; fill != null
	//Postcondition: return DoppelKekse with same form and dough as sourceCookie != null
	public DoppelKekse reproduceKeksi(Kekse sourceCookie, Filling fill) {
		
		return new DoppelKekse(sourceCookie.getDough(), sourceCookie.getShape(), fill);
		
	}

}
