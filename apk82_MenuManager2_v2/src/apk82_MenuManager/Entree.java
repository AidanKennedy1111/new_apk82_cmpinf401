package apk82_MenuManager;
/**
 * This class represents the entree portion of the menu
 * @author aidankennedy
 *
 */
public class Entree {


	private String name;
	private String description;
	private int calories;
	/**
	 * This constructor creates a new entree based on user-provided parameters:
	 * @param name Name of the entree
	 * @param description Description of the entree
	 * @param calories Calories in entree
	 */
	public Entree(String name, String description, int calories) {
		this.name = name;
		this.description = description;
		this.calories = calories;
	}
	/**
	 * Getter for entree's name
	 * @return entree's name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Setter for entree's name
	 * @param name entree's name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Getter for entree's description
	 * @return entree's description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * Setter for entree's description
	 * @param description entree's description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * Getter for entree's calories
	 * @return entree's calories
	 */
	public int getCalories() {
		return calories;
	}
	/**
	 * Setter for entree's calories
	 * @param calories entree's calories
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}

}
