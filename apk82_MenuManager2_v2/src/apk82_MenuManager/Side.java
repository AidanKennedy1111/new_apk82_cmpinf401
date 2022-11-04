package apk82_MenuManager;
/**
 * This class represents the side portion of the menu
 * @author aidankennedy
 *
 */
public class Side {
	private String name;
	private String description;
	private int calories;
	/**
	 * This constructor creates a new side based on user-provided parameters:
	 * @param name Name of the side
	 * @param description Description of the side
	 * @param calories Calories in side
	 */
	public Side(String name, String description, int calories) {
		this.name = name;
		this.description = description;
		this.calories = calories;
	}
	/**
	 * Getter for side's name
	 * @return side's name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Setter for side's name
	 * @param name side's name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Getter for side's description
	 * @return side's description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * Setter for side's description
	 * @param description side's description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * Getter for side's calories
	 * @return side's calories
	 */
	public int getCalories() {
		return calories;
	}
	/**
	 * Setter for side's calories
	 * @param calories side's calories
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}
}
