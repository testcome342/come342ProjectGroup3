// Author : Ýsmail Semih GÜL
// Date   : 13/04/2018

package Entity;

import java.util.Scanner;
import Control.AddNewStaff;
import Printer.Printer;
import come342.Main;

public class CreativeStaff extends StaffMember {

    
    public CreativeStaff(String staffName, int staffNo, String staffStartDate) {
        super(staffName, staffNo, staffStartDate);
    }

    public void assignStaffContact() {
        System.out.println("assign staff contact" + this.getStaffName());
    }
    
    
    public static void addNewStaff() {
    	Printer.print("\nStaff Name: ");
    	String staffName = new Scanner(System.in).nextLine();
    	Printer.print("\nStaff No: ");
    	int staffNo = new Scanner(System.in).nextInt();
    	Printer.print("\nStart Date: ");
    	String staffStartDate = new Scanner(System.in).nextLine();
    	CreativeStaff createdStaff = new CreativeStaff(staffName,staffNo,staffStartDate);
    	AddNewStaff.getInstance().createNewStaff(createdStaff);
    	System.out.printf("The staff named '%s' has added the system.\n", staffName);
    	Main.mainMenu();
    }

}
