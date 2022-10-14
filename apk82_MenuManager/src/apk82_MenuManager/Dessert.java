package apk82_MenuManager;
/**
 * This class represents the dessert portion of the menu
 * @author aidankennedy
 *
 */
public class Dessert {
	private String name;
	private String description;
	private int calories;
	/**
	 * This constructor creates a new dessert based on user-provided parameters:
	 * @param name Name of the dessert
	 * @param description Description of the dessert
	 * @param calories Calories in dessert
	 */
	public Dessert(String name, String description, int calories) {
		this.name = name;
		this.description = description;
		this.calories = calories;
	}
	/**
	 * Getter for dessert's name
	 * @return dessert's name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Setter for dessert's name
	 * @param name dessert's name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Getter for dessert's description
	 * @return dessert's description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * Setter for dessert's description
	 * @param description dessert's description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * Getter for dessert's calories
	 * @return dessert's calories
	 */
	public int getCalories() {
		return calories;
	}
	/**
	 * Setter for dessert's calories
	 * @param calories dessert's calories
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}

}
