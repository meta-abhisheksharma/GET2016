package Menu_Submenu;

import java.util.Scanner;

public class MenuMain {

	public static void main(String[] args) {

		//Initializing menus and submenus
		
		MenuAction menuActionLst= new MenuAction();
		boolean repeat=false;
		do{
		repeat=false;
		System.out.println("Enter Menu Name");
		Scanner scan=new Scanner(System.in);
		String menuName=scan.next();
		Menu menu=new Menu(menuName);
		System.out.println("Enter number of sublist");
		int size=scan.nextInt();
		System.out.println("Enter sublist");
		for(int index=0;index<size;index++){
			System.out.print("Enter sublist "+(index+1));
			String subMenu=scan.next();
			menu.setSubMenu(new SubMenu(subMenu));
		}
		
		menuActionLst.addMenu(menu);
		System.out.println("Do YOU want to Enter new Menu---Y and--N");
		String choice=scan.next();
		if(choice.equalsIgnoreCase("y")){
			repeat=true;
		}
		}while(repeat);
		
		/**
		Menu menuTV= new Menu("TV"); 
		menuTV.setSubMenu(new SubMenu("LED"));
		menuTV.setSubMenu(new SubMenu("LCD"));
		
		Menu menuMobile= new Menu("Mobile");
		menuMobile.setSubMenu(new SubMenu("IOS"));
		menuMobile.setSubMenu(new SubMenu("Android"));
		
		Menu menuPC= new Menu("PC");
		menuPC.setSubMenu(new SubMenu("Desktop"));
		menuPC.setSubMenu(new SubMenu("Laptop"));
		
		MenuAction menuAction= new MenuAction();
		menuAction.addMenu(menuTV);
		menuAction.addMenu(menuMobile);
		menuAction.addMenu(menuPC);
		
		menuAction.displyMenu();
		menuAction.displaySubMenu(menuAction.getChoice(menuAction.getList().size()));
		*/
		menuActionLst.displyMenu();
		menuActionLst.displaySubMenu(menuActionLst.getChoice(menuActionLst.getList().size()));
		
	}

}
