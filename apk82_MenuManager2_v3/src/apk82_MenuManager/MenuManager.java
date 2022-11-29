package apk82_MenuManager;
/**
 * This class serves as a manager for the menu
 * @author aidankennedy
 *
 */
import java.util.ArrayList;
import java.util.Random;

public class MenuManager {
	public ArrayList<MenuItem> entrees = new ArrayList<MenuItem>();
	public ArrayList<MenuItem> sides = new ArrayList<MenuItem>();
	public ArrayList<MenuItem> salads = new ArrayList<MenuItem>();
	public ArrayList<MenuItem> desserts = new ArrayList<MenuItem>();
	public ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
	/**
	 * 
	 * @param dishesFile the file where all dishes are located
	 */
	public MenuManager(String dishesFile) {
		
		menu = FileManager.readItems(dishesFile);
		//System.out.println(menu.get(0).getDescription());
		for(int i = 0; i<menu.size();i++) {
			if(menu.get(i) instanceof Entree) {
				entrees.add(menu.get(i));
			}
		}
		for(int i = 0; i<menu.size();i++) {
			if(menu.get(i) instanceof Side) {
				sides.add(menu.get(i));
			}
		}
		for(int i = 0; i<menu.size();i++) {
			if(menu.get(i) instanceof Salad) {
				salads.add(menu.get(i));
			}
		}
		for(int i = 0; i<menu.size();i++) {
			if(menu.get(i) instanceof Dessert) {
				desserts.add(menu.get(i));
			}
		}
		
		System.out.println(entrees);
		System.out.println(sides);
		System.out.println(salads);
		System.out.println(desserts);
	}
	
	
	
	
	
	/**
	 * @return the entrees
	 */
	public ArrayList<MenuItem> getEntrees() {
		return entrees;
	}





	/**
	 * @param entrees the entrees to set
	 */
	public void setEntrees(ArrayList<MenuItem> entrees) {
		this.entrees = entrees;
	}





	/**
	 * @return the sides
	 */
	public ArrayList<MenuItem> getSides() {
		return sides;
	}





	/**
	 * @param sides the sides to set
	 */
	public void setSides(ArrayList<MenuItem> sides) {
		this.sides = sides;
	}





	/**
	 * @return the salads
	 */
	public ArrayList<MenuItem> getSalads() {
		return salads;
	}





	/**
	 * @param salads the salads to set
	 */
	public void setSalads(ArrayList<MenuItem> salads) {
		this.salads = salads;
	}





	/**
	 * @return the desserts
	 */
	public ArrayList<MenuItem> getDesserts() {
		return desserts;
	}





	/**
	 * @param desserts the desserts to set
	 */
	public void setDesserts(ArrayList<MenuItem> desserts) {
		this.desserts = desserts;
	}





	/**
	 * @return the menu
	 */
	public ArrayList<MenuItem> getMenu() {
		return menu;
	}





	/**
	 * @param menu the menu to set
	 */
	public void setMenu(ArrayList<MenuItem> menu) {
		this.menu = menu;
	}



/**
 * 
 * @param name the name of the new menu
 * @return a randomized menu
 */

	public Menu randomMenu(String name) {
		Random rand = new Random();
		Menu newMenu = new Menu(null);
		for(MenuItem entree:entrees) {
			int thisOne = rand.nextInt(entrees.size());
			newMenu.setEntree((Entree) entrees.get(thisOne));
		}
		for(MenuItem side:sides) {
			int thisOne = rand.nextInt(sides.size());
			newMenu.setSide((Side) sides.get(thisOne));
		}
		for(MenuItem salad:salads) {
			int thisOne = rand.nextInt(salads.size());
			newMenu.setSalad((Salad) salads.get(thisOne));
		}
		for(MenuItem dessert:desserts) {
			int thisOne = rand.nextInt(desserts.size());
			newMenu.setDessert((Dessert) desserts.get(thisOne));
		}
		
		newMenu.setName(name);
		System.out.println(newMenu.getEntree());
		return newMenu;
	}
}
