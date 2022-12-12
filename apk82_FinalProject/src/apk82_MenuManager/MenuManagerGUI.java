package apk82_MenuManager;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class MenuManagerGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuManagerGUI frame = new MenuManagerGUI();
					frame.setTitle("Menu Manager");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuManagerGUI() {
		
		MenuManager m =new MenuManager("data/dishes.txt");
		ArrayList<MenuItem> entrees = new ArrayList<MenuItem>();
		ArrayList<MenuItem> sides = new ArrayList<MenuItem>();
		ArrayList<MenuItem> salads = new ArrayList<MenuItem>();
		ArrayList<MenuItem> desserts = new ArrayList<MenuItem>();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 733, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Build Your Own Menu");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_7 = new JLabel("Created Menus:");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 3;
		gbc_lblNewLabel_7.gridy = 1;
		contentPane.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		JLabel lblNewLabel_1 = new JLabel("Entree");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		//Entree ComboBox
		JComboBox comboBox = new JComboBox();
		entrees = m.getEntrees();
		for(int i = 0; i< entrees.size(); i++){
			comboBox.addItem(entrees.get(i));
		}
		
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 2;
		contentPane.add(comboBox, gbc_comboBox);
		
		//List of menus
		JList list = new JList();
		DefaultListModel listModel = new DefaultListModel();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridwidth = 3;
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 3;
		gbc_list.gridy = 2;
		contentPane.add(list, gbc_list);
		
		JLabel lblNewLabel_2 = new JLabel("Side");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 3;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		//Side ComboBox
		JComboBox comboBox_1 = new JComboBox();
		sides = m.getSides();
		for(int i = 0; i< sides.size(); i++){
			comboBox_1.addItem(sides.get(i));
		}
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 3;
		contentPane.add(comboBox_1, gbc_comboBox_1);
		//Details Button
		JButton btnNewButton_4 = new JButton("Details");
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_4.gridx = 3;
		gbc_btnNewButton_4.gridy = 3;
		contentPane.add(btnNewButton_4, gbc_btnNewButton_4);
		
		//Delete all button
		JButton btnNewButton_5 = new JButton("Delete all");
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_5.gridx = 4;
		gbc_btnNewButton_5.gridy = 3;
		contentPane.add(btnNewButton_5, gbc_btnNewButton_5);
		//Save to file button
		JButton btnNewButton_6 = new JButton("Save to file");
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_6.gridx = 5;
		gbc_btnNewButton_6.gridy = 3;
		contentPane.add(btnNewButton_6, gbc_btnNewButton_6);
		
		JLabel lblNewLabel_3 = new JLabel("Salad");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 4;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		//Salad ComboBox
		JComboBox comboBox_2 = new JComboBox();
		salads = m.getSalads();
		for(int i = 0; i< salads.size(); i++){
			comboBox_2.addItem(salads.get(i));
		}
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 1;
		gbc_comboBox_2.gridy = 4;
		contentPane.add(comboBox_2, gbc_comboBox_2);
		
		JLabel lblNewLabel_4 = new JLabel("Dessert");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 5;
		contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		//Dessert ComboBox
		JComboBox comboBox_3 = new JComboBox();
		desserts = m.getDesserts();
		for(int i = 0; i< desserts.size(); i++){
			comboBox_3.addItem(desserts.get(i));
		}
		GridBagConstraints gbc_comboBox_3 = new GridBagConstraints();
		gbc_comboBox_3.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_3.gridx = 1;
		gbc_comboBox_3.gridy = 5;
		contentPane.add(comboBox_3, gbc_comboBox_3);
		
		
		
		
		//Button to create user crafted menu
		JButton btnNewButton = new JButton("Create a Menu with these dishes ");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 6;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		
		
		JLabel lblNewLabel_5 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 1;
		gbc_lblNewLabel_5.gridy = 7;
		contentPane.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Or generate a Menu");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 1;
		gbc_lblNewLabel_6.gridy = 8;
		contentPane.add(lblNewLabel_6, gbc_lblNewLabel_6);
		//Random Menu Button
		JButton btnNewButton_1 = new JButton("Generate a random Menu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 9;
		contentPane.add(btnNewButton_1, gbc_btnNewButton_1);
		
		//generate menu with these dishes button action
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//Ask for name of menu
				String menuName = JOptionPane.showInputDialog("What will you name this menu?");
				//Get All Items from ComboBoxes
				Entree entreeItem = (Entree)comboBox.getSelectedItem();
				Side sideItem = (Side)comboBox_1.getSelectedItem();
				Salad saladItem = (Salad)comboBox_2.getSelectedItem();
				Dessert dessertItem = (Dessert)comboBox_3.getSelectedItem();
				//create new menu and add to list
				Menu newMenu = new Menu(menuName,entreeItem,sideItem,saladItem,dessertItem);
				listModel.addElement(newMenu);
				list.setModel(listModel);
			}
		});
		//generate random menu button action
		btnNewButton_1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					//Ask for name of menu
					String menuName = JOptionPane.showInputDialog("What will you name this menu?");
					//Makre random menu and add to list
					MenuManager randMenuManager = new MenuManager("data/dishes.txt");
					Menu newMenu = randMenuManager.randomMenu(menuName);
					listModel.addElement(newMenu);
					list.setModel(listModel);
				}
			});
		//Delete All Button
		btnNewButton_5.addActionListener(new ActionListener() {
			@Override
				public void actionPerformed(ActionEvent e) {
				String check = JOptionPane.showInputDialog("Type 'Yes' to Confirm Delete All");
				if(check.equalsIgnoreCase("Yes")) {
					listModel.clear();
					list.setModel(listModel);
				}
				}
			});
		//Save to File Button
		btnNewButton_6.addActionListener(new ActionListener() {
			@Override
				public void actionPerformed(ActionEvent e) {
				ArrayList<Menu> menus = new ArrayList<Menu>();
				if(listModel.getSize()>0) {
				for(int i = 0; i<listModel.getSize();i++) {
					Menu m = (Menu)listModel.getElementAt(i);
					menus.add(m);
				}
				FileManager.writeMenu("data/menus.txt", menus);
				JOptionPane.showMessageDialog(null, "Saved to menus.txt!");
				}else {
				JOptionPane.showMessageDialog(null, "There were no menus to save!");
				}
				}
			});
		//Details button
		btnNewButton_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Menu sMenu = null;
				sMenu = (Menu)list.getSelectedValue();
				if(sMenu!=null) {
					Entree thisEntree = sMenu.getEntree();
					Side thisSide = sMenu.getSide();
					Salad thisSalad = sMenu.getSalad();
					Dessert thisDessert = sMenu.getDessert();
					JFrame secondaryWindow = new JFrame(sMenu.getName());
					secondaryWindow.setVisible(true);
					secondaryWindow.setBounds(100, 100, 1100, 535);
					//Entree Label
					JLabel entreeLabel = new JLabel("Entree");
					entreeLabel.setBounds(50, 110, 110, 30);
					secondaryWindow.getContentPane().add(entreeLabel);
					//Entree name + description
					JLabel entreeDesc = new JLabel(thisEntree.getName()+"\n"+thisEntree.getDescription());
					entreeDesc.setBounds(150, 110, 1000, 30);
					secondaryWindow.getContentPane().add(entreeDesc);
					//Entree calories + price
					JLabel entreeCal = new JLabel("Calories: "+thisEntree.getCalories()+" Price: "+thisEntree.getPrice());
					entreeCal.setBounds(150, 130, 1000, 30);
					secondaryWindow.getContentPane().add(entreeCal);
					//Side Label
					JLabel sideLabel = new JLabel("Side");
					sideLabel.setBounds(50, 160, 110, 30);
					secondaryWindow.getContentPane().add(sideLabel);
					//Side description
					JLabel sideDesc = new JLabel(thisSide.getName()+"\n"+thisSide.getDescription());
					sideDesc.setBounds(150, 160, 1000, 30);
					secondaryWindow.getContentPane().add(sideDesc);
					//Side calories + price
					JLabel sideCal = new JLabel("Calories: "+thisSide.getCalories()+" Price: "+thisSide.getPrice());
					sideCal.setBounds(150, 180, 1000, 30);
					secondaryWindow.getContentPane().add(sideCal);
					//Salad Label
					JLabel saladLabel = new JLabel("Salad");
					saladLabel.setBounds(50, 210, 110, 30);
					secondaryWindow.getContentPane().add(saladLabel);
					//Salad description
					JLabel saladDesc = new JLabel(thisSalad.getName()+"\n"+thisSalad.getDescription());
					saladDesc.setBounds(150, 210, 1000, 30);
					secondaryWindow.getContentPane().add(saladDesc);
					//Salad calories + price
					JLabel saladCal = new JLabel("Calories: "+thisSalad.getCalories()+" Price: "+thisSalad.getPrice());
					saladCal.setBounds(150, 230, 1000, 30);
					secondaryWindow.getContentPane().add(saladCal);
					//Dessert Label
					JLabel dessertLabel = new JLabel("Dessert");
					dessertLabel.setBounds(50, 260, 110, 30);
					secondaryWindow.getContentPane().add(dessertLabel);
					//Dessert description
					JLabel dessertDesc = new JLabel(thisDessert.getName()+"\n"+thisDessert.getDescription());
					dessertDesc.setBounds(150, 260, 1000, 30);
					secondaryWindow.getContentPane().add(dessertDesc);
					//Dessert calories + price
					JLabel dessertCal = new JLabel("Calories: "+thisDessert.getCalories()+" Price: "+thisDessert.getPrice());
					dessertCal.setBounds(150, 280, 1000, 30);
					secondaryWindow.getContentPane().add(dessertCal);
					//Calories Label
					JLabel caloriesLabel = new JLabel("Calories");
					caloriesLabel.setBounds(50, 310, 110, 30);
					secondaryWindow.getContentPane().add(caloriesLabel);
					//Calories description
					JLabel caloriesDesc = new JLabel(String.valueOf(thisEntree.getCalories()+thisSide.getCalories()+thisSalad.getCalories()+thisDessert.getCalories()));
					caloriesDesc.setBounds(150, 310, 110, 30);
					secondaryWindow.getContentPane().add(caloriesDesc);
					//Price Label
					JLabel priceLabel = new JLabel("Price");
					priceLabel.setBounds(50, 360, 110, 30);
					secondaryWindow.getContentPane().add(priceLabel);
					//Price description
					JLabel priceDesc = new JLabel("$"+String.valueOf(thisEntree.getPrice()+thisSide.getPrice()+thisSalad.getPrice()+thisDessert.getPrice()));
					priceDesc.setBounds(150, 360, 110, 30);
					secondaryWindow.getContentPane().add(priceDesc);
					
					
					secondaryWindow.getContentPane().setLayout(null);
				}
				
				
				
				
			}
		});
	}

}
