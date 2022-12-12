package apk82_MenuManager;
/**
 * Class MenuRandomize
 * @author aidankennedy
 * @created 11/4/2022
 */
import java.util.ArrayList;
import java.util.Random;

public class MenuRandomize {
	/**
	 * Initialize all array lists for each part of meal 
	 */
	ArrayList<Entree> entrees = new ArrayList<Entree>();
	ArrayList<Side> sides = new ArrayList<Side>();
	ArrayList<Salad> salads = new ArrayList<Salad>();
	ArrayList<Dessert> desserts = new ArrayList<Dessert>();
	/**
	 * The constuctor uses FileManager to load data from these text files into 4 arraylists
	 * @param entreeFile - file containing entrees
	 * @param sideFile - file containing sides
	 * @param saladFile - file containing salads
	 * @param dessertFile - file containing desserts
	 */
	public MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile) {
		//entrees = FileManager.readEntrees(entreeFile);
		//sides = FileManager.readSides(sideFile);
		//salads = FileManager.readSalads(saladFile);
		//desserts = FileManager.readDesserts(dessertFile);
	}
	/**
	 * Method randomMenu
	 * @return the new randomized menu
	 */
	public Menu randomMenu() {
		Random rand = new Random();
		Menu newMenu = new Menu(null);
		for(Entree entree:entrees) {
			int thisOne = rand.nextInt(entrees.size());
			newMenu.setEntree(entrees.get(thisOne));
		}
		for(Side side:sides) {
			int thisOne = rand.nextInt(sides.size());
			newMenu.setSide(sides.get(thisOne));
		}
		for(Salad salad:salads) {
			int thisOne = rand.nextInt(salads.size());
			newMenu.setSalad(salads.get(thisOne));
		}
		for(Dessert dessert:desserts) {
			int thisOne = rand.nextInt(desserts.size());
			newMenu.setDessert(desserts.get(thisOne));
		}
		
		return newMenu;
	}
}
