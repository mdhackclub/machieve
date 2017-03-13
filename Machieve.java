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
	year = 0,
	init = 320, //Initial Value
	power = 320, //Ruler's Power (int, 0-1000)
	economy = 320, //Economy (int, 0-1000)
	popularity = 320, //Poll Popularity/Support Rate (int, 0-1000)
	religion = 320, //Religion (int, 0-1000)
	military = 320, //Military Power (int, 0-1000)
	balance = 320, //Social Balance (int, 0-1000)
	foreign = 320; //Foreign Relations (int, 0-1000)
	public static String
	userName = "";
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		story_load();
		
		story_welcome();
		
		while (checkProg()) {
			story_next();
		}
		
		System.out.println("Bravo! You've reached the end of the game.");
	}

	
	
	//Reinitialize Variables
	public static void reinit () {
		Machieve.score = 0;
		Machieve.year = 0;
		Machieve.power = Machieve.init;
		Machieve.economy = Machieve.init;
		Machieve.popularity = Machieve.init;
		Machieve.religion = Machieve.init;
		Machieve.military = Machieve.init;
		Machieve.balance = Machieve.init;
		Machieve.foreign = Machieve.init;
	}
	
	public static boolean checkProg () {
		if (Machieve.power < 0 || 
			Machieve.economy < 0 || 
			Machieve.popularity < 0 || 
			Machieve.religion < 0 ||
			Machieve.military < 0 ||
			Machieve.balance < 0 ||
			Machieve.foreign < 0)
				return false;
		return true;	
	}
	
	public static void println(String str) {
		for (int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
			try{
				Thread.sleep(0);
			} catch (Exception e) {}
		}
		System.out.println();
	}
	
	public static void print(String str) {
		for (int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
			try{
				Thread.sleep(0);
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
		
		print("It is the great > ");
		Machieve.userName = sc.nextLine();
		
		print("Welcome, " + Machieve.userName +"! The Kingdom is awaiting.");
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
	
	public static void story_next () {
		//Header
		Machieve.year++;
		println("Year: " + Machieve.year + " A.D.");
		
		//First Year Story
		if (Machieve.year == 1) 
			story_first();
	}
	
	public static void story_first() {
		println("It\'s a new territory! As the leader of the explorers, you are automatically in charge of everything. ");
		print("Do you accpet this honor? (yes/no) > ");
		sc.nextLine();
		
		println("Here... Take this crown...");
		println("I sincerely don\'t care about what you think.");
		println("But I'm sure your people do. ");
		println("Long live the first King of " + Machieve.userName + "sland!");
		
		int choice = 0;
		do {
		println("[Advisor Kim]: What do you want your citizens to call you?");
		println("[1] Dictator " + Machieve.userName);
		println("[2] King " + Machieve.userName);
		println("[3] Lord " + Machieve.userName);
		println("[4] Your Majesty");
		
		String[] call = {"Dictator", "King", "Lord", "Your Majesty"};
		
		choice = sc.nextInt();
		if (choice < 1 || choice >4) {
			println("[Advisor Kim]: Please allow me to say this but...");
			println("... Your choice doesn't make sense.");
		}
		else {
			if (choice != 4)
				Machieve.userName = call[choice-1] + " " + Machieve.userName;
			else {
				Machieve.userName = call[3];
				println("[Narrator]: Your name disappeared in the history.");
			}
		}
		} while (choice <1 || choice >4);
		
		
		
		
	}
	
	public static void story_war() {
		println("[Solder 2333]: " + Machieve.userName + "! The enemy\'s army is at the capitol!");
		
		
	}

}
