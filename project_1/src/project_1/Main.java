package project_1;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Main {

	/**
	 * 
	 * Main method that runs the program.
	 * 
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Logger l = Logger.getLogger("mainLog");
		Parser p = new Parser("inputs/bad.json", l);
		//Parser p = new Parser("inputs/example.json", l);
		
		ArrayList<Article> articles = p.parse();
		for(Article a : articles) {	
			System.out.print(a);
		}
		
		
	}

}
