/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */
//Is a subtype of EinfachKeksiMaschine
public class M_RundKeksiMaschine extends EinfachKeksiMaschine {

	
	/**
	 * This method create a round singleCookie with the Dough teig.
	 * 
	 * @param teig	The dough of which the cookie should consist of
	 * @return	A singleCookie in the shape of a circle with the Dough teig
	 */
	@Override
	//Precondition: teig != null
	//Postcondition: returns a round EinfacheKekse != null
	public EinfacheKekse bake(Dough teig) {
		return new EinfacheKekse(teig, new S_Rund());
	}

}
