package apk82_MenuManager;
/**
 * This class represents the dessert portion of the menu
 * @author aidankennedy
 *
 */
public class Dessert extends MenuItem {
	private String name;
	private String description;
	private int calories;
	/**
	 * This constructor creates a new dessert based on user-provided parameters:
	 * @param name Name of the dessert
	 * @param description Description of the dessert
	 * @param calories Calories in dessert
	 */
	public Dessert(String name, String description, int calories, double price) {
		//this.name = name;
		//this.description = description;
		//this.calories = calories;
		super(name,description,calories, price);
	}
	

}
