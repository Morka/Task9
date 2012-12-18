/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public class M_RundKeksiMaschine extends EinfachKeksiMaschine {

	@Override
	public EinfacheKekse bake(Dough teig) {
		return new EinfacheKekse(teig, new S_Rund());
	}

}
