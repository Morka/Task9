/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */
//Is a subtype of EinfachKeksiMaschine
public class M_SantaKeksiMaschine extends EinfachKeksiMaschine {

	@Override
	//Precondition: teig != null
	//Postcondition: returns a santa shaped EinfacheKekse != null
	public EinfacheKekse bake(Dough teig) {
		return new EinfacheKekse(teig, new S_Weihnachtsmann());
	}

}
