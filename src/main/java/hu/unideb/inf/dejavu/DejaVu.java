package hu.unideb.inf.dejavu;

import hu.unideb.inf.dejavu.gui.DejaVuGUI;
import javafx.application.Application;

/**
 * A main metódust tartalmazó osztály.
 * 
 * A {@code DejaVu} osztály tartalmazza a játékban lévő objektumokat.
 * 
 * @author iam346
 *
 */
public class DejaVu {

	/**
	 * A logika
	 */
	public static Game game;
	
	public static IData DB;

	/**
	 * A program main metódusa.
	 * 
	 * @param args
	 *            Parancssori argumentumok.
	 */
	public static void main(String[] args) {
		DB= new DataB();
		DB.connect();
		game = new Game();
		
		Application.launch(DejaVuGUI.class);
	}

}
