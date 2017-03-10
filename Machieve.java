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

public class Machieve {
	//Global Variable Initialization
	public static int 
	score = 0,
	init = 320, //Initial Value
	power = 320, //Ruler's Power (int, 0-1000)
	economy = 320, //Economy (int, 0-1000)
	popularity = 320, //Poll Popularity/Support Rate (int, 0-1000)
	religion = 320, //Religion (int, 0-1000)
	military = 320, //Military Power (int, 0-1000)
	balance = 320, //Social Balance (int, 0-1000)
	foreign = 320; //Foreign Relations (int, 0-1000)
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		story_load();
		
		story_welcome();
		
		
		System.out.println("Bravo! You've reached the end of the game.");
	}

	public static void changeFac(int varId, int value) {

	}
	
	//Reinitialize Variables
	public static void reinit () {
		Machieve.score = 0;
		Machieve.power = Machieve.init;
		Machieve.economy = Machieve.init;
		Machieve.popularity = Machieve.init;
		Machieve.religion = Machieve.init;
		Machieve.military = Machieve.init;
		Machieve.balance = Machieve.init;
		Machieve.foreign = Machieve.init;
	}
	
	public static void println(String str) {
		for (int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
			try{
				Thread.sleep(50);
			} catch (Exception e) {}
		}
		System.out.println();
	}
	
	public static void print(String str) {
		for (int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
			try{
				Thread.sleep(50);
			} catch (Exception e) {}
		}
	}
	
	public static void flush() {
		for (int i=0; i<200; i++)
			System.out.println();
	}
	
	public static void story_welcome() {
		
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
	
	public static void story_load() {
		println("A game by Mingjie Jiang. Idea created with Joey D. Kim.");
		println("A work licensed under GNU GPL v3. Worked inside Hack Club.");
		println("Loading");
		
		
		for (int i=0; i<8; i++) {
			print("...");
			try{
				Thread.sleep(500);
			} catch (Exception e) {}
		}
		println("");
		println("Complete! Welcome to the Machieve World...");
		println("");
		print("Entering in 3...");
		try{
			Thread.sleep(1000);
		} catch (Exception e) {}
		print("2...");
		try{
			Thread.sleep(1000);
		} catch (Exception e) {}
		print("1...");
		try{
			Thread.sleep(1000);
		} catch (Exception e) {}
		flush();
	}

}
