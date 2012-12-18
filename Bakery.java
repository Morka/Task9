/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

import java.util.ArrayList;

public class Bakery {
	
	private final DoppelKeksiMaschine doubleMachine;
	
	/**
	 * Constructor instantiates the doubleCookieMachine
	 * 
	 */
	//Postcondition: doubleMachine is instantiated with doubleMachine = new DoppelKeksiMaschine()
	public Bakery() {
		
		this.doubleMachine = new DoppelKeksiMaschine();

	}
	
	/**
	 * This method takes an Bestellung object, processes the order and returns a delicious smelling CookieJar
	 * 
	 * @param order	A collection of Position objects which contain the details of the order
	 * @return	A cookieJar containing fresh baked delicious Kekse.
	 */
	//Precondition: order != null
	//Postcondition: returns a Keksdose containing all Kekse according to order != null;
	public Keksdose processOrder(Bestellung order) {

		ArrayList<Position> orderList = order.getPositionList();
		Keksdose cookieJar = new Keksdose();
		
		for(Position p : orderList) {
			
			int cookieCount = p.getnumberOfCookies();
			ArrayList<Kekse> insertList = new ArrayList<Kekse>();
			
			for(int i = 0; i < cookieCount; i++) {
				
				if(p.getFilling() == null){
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
