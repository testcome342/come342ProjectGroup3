// Author : Murat Özer
// Date   : 13/04/2018

package come342;

import java.util.Scanner;
import Printer.Printer;
import java.util.Scanner;
import Entity.Client;
import Control.AssignStaffToCampaign;



public class Main {
	public static void main(String[] args) {
		//Ýlk baþtaki client ve campaign oluþturuyor
		Database.init();
		mainMenu();
	}

	public static void mainMenu() {
		Printer.println("Select one of the following:");
		Printer.println("1- Add a new client");
		Printer.println("2- Add a new campaign");
		Printer.println("3- Assign staff to campaign");
		Printer.println("4- Show Client List");
		Printer.println("5- Show Campaign List");
		Printer.printSymbol("-", 20);
		Printer.print("\nYour choice: ");
		int choice = new Scanner(System.in).nextInt();

		switch (choice) {
		case 1:
			Printer.printSymbol("*", 30);
			Printer.println("\nAdd a new client");
			Client.addNewClient();
			break;
		case 2:
			Printer.printSymbol("*", 30);
			Printer.println("\nAdd a new campaign");
			Client.addNewCampaign();
			break;
		case 3:
			Printer.printSymbol("*", 30);
			Printer.println("\nAssign staff to campaign");
			AssignStaffToCampaign.assign();
			break;
		case 4:
			Printer.printSymbol("*", 30);
			Printer.showClientList();
			mainMenu();
			break;
		case 5:
			Printer.printSymbol("*", 30);
			Printer.showCampaignList();
			mainMenu();
			break;
		default:
			Printer.println("Error. Please choose between 1 - 5");
			mainMenu();
			break;
		}

	}


}
