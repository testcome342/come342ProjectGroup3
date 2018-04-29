// Author : Ýsmail Semih GÜL
// Date   : 13/04/2018

package Control;

import come342.Database;
import come342.Main;
import Printer.Printer;
import java.util.ArrayList;
import java.util.List;
import Entity.Campaign;
import Entity.Client;
import Entity.CreativeStaff;

public class AssignStaffToCampaign {
    
    private static final AssignStaffToCampaign instance = new AssignStaffToCampaign();
    
    public static AssignStaffToCampaign getInstance() {
        return instance;
    }
    
    public void showClientCampaigns(Client client) {
    	Printer.print("\n");
        int i = 1;
        for(Campaign campaign : client.getCampaignList()) {
            Printer.print(i + ".) " + campaign.getCampaignTitle() + "\n");
            i++;
        }
    }
    
    public List<CreativeStaff> showCampaignStaffNotWorking(Campaign campaign) {
    	Printer.print("\n");
        List<CreativeStaff> staffList = new ArrayList<CreativeStaff>(Database.creativeStaffList);
        staffList.removeAll(campaign.getCampaignStaffList());
        
        if(staffList.size() == 0) {
            Printer.println("Error! This campaign has not staff.");
            return null;
        }
        
        for(int i = 0;i<staffList.size();i++) {
            Printer.println(i+1 + ".) " + staffList.get(i).getStaffName());
        }
        
        return staffList;
    }
    public static void assign() {
    	Printer.println("\nSelect a client:");
        /*
          Client list
        */
        for (int i=1; i<=Database.clientList.size(); i++){
        	Printer.println(i + ".)" + Database.clientList.get(i-1).getCompanyName());
        }
        Printer.print("Your choice: ");
        int choice = Printer.scanInt();
        Client selectedClient = Database.clientList.get(choice-1);
        /*
            Campaign list
        */
        System.out.printf("\nSelect a campaign for client named '%s'", Database.clientList.get(choice-1).getCompanyName());
        Printer.print("\n");
        Printer.printSymbol("-", 20);
        AssignStaffToCampaign.getInstance().showClientCampaigns(selectedClient);
        if(selectedClient.getCampaignList().isEmpty()) {
        	Printer.println("This client has not a campaign.");
            Main.mainMenu();
        }
        Printer.print("Your choice: ");
        int campaignNum = Printer.scanInt();
        Campaign selectedCampaign = selectedClient.getCampaignList().get(campaignNum-1);
        /*
            Staff list
        */
        System.out.printf("\nSelect a staff to assaign for campaign named '%s'", selectedClient.getCampaignList().get(campaignNum-1).getCampaignTitle());
        Printer.print("\n");
        Printer.printSymbol("-", 20);
        List<CreativeStaff> staffList = AssignStaffToCampaign.getInstance().showCampaignStaffNotWorking(selectedCampaign);
        
        if(staffList == null) {
        	Main.mainMenu();
        }
        
        Printer.print("Your choice: ");
        int staffNum = Printer.scanInt();
        
        selectedCampaign.addCampaignStaffList(staffList.get(staffNum-1));
        System.out.printf("%s has been assaigned to the '%s' campaign%n", 
                staffList.get(staffNum-1).getStaffName(),
                selectedClient.getCampaignList().get(campaignNum-1).getCampaignTitle());
        Printer.print("\n");
        Main.mainMenu();
    }

}

