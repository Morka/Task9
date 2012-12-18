/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

import java.util.ArrayList;

public class Bakery {
	
	public Bakery() {
		
	}
	
	public Keksdose processOrder(Bestellung order) {
		
		ArrayList<Position> orderList = order.getPositionList();
		
		for(Position p : orderList) {
			
			int cookieCount = p.getnumberOfCookies();
			
			for(int i = 0; i < cookieCount; i++) {
				
				if(p.getFilling() != null){
					
					System.out.println("SINGLE KEKSI!");
					
				} else {
					
					
					
				}
				
			}
			
		}
		
		return new Keksdose();
		
	}

}
