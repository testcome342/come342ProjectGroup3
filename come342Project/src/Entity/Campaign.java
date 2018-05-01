// Author : Murat Özer
// Date   : 13/04/2018

package Entity;

import java.util.ArrayList;
import java.util.List;
import Control.AddNewAdvert;
import Printer.Printer;
import come342.Database;
import come342.Main;

public class Campaign {
	private String campaignTitle;
	private String campaignStartDate;
	private String campaignFinishDate;
	private double estimatedCost;
	private List<CreativeStaff> campaignStaffList = new ArrayList<CreativeStaff>();
	private List<Advert> campaignAdvertList = new ArrayList<Advert>();
    
	public Campaign() {
		
		
	}
	public Campaign(String campaignTitle, String campaignStartDate, String campaignFinishDate, double estimatedCost) {
		this.campaignTitle = campaignTitle;
		this.campaignStartDate = campaignStartDate;
		this.campaignFinishDate = campaignFinishDate;
		this.estimatedCost = estimatedCost;
	}
	
	 public void getCampaignDetails() {
	        System.out.printf("%n%-25s%-25s%-25s%20s     " ,
	                    this.getCampaignTitle(),
	                    this.getCampaignStartDate(),
	                    this.getCampaignFinishDate(),
	                    Printer.makeCost(this.getEstimatedCost()));   
	        
	        for (int i=0; i<this.campaignStaffList.size(); i++){
	            System.out.print(this.campaignStaffList.get(i).getStaffName() + "   ");
	        }
	      
	    }
	 
		public static void addNewAdvert() {
	        Printer.println("\nSelect a campaign:");
	        /*
	            Show campaign list
	        */
	        for (int i=1; i<=Database.campaignList.size(); i++){
	            Printer.println(i + ".)" + Database.campaignList.get(i-1).getCampaignTitle());
	        }
	        
	        Printer.print("Your choice: ");
	        int choice = Printer.scanInt();
	        Campaign selectedCampaign = Database.campaignList.get(choice-1);
	        
	        /*
	            Advert list
	        */
	        System.out.printf("\nExisting advert(s) list for the campaign titled '%s':\n", Database.campaignList.get(choice-1).getCampaignTitle());
	        Printer.printSymbol("-", 20);
	        AddNewAdvert.getInstance().showCampaignAdvert(selectedCampaign);
	        //Selecting the advert type
	        System.out.printf("\nWhat kind of advert would you like to add for campaign titled '%s'?\n", Database.campaignList.get(choice-1).getCampaignTitle());
			Printer.println("1- Magazine Advert");
			Printer.println("2- Newspaper Advert");
			Printer.println("3- Poster Advert");
			Printer.printSymbol("-", 20);
			Printer.print("\nYour choice: ");
			choice = Printer.scanInt();
			
			switch(choice) {
			case 1:
				MagazineAdvert.createAdvert(selectedCampaign);
				break;
			case 2:
				NewspaperAdvert.createAdvert(selectedCampaign);
				break;
			case 3:
				PosterAdvert.createAdvert(selectedCampaign);
				break;
			default:
				Printer.println("Error. Please choose between 1 - 3");
				Main.mainMenu();
			}			        
	    }
	 
	 public void addNewCampaignAdvert(Advert advert) {
			this.campaignAdvertList.add(advert);
			Database.advertList.add(advert);
		}
	 
	 public List<Advert> getAdvertList() {
			return campaignAdvertList;
		}

	 
	public String getCampaignTitle() {
		return campaignTitle;
	}
	public void setCampaignTittle(String campaignTitle) {
		this.campaignTitle = campaignTitle;
	}
	public String getCampaignStartDate() {
		return campaignStartDate;
	}
	public void setCampaignStartDate(String campaignStartDate) {
		this.campaignStartDate = campaignStartDate;
	}
	public String getCampaignFinishDate() {
		return campaignFinishDate;
	}
	public void setCampaignFinishDate(String campaignFinishDate) {
		this.campaignFinishDate = campaignFinishDate;
	}
	public double getEstimatedCost() {
		return estimatedCost;
	}
	public void setEstimatedCost(double estimatedCost) {
		this.estimatedCost = estimatedCost;
	}
	
    public List<CreativeStaff> getCampaignStaffList() {
        return campaignStaffList;
    }
	
    public void addCampaignStaffList(CreativeStaff staff) {
        this.campaignStaffList.add(staff);
    }

}
