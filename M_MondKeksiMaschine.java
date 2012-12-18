/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public class M_MondKeksiMaschine extends EinfachKeksiMaschine {

	@Override
	public EinfacheKekse bake(Dough teig) {
	
		return new EinfacheKekse(teig, new S_Mond());
	}

}
