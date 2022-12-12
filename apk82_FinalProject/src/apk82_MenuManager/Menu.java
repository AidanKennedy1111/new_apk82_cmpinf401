package apk82_MenuManager;
/**
 * This class serves as a manager for the menu
 * @author aidankennedy
 *
 */
public class Menu {
	private String name;
	private Entree entree = null;
	private Dessert dessert = null; 
	private Side side = null;
	private Salad salad = null;
	/**
	 * This constructor creates a new menu based on user-provided parameters:
	 * @param name Menu's name
	 */
	public Menu(String name) {
		this.name = name;
	}
	/**
	 * This constructor creates a new menu based on user-provided parameters:
	 * @param name Menu's name
	 * @param entree Menu's Entree
	 * @param side Menu's Side
	 */
	public Menu(String name, Entree entree, Side side) {
		this.name = name;
		this.entree = entree;
		this.side = side;
	}
	/**
	 * This constructor creates a new menu based on user-provided parameters:
	 * @param name Menu's name
	 * @param entree Menu's Entree
	 * @param side Menu's Side
	 * @param salad Menu's Salad
	 * @param dessert Menu's Dessert
	 */
	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.salad = salad;
		this.dessert = dessert;
	}
	/**
	 * This method returns the total calories of all parts of the menu
	 * If there is no entree, side, salad, or dessert the program will return "no x" and calories for this part of the meal will be 0
	 * @return total calories
	 */
	public int totalCalories() {
		
		if(dessert==null&&salad==null&&side==null&&entree==null) {
			System.out.print("total calories are: null");
			return 0;
		}
		
		return entree.getCalories()+side.getCalories()+salad.getCalories()+dessert.getCalories();
	}
	/**
	 * This method returns the description of all parts of the menu
	 * If there is no entree, side, salad, or dessert program will return "no x"
	 * @return description of menu
	 */
	public String description() {
		
		return "Entree: "+ entree.getDescription()+"\nSide: "+side.getDescription()+"\nSalad: "+ salad.getDescription()+"\nDessert: "+dessert.getDescription();

	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the entree
	 */
	public Entree getEntree() {
		return entree;
	}
	/**
	 * @param entree the entree to set
	 */
	public void setEntree(Entree entree) {
		this.entree = entree;
	}
	/**
	 * @return the dessert
	 */
	public Dessert getDessert() {
		return dessert;
	}
	/**
	 * @param dessert the dessert to set
	 */
	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}
	/**
	 * @return the side
	 */
	public Side getSide() {
		return side;
	}
	/**
	 * @param side the side to set
	 */
	public void setSide(Side side) {
		this.side = side;
	}
	/**
	 * @return the salad
	 */
	public Salad getSalad() {
		return salad;
	}
	/**
	 * @param salad the salad to set
	 */
	public void setSalad(Salad salad) {
		this.salad = salad;
	}
	@Override
	public String toString() {
		return this.name;
	}

}
