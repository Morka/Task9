/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public class Test {

	public static void main(String[] args) {

		Bakery bakery1 = new Bakery();
		
		Bestellung bestellung1 = new Bestellung();
		Bestellung bestellung2 = new Bestellung();
		
		Dough muerbTeig = new D_Muerb();
		Dough schokoTeig = new D_Schoko();
		Dough zimtTeig = new D_Zimt();
		
		Shape mondS = new S_Mond();
		Shape rundS = new S_Rund();
		Shape weihS = new S_Weihnachtsmann();
		
		Filling marmF = new F_Marmelade();
		Filling schokoF = new F_Schoko();
		
		Position position1 = new Position(15, muerbTeig, rundS, null);
		Position position2 = new Position(2, schokoTeig, rundS, null);
		Position position3 = new Position(42, zimtTeig, weihS, marmF);
		Position position4 = new Position(3, muerbTeig, mondS, schokoF);
		
		bestellung1.insertNewPosition(position1);
		bestellung1.insertNewPosition(position2);
		bestellung1.insertNewPosition(position3);
		
		bestellung2.insertNewPosition(position4);
		bestellung2.insertNewPosition(position2);
		
		System.out.println(bestellung2.drucke());
		
		Keksdose keksdose1 = bakery1.processOrder(bestellung1);
		
		System.out.println(keksdose1.inhalt());
	}
}
