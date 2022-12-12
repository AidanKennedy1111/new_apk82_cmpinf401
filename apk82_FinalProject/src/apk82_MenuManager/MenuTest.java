package apk82_MenuManager;
/**
 * Class MenuTest
 * @author aidankennedy
 * created 10/13/2022
 * This class tests all functionalities of the menu class
 */
public class MenuTest {

	public static void main(String[] args) {
		/**
		Entree entree1 = new Entree("chicken","grilled chicken breast seasoned with salt and pepper",350);
		Entree entree2 = new Entree("burger","fresh cheeseburger with onions lettuce and tomatoes",500);
		
		Side side1 = new Side("fries", "straight cut french fries",350);
		Salad salad1 = new Salad("house","house salad with ranch dressing",300);
		Salad salad2 = new Salad("ceaser","ceaser salad with ceaser dressing",300);
		Dessert dessert1 = new Dessert("ice cream","chocalate ice cream cone with sprinkles",500);
		Menu menu1 = new Menu("Menu 1",entree1,side1,salad1,dessert1);
		Menu menu2 = new Menu("Menu 2",entree2,side1);
		Menu menu3 = new Menu("Menu 3");
		
		
		
		System.out.println(menu1.getName());
		System.out.println(menu1.description());
		System.out.println(menu1.totalCalories());

		System.out.println(menu2.getName());
		System.out.println(menu2.description());
		System.out.println(menu2.totalCalories());
		
		System.out.println(menu3.getName());
		System.out.println(menu3.description());
		System.out.println(menu3.totalCalories());
		
		MenuRandomize randomize = new MenuRandomize("data/entrees.txt",
				"data/sides.txt","data/salads.txt","data/desserts.txt");
			Menu myMenu = randomize.randomMenu();
			System.out.println(myMenu.description()+"\nTotal calories: "+
								myMenu.totalCalories());
								*/
		MenuManager m =new MenuManager("data/dishes.txt");
		//m.randomMenu("W");
		

	}

}
