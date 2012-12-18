/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */
//Is a subtype of Maschine
public class DoppelKeksiMaschine extends Maschine {
	
	/**
	 * Instantiates a DoppelKeksiMaschine object
	 * 
	 */
	//Postcondition: Returns an instance of DoppelKeksiMaschine != null
	public DoppelKeksiMaschine() {

		
	}
	
	/**
	 * This method will scan the given cookie and create a DoubleCookie version of it with the given Filling.
	 * 
	 * @param sourceCookie	The sourceCookie to scan and reproduce
	 * @param fill	The Filling for the DoubleSidedCookie
	 * @return	A doubleCookie of the same type as sourceCookie and the Filling fill
	 */
	//Precondition: sourceCookie != null; fill != null
	//Postcondition: return DoppelKekse with same form and dough as sourceCookie != null
	public DoppelKekse reproduceKeksi(Kekse sourceCookie, Filling fill) {
		
		return new DoppelKekse(sourceCookie.getDough(), sourceCookie.getShape(), fill);
		
	}

}
