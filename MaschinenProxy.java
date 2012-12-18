
public class MaschinenProxy {
	
	private static EinfachKeksiMaschine roundMachine, moonMachine, santaMachin;
	private static DoppelKeksiMaschine doubleMachine;
	
	public MaschinenProxy() {
		
		this.roundMachine = new M_RundKeksiMaschine();
		this.moonMachine = new M_MondKeksiMaschine();
		this.santaMachin = new M_SantaKeksiMaschine();
		this.doubleMachine = new DoppelKeksiMaschine();
		
	}

}
