/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

import java.util.ArrayList;

public class Bakery {
	
	private static DoppelKeksiMaschine doubleMachine;
	
	public Bakery() {
		
		doubleMachine = new DoppelKeksiMaschine();

	}
	
	public Keksdose processOrder(Bestellung order) {
		
		ArrayList<Position> orderList = order.getPositionList();
		Keksdose cookieJar = new Keksdose();
		
		for(Position p : orderList) {
			
			int cookieCount = p.getnumberOfCookies();
			ArrayList<Kekse> insertList = new ArrayList<Kekse>();
			
			for(int i = 0; i < cookieCount; i++) {
				
				if(p.getFilling() != null){
					
					//System.out.println("SINGLE KEKSI!");
					insertList.add(p.getShape().bakeWith().bake(p.getDough()));
					
				} else {
					
					EinfacheKekse tmpEinfacherKeks = new EinfacheKekse(p.getDough(), p.getShape());
					insertList.add(doubleMachine.reproduceKeksi(tmpEinfacherKeks, p.getFilling()));
					
				}
				
			}
			
			cookieJar.fillInCookies(insertList);
			
		}
		
		return cookieJar;
		
	}

}
