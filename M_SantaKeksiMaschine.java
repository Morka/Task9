/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */
//Is a subtype of EinfachKeksiMaschine
public class M_SantaKeksiMaschine extends EinfachKeksiMaschine {

	/**
	 * This method create a santa shaped singleCookie with the Dough teig.
	 * 
	 * @param teig	The dough of which the cookie should consist of
	 * @return	A singleCookie in the shape of santa with the Dough teig
	 */
	@Override
	//Precondition: teig != null
	//Postcondition: returns a santa shaped EinfacheKekse != null
	public EinfacheKekse bake(Dough teig) {
		return new EinfacheKekse(teig, new S_Weihnachtsmann());
	}

}
