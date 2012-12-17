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
				
				//DO BAKING COOKIES FOR SANTA
				
			}
			
		}
		
		return new Keksdose();
		
	}

}
