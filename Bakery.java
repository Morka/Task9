/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

import java.util.ArrayList;

public class Bakery {
	
	public Bakery() {
		
		//TODO: create all machines
		
	}
	
	public Keksdose processOrder(Bestellung order) {
		
		ArrayList<Position> orderList = order.getPositionList();
		
		for(Position p : orderList) {
			
			int cookieCount = p.getnumberOfCookies();
			
			for(int i = 0; i < cookieCount; i++) {
				
				//FUCK OFF SANTA!!!!! 
				//MACHINE!!! BACK COOKIES FOR THE CHRISTKINDL!!!!
				
			}
			
		}
		
		return new Keksdose();
		
	}

}
