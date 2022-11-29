package apk82_MenuManager;
/**
 * This class represents the side portion of the menu
 * @author aidankennedy
 *
 */
public class Side extends MenuItem{
	private String name;
	private String description;
	private int calories;
	/**
	 * This constructor creates a new side based on user-provided parameters:
	 * @param name Name of the side
	 * @param description Description of the side
	 * @param calories Calories in side
	 */
	public Side(String name, String description, int calories,double price) {
		//this.name = name;
		//this.description = description;
		//this.calories = calories;
		super(name,description,calories, price);
	}
	
}
