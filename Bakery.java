/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

import java.util.ArrayList;

public class Bakery {
	
	MaschinenProxy roxyTheProxy;
	
	public Bakery() {
		
		this.roxyTheProxy = new MaschinenProxy();
		
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
					insertList.add(roxyTheProxy.bake(p.getShape()));//DAMMIT! wie waehl i aus? hurrerei!
					
				} else {
					
					insertList.add(roxyTheProxy.bakeDouble(p.getFilling()));
					
				}
				
			}
			
			cookieJar.fillInCookies(insertList);
			
		}
		
		return cookieJar;
		
	}

}
