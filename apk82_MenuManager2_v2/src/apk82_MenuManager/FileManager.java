package apk82_MenuManager;
/**
 * Class FileManager
 * @author aidankennedy
 * created 11/3/2022
 * This class reads different types of dishes from different files and 
 * each method (besides findWorkingDirectory) returns an ArrayList
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
	 * @return each method returns an arrayList of all of the different types of dishes for each category
	 */
	public static ArrayList<Entree> readEntrees(String fileName) {
		String path = findWorkingDirectory()+ "/" + fileName;
		ArrayList<Entree> entreeList = new ArrayList<Entree>();
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line=br.readLine())!=null) {
				//Split lines into this array
				String[] x = line.split("@@");
				//Check if name, description, and calories are all in array
				if (x.length==3) {
					int tempCal = Integer.parseInt(x[2]);
					Entree n = new Entree(x[0],x[1],tempCal);
					entreeList.add(n);
					
					x[0]=null;
					x[1]=null;
					x[2]=null;
				}
				
				
			}
			br.close();
			fr.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return entreeList;
	}
	public static ArrayList<Side> readSides(String fileName) {
		String path = findWorkingDirectory() + "/" + fileName;
		ArrayList<Side> sideList = new ArrayList<Side>();
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line=br.readLine())!=null) {
				//Split lines into this array
				String[] x = line.split("@@");
				//Check if name, description, and calories are all in array
				if (x.length==3) {
					int tempCal = Integer.parseInt(x[2]);
					Side n = new Side(x[0],x[1],tempCal);
					sideList.add(n);
					
					x[0]=null;
					x[1]=null;
					x[2]=null;
				}
				
				
			}
			br.close();
			fr.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return sideList;
	}
	public static ArrayList<Salad> readSalads(String fileName) {
		String path = findWorkingDirectory() + "/" + fileName;
		ArrayList<Salad> saladList = new ArrayList<Salad>();
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line=br.readLine())!=null) {
				//Split lines into this array
				String[] x = line.split("@@");
				//Check if name, description, and calories are all in array
				if (x.length==3) {
					int tempCal = Integer.parseInt(x[2]);
					Salad n = new Salad(x[0],x[1],tempCal);
					saladList.add(n);
					
					x[0]=null;
					x[1]=null;
					x[2]=null;
				}
				
				
			}
			br.close();
			fr.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return saladList;
	}
	public static ArrayList<Dessert> readDesserts(String fileName) {
		String path = findWorkingDirectory() + "/" + fileName;
		ArrayList<Dessert> dessertList = new ArrayList<Dessert>();
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line=br.readLine())!=null) {
				//Split lines into this array
				String[] x = line.split("@@");
				//Check if name, description, and calories are all in array
				if (x.length==3) {
					int tempCal = Integer.parseInt(x[2]);
					Dessert n = new Dessert(x[0],x[1],tempCal);
					dessertList.add(n);
					
					x[0]=null;
					x[1]=null;
					x[2]=null;
				}
				
				
			}
			br.close();
			fr.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return dessertList;
	}
}
