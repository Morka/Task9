/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public abstract class EinfachKeksiMaschine extends Maschine {
	
	//Precondition: teig != null
	//Postcondition: returns EinfacheKekse != null
	public abstract EinfacheKekse bake(Dough teig);

}
