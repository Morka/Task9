/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

interface Shape {
	//returns a string representation containing the name of the shape
	public String toString();
	
	public abstract EinfachKeksiMaschine bakeWith();
}