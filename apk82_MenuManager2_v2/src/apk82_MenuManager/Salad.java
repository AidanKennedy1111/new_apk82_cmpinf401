package apk82_MenuManager;
/**
 * This class represents the salad portion of the menu
 * @author aidankennedy
 *
 */
public class Salad {
	private String name;
	private String description;
	private int calories;
	/**
	 * This constructor creates a new salad based on user-provided parameters:
	 * @param name Name of the salad
	 * @param description Description of the salad
	 * @param calories Calories in salad
	 */
	public Salad(String name, String description, int calories) {
		this.name = name;
		this.description = description;
		this.calories = calories;
	}
	/**
	 * Getter for salad's name
	 * @return salad's name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Setter for salad's name
	 * @param name salad's name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Getter for salad's description
	 * @return salad's description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * Setter for salad's description
	 * @param description salad's description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * Getter for salad's calories
	 * @return salad's calories
	 */
	public int getCalories() {
		return calories;
	}
	/**
	 * Setter for salad's calories
	 * @param calories salad's calories
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}

}
