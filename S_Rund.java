/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

//subtype of Shape
public class S_Rund implements Shape {
	
	//returns a string representation containing the name of the shape
	public String toString() {
		return "Rundform";
	}
	
	public M_RundKeksiMaschine bakeWith(){
		return new M_RundKeksiMaschine();
	}
}