
public class MaschinenProxy {
	
	private static EinfachKeksiMaschine roundMachine, moonMachine, santaMachin;
	private static DoppelKeksiMaschine doubleMachine;
	
	public MaschinenProxy() {
		
		this.roundMachine = new M_RundKeksiMaschine();
		this.moonMachine = new M_MondKeksiMaschine();
		this.santaMachin = new M_SantaKeksiMaschine();
		this.doubleMachine = new DoppelKeksiMaschine();
		
	}
	
	public EinfacheKekse bake(S_Rund roundShape) {
		
		return null;
		
	}
	
	public EinfacheKekse bake(S_Mond moonShape) {
		
		return null;
		
	}
	
	public EinfacheKekse bake(S_Weihnachtsmann santaShape) {
		
		return null;
		
	}
	
	public DoppelKekse bakeDouble(Filling fill) {
		
		return null;
		
	}

}
