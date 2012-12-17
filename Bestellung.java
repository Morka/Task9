/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */
import java.util.ArrayList;

public class Bestellung {
	private ArrayList<Position> positionList; 
	
	public Bestellung(){
		positionList = new ArrayList<Position>();
	}
	
	
	public void insertNewPosition(Position position){
		positionList.add(position);
	}
	
	public ArrayList<Position> getPositionList(){
		return positionList;
	}
	
	public String toString(){
		String ret = "";
		
		for(Position p : positionList){
			ret += p.toString();
		}
		
		return ret;
	}
	
	public String drucke(){
		return this.toString();
	}
}
