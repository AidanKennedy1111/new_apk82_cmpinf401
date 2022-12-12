package apk82_MenuManager;
/**
 * Class FileManager
 * @author aidankennedy
 * created 11/3/2022
 * This class reads different types of dishes from different files and 
 * each method (besides findWorkingDirectory) returns an ArrayList
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
	
	/**
	 * Method findWorkingDirectory
	 * @return returns where the working directory is for this project
	 */
	private static String findWorkingDirectory() {
		String where = System.getProperty("user.dir");
		return where;
	}
	/**
	 * 
	 * @param fileName name of the file where data for each type of dish is located
	 * @return returns an arrayList of all of the different types of dishes for each category
	 */
	
	public static ArrayList<MenuItem> readItems(String fileName) {
		String path = findWorkingDirectory()+ "/" + fileName;
		ArrayList<MenuItem> menuList = new ArrayList<MenuItem>();
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line=br.readLine())!=null) {
				//Split lines into this array
				String[] x = line.split("@@");
				//Check if name, description, calories, and price are all in array
				if (x.length==5) {
					int tempCal = Integer.parseInt(x[3]);
					double tempPrice = Double.parseDouble(x[4]);
					
					if(x[1].equals("entree")) {
						Entree ent = new Entree(x[0],x[2],tempCal,tempPrice);
						menuList.add(ent);
					}else if(x[1].equals("side")) {
						Side sid = new Side(x[0],x[2],tempCal,tempPrice);
						menuList.add(sid);
					}else if(x[1].equals("salad")) {
						Salad sal = new Salad(x[0],x[2],tempCal,tempPrice);
						menuList.add(sal);
					}else if(x[1].equals("dessert")) {
						Dessert dess = new Dessert(x[0],x[2],tempCal,tempPrice);
						menuList.add(dess);
					}
					
					
					x[0]=null;
					x[1]=null;
					x[2]=null;
					x[3]=null;
					x[4]=null;
				}
				
				
			}
			br.close();
			fr.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return menuList;
	}
	/**
	 * 
	 * @param fileName file that you will write to
	 * @param menus menus you will write to that file
	 */
	public static void writeMenu(String fileName,ArrayList<Menu> menus) {
		try {
			
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i = 0; i<menus.size();i++) {
				Menu writeM = menus.get(i);
				Entree writeEntree = writeM.getEntree();
				Side writeSide = writeM.getSide();
				Salad writeSalad = writeM.getSalad();
				Dessert writeDessert = writeM.getDessert();
				bw.write(writeM.getName()+"@@"+writeEntree.getName()+"@@"+writeEntree.getDescription()+"@@"+writeEntree.getCalories()+"@@"+writeEntree.getPrice()
				+"@@"+writeSide.getName()+"@@"+writeSide.getDescription()+"@@"+writeSide.getCalories()+"@@"+writeSide.getPrice()
				+"@@"+writeSalad.getName()+"@@"+writeSalad.getDescription()+"@@"+writeSalad.getCalories()+"@@"+writeSalad.getPrice()
				+"@@"+writeDessert.getName()+"@@"+writeDessert.getDescription()+"@@"+writeDessert.getCalories()+"@@"+writeDessert.getPrice()
				+"@@"+" Total Calories: "+String.valueOf(writeEntree.getCalories()+writeSide.getCalories()+writeSalad.getCalories()+writeDessert.getCalories())
				+"@@"+" Total Price: "+String.valueOf(writeEntree.getPrice()+writeSide.getPrice()+writeSalad.getPrice()+writeDessert.getPrice())
						
						);
			}
			bw.close();
			fw.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
