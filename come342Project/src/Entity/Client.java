// Author : Ilgin Yalcin
// Date   : 13/04/2018

package Entity;

import java.util.Scanner;
import Printer.Printer;
import come342.Database;
import come342.Main;
import Entity.Campaign;

import java.util.ArrayList;
import java.util.List;

import Control.AddNewCampaign;
import Control.AddNewClient;

public class Client {
	private String companyName;
	private String companyAddress;
	private String contactName;
	private String companyEmail;
	private String contactEmail;
	private List<Campaign> companyCampaignList = new ArrayList<Campaign>();

	public Client(String companyName, String companyAddress, String companyEmail, String contactName,
			String contactEmail) {
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.contactName = contactName;
		this.contactEmail = contactEmail;
		this.companyEmail = companyEmail;
	}
	
	//Yeni bir client eklemek için fonksiyon.
	public static void addNewClient() {

		Printer.showClientList();

		Printer.print("\nCompany Name: ");
		String companyName = new Scanner(System.in).nextLine();
		Printer.print("Company Address: ");
		String companyAddress = new Scanner(System.in).nextLine();
		Printer.print("Company Email: ");
		String companyEmail = new Scanner(System.in).nextLine();
		Printer.print("Contact Name: ");
		String contactName = new Scanner(System.in).nextLine();
		Printer.print("Contact Email: ");
		String contactEmail = new Scanner(System.in).nextLine();
		Client createdClient = new Client(companyName, companyAddress, companyEmail, contactName, contactEmail);
		
		//Yeni oluþturacaðýmýz clientý database e eklemek için o client üzerinde çalýþtýðýmýza dair control kodu.
		AddNewClient.getInstance().createNewClient(createdClient);
		
		System.out.printf("The client named '%s' has added the system.\n", companyName);
		System.out.println("Please enter the compaign informations:");
		addNewCampaign(createdClient);
		

	}

	//Var olan clientlara kampanya eklemek için çalýþan fonksiyon.
	public static void addNewCampaign() {
        Printer.println("\nSelect a client:");
        /*
            Show client list
        */
        for (int i=1; i<=Database.clientList.size(); i++){
            Printer.println(i + ".)" + Database.clientList.get(i-1).getCompanyName());
        }
        
        Printer.print("Your choice: ");
        int choice = new Scanner(System.in).nextInt();
        Client selectedClient = Database.clientList.get(choice-1);
        
        /*
            Campaign list
        */
        System.out.printf("\nSelect a campaign for client named '%s'", Database.clientList.get(choice-1).getCompanyName());
        Printer.print("\n");
        Printer.printSymbol("-", 20);
        AddNewCampaign.getInstance().showClientCampaigns(selectedClient);
        
        addNewCampaign(selectedClient);
        
    }

	//Yeni oluþturulan clienta kampanya eklemek için çalýþan fonksiyon.
	public static void addNewCampaign(Client client) {
		System.out.println("New campaign title: ");
		String campaignTitle = new Scanner(System.in).nextLine();
		System.out.println("New Campaign Start Date: ");
		String campaignStartDate = new Scanner(System.in).nextLine();
		System.out.println("New Campaign Finish Date: ");
		String campaignFinishDate = new Scanner(System.in).nextLine();
		System.out.println("New Estimated Cost: ");
		Double estimatedCost = new Scanner(System.in).nextDouble();
        
		 
		Main.mainMenu();

	}

	
	//Advert için 2 seviye miras alma olacak.
	
	//Printer içindeki showClientList methodu kullanýyor.
	public void getClientDetail() {
		System.out.printf("%n%-25s%-25s%-25s%-25s%-25s", this.getCompanyName(), this.getCompanyAddress(),
				this.getCompanyEmail(), this.getContactName(), this.getContactEmail());
	}


	//AddNewCampaign control classý kullanýyor.Olan bir clienta kampanya eklemek için.
	public List<Campaign> getCampaignList() {
		return companyCampaignList;
	}

	//Databasein var olan clientýna kampanya eklemek için kullanýlýyor ve campanyCampaignList e de ayný kampanyayý ekliyor.
	public void addNewClientCampaign(Campaign campaign) {
		this.companyCampaignList.add(campaign);
		Database.campaignList.add(campaign);
	}	
	

	
	
	public String getCompanyEmail() {
		return companyEmail;
	}
	public String getClientCampaigns() {
		return null;
	}
	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}


}
