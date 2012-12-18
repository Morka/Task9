/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

import java.util.ArrayList;

public class Bestellung {
	private ArrayList<Position> positionList; 
	
	public Bestellung(){
		positionList = new ArrayList<Position>();
	}
	
	/**
	 * Inserts new Position
	 * @param position: a Position which contains the numberOfCookies, Dough etc...
	 * */
	//Precondition: position != null
	//Postcondition: positionList contains position
	public void insertNewPosition(Position position){
		positionList.add(position);
	}
	
	/**
	 * Return the ArrayList positionList
	 * 
	 * @return List of Positions stored by this Bestellung
	 * */
	
	public ArrayList<Position> getPositionList(){
		return positionList;
	}
	
	/**
	 * Invokes toString() method of Bestellung
	 * 
	 * @return String which contains every Position of the positionList
	 * */

	//Precondition: positionList != null
	public String drucke(){
		return this.toString();
	}
	
	/**
	 * Iterates through arrayList, invokes the toString() method of each position and stores it in
	 * a String
	 * 
	 * @return String that describes the Bestellung
	 * */
	public String toString(){
		String ret = "";
		
		for(Position p : positionList){
			ret += p.toString();
		}
		
		return ret;
	}
}
