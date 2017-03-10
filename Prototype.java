/* 
 * A game by Mingjie Jiang. Idea created with Joey D. Kim. 
 * Source code available at https://github.com/mdhackclub/machieve
 * A work licensed under GNU GPL v3. Worked inside Hack Club.
 *
 *     ____               _           __     __  ___           __    _              
 *    / __ \_________    (_)__  _____/ /_   /  |/  /___ ______/ /_  (_)__ _   _____ 
 *   / /_/ / ___/ __ \  / / _ \/ ___/ __/  / /|_/ / __ `/ ___/ __ \/ / _ \ | / / _ \
 *  / ____/ /  / /_/ / / /  __/ /__/ /_   / /  / / /_/ / /__/ / / / /  __/ |/ /  __/
 * /_/   /_/   \____/_/ /\___/\___/\__/  /_/  /_/\__,_/\___/_/ /_/_/\___/|___/\___/ 
 *                 /___/                                                            
 */
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Prototype {
	//Global Variable Initialization
	public static int 
	init = 320, //Initial Value
	power = 320, //Ruler's Power (int, 0-1000)
	economy = 320, //Economy (int, 0-1000)
	popularity = 320, //Poll Popularity/Support Rate (int, 0-1000)
	religion = 320, //Religion (int, 0-1000)
	military = 320, //Military Power (int, 0-1000)
	balance = 320, //Social Balance (int, 0-1000)
	foreign = 320; //Foreign Relations (int, 0-1000)
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		println("Hi... Welcome!");
		
		println("The old king has died. You are in rule of the country.");

		println("What is your name?");
		
		println("[Hint: The program is waiting for your input at the \">\" symbol.]");
		
		print("It is King > ");
		String userName = sc.nextLine();
		
		print("Welcome, King " + userName +"! The Kingdom is awaiting.");
		sc.nextLine();
		
		flush();
	}

	public static void changeFac(int varId, int value) {

	}
	
	//Reinitialize Variables
	public static void reinit () {
		Prototype.power = Prototype.init;
		Prototype.economy = Prototype.init;
		Prototype.popularity = Prototype.init;
		Prototype.religion = Prototype.init;
		Prototype.military = Prototype.init;
		Prototype.balance = Prototype.init;
		Prototype.foreign = Prototype.init;
	}
	
	public static void println(String str) {
		for (int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
			try{
				Thread.sleep(20);
			} catch (Exception e) {}
		}
		System.out.println();
	}
	
	public static void print(String str) {
		for (int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
			try{
				Thread.sleep(20);
			} catch (Exception e) {}
		}
	}
	
	public static void flush() {
		for (int i=0; i<200; i++)
			System.out.println();
	}

}
