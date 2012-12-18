/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */
import java.util.Stack;
import java.util.ArrayList;
import java.util.Iterator;

public class Keksdose {
	private Stack<Kekse> cookies;

	public Keksdose(){
		cookies = new Stack<Kekse>();
	}
	
	/**
	 * Fills a list of cookies into the Stack "cookies"
	 * 
	 * @param cookiesList: a list of Cookies which should be filled into "cookies"
	 * */
	//Precondition: cookies != null
	//Postcondition: cookies stores more cookies now
	public void fillInCookies(ArrayList<Kekse> cookiesList){
		for(Kekse k : cookiesList){
			cookies.push(k);
		}
	}
	/**
	 * inhalt() gives back a description of the content of the cookie box
	 * 
	 * @return String which contains the toString() method result of each cookie
	 * */
	
	public String inhalt(){
		String ret = "";
		
		Iterator<Kekse> iter = cookies.iterator();
		
		while(iter.hasNext()){
			ret += iter.next().toString() + "\n";
		}
		
		return ret;
	}
	/**
	 * Gives back a description of the cookie box itself
	 * 
	 * @return a description based on the size of "cookies"
	 * */
	public String toString(){
		String ret;
		if(cookies.size() <= 5){
			ret = "Die Keksdose beinhaltet nur " + cookies.size() + " Kekse :(";
		}
		else{
			ret = "Die Keksdose beinhaltet " + cookies.size() + " Kekse :-)";
		}
		return ret;
	}
}
