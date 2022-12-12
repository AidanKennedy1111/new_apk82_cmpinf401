package apk82_MenuManager;
/**
 * This class represents the salad portion of the menu
 * @author aidankennedy
 *
 */
public class Salad extends MenuItem{
	private String name;
	private String description;
	private int calories;
	/**
	 * This constructor creates a new salad based on user-provided parameters:
	 * @param name Name of the salad
	 * @param description Description of the salad
	 * @param calories Calories in salad
	 */
	public Salad(String name, String description, int calories, double price) {
		//this.name = name;
		//this.description = description;
		//this.calories = calories;
		super(name,description,calories, price);
	}
	

}
