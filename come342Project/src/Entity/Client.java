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
	static Scanner scanner = new Scanner(System.in);

	public Client(String companyName, String companyAddress, String companyEmail, String contactName,
			String contactEmail) {
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.contactName = contactName;
		this.contactEmail = contactEmail;
		this.companyEmail = companyEmail;
	}
	
	//Yeni bir client eklemek i�in fonksiyon.
	public static void addNewClient() {

		//Printer.showClientList();

		Printer.print("Company Name: ");
		String companyName = scanner.nextLine();
		Printer.print("Company Address: ");
		String companyAddress = scanner.nextLine();
		Printer.print("Company Email: ");
		String companyEmail = scanner.nextLine();
		Printer.print("Contact Name: ");
		String contactName = scanner.nextLine();
		Printer.print("Contact Email: ");
		String contactEmail = scanner.nextLine();
		Client createdClient = new Client(companyName, companyAddress, companyEmail, contactName, contactEmail);
		
		//Yeni olu�turaca��m�z client� database e eklemek i�in o client �zerinde �al��t���m�za dair control kodu.
		AddNewClient.getInstance().createNewClient(createdClient);
		
		System.out.printf("The client named '%s' has been added the system.\n", companyName);
		System.out.println("\nPlease enter the campaign informations:");
		addNewCampaign(createdClient);
	}

	//Var olan clientlara kampanya eklemek i�in �al��an fonksiyon.
	public static void addNewCampaign() {
        Printer.println("\nSelect a client:");
        /*
            Show client list
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
        System.out.printf("\nExisting campaigns list for client named '%s':\n", Database.clientList.get(choice-1).getCompanyName());
        Printer.printSymbol("-", 20);
        AddNewCampaign.getInstance().showClientCampaigns(selectedClient);
        System.out.printf("\nAdd a new campaign for client named '%s':\n", Database.clientList.get(choice-1).getCompanyName());
        
        addNewCampaign(selectedClient);
        
    }

	//Yeni olu�turulan clienta kampanya eklemek i�in �al��an fonksiyon.
	public static void addNewCampaign(Client client) {
		System.out.print("New campaign title: ");
		String campaignTitle = Printer.scanString();
		System.out.print("New Campaign Start Date: ");
		String campaignStartDate = Printer.scanString();
		System.out.print("New Campaign Finish Date: ");
		String campaignFinishDate = Printer.scanString();
		System.out.print("New Estimated Cost: ");
		Double estimatedCost = Printer.scanDouble();
		AddNewCampaign.getInstance().createNewCampaign(client,
				new Campaign(campaignTitle, campaignStartDate, campaignFinishDate, estimatedCost));
		System.out.printf("A new campaign titled '%s' has been added the system for the client named '%s'.\n\n", campaignTitle, client.getCompanyName());
		Main.mainMenu();

	}

	
	//Advert i�in 2 seviye miras alma olacak.
	
	//Printer i�indeki showClientList methodu kullan�yor.
	public void getClientDetail() {
		System.out.printf("%n%-25s%-25s%-25s%-25s%-25s", this.getCompanyName(), this.getCompanyAddress(),
				this.getCompanyEmail(), this.getContactName(), this.getContactEmail());
	}


	//AddNewCampaign control class� kullan�yor.Olan bir clienta kampanya eklemek i�in.
	public List<Campaign> getCampaignList() {
		return companyCampaignList;
	}

	//Databasein var olan client�na kampanya eklemek i�in kullan�l�yor ve campanyCampaignList e de ayn� kampanyay� ekliyor.
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
