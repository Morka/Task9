/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */
//Is a subtype of EinfachKeksiMaschine
public class M_MondKeksiMaschine extends EinfachKeksiMaschine {
	
	/**
	 * This method create a moon shaped singleCookie with the Dough teig.
	 * 
	 * @param teig	The dough of which the cookie should consist of
	 * @return	A singleCookie in the shape of the moon with the Dough teig
	 */
	@Override
	//Precondition: teig != null
	//Postcondition: returns a moon shaped EinfacheKekse != null
	public EinfacheKekse bake(Dough teig) {
		return new EinfacheKekse(teig, new S_Mond());
	}

}
