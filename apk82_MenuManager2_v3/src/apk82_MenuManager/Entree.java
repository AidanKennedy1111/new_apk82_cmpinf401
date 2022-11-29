package apk82_MenuManager;
/**
 * This class represents the entree portion of the menu
 * @author aidankennedy
 *
 */
public class Entree extends MenuItem {


	private String name;
	private String description;
	private int calories;
	/**
	 * This constructor creates a new entree based on user-provided parameters:
	 * @param name Name of the entree
	 * @param description Description of the entree
	 * @param calories Calories in entree
	 */
	public Entree(String name, String description, int calories, double price) {
		//this.name = name;
		//this.description = description;
		//this.calories = calories;
		super(name,description,calories, price);
	}
	

}
