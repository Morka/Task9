/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */
//Superclass and supertype for all EinfachKeksiMaschinen
public abstract class EinfachKeksiMaschine extends Maschine {
	
	/**
	 * Will take a Dough and create a cookie with the given dough according to its shape type.
	 * 
	 * @param teig	The dough of which the cookie will consist
	 * @return	A SingleCookie with the given dough and the shape according to the machine type.
	 */
	//Precondition: teig != null
	//Postcondition: returns EinfacheKekse != null
	public abstract EinfacheKekse bake(Dough teig);

}
