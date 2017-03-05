/* 
 * A game by Mingjie Jiang. Idea created with Joey D. Kim. 
 * Source code available at https://github.com/mdhackclub/machieve
 * A work licensed under GNU GPL v3. Worked inside Hack Club.
 */
public class Prototype {
	
	//Global Variable Initialization
	public static int 
	init = 320, //Initial Value
	power = 320, //Ruler’s Power (int, 0-1000)
	economy = 320, //Economy (int, 0-1000)
	popularity = 320, //Poll Popularity/Support Rate (int, 0-1000)
	religion = 320, //Religion (int, 0-1000)
	military = 320, //Military Power (int, 0-1000)
	balance = 320, //Social Balance (int, 0-1000)
	foreign = 320; //Foreign Relations (int, 0-1000)
	
	public static void main(String[] args) {


	}

	public static void changeFac(int varId, int value) {

	}

	public static void reinit () {
		Prototype.power = Prototype.init;
		Prototype.economy = Prototype.init;
		Prototype.popularity = Prototype.init;
		Prototype.religion = Prototype.init;
		Prototype.military = Prototype.init;
		Prototype.balance = Prototype.init;
		Prototype.foreign = Prototype.init;
	}

}
