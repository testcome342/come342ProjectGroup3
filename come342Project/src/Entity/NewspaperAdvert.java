package Entity;

import Printer.Printer;
import come342.Main;

public class NewspaperAdvert extends Advert {
	static String advertType = "Newspaper";

	public NewspaperAdvert(String advertType,String advertTitle, String targetCompletionDate, double estimatedAdvertCost,
			double actualAdvertCost) {
		super(advertTitle, targetCompletionDate, estimatedAdvertCost, actualAdvertCost);
		NewspaperAdvert.advertType = advertType;
	}
	
	public static void createAdvert(Campaign campaign) {
		Printer.print("Advert Title: ");
    	String advertTitle = Printer.scanString();
    	Printer.print("Target Completion Date: ");
    	String targetCompletionDate = Printer.scanString();
    	Printer.print("Estimated Advert Cost: ");
    	double estimatedCost = Printer.scanDouble();
    	Printer.print("Actual Advert Cost: ");
    	double actualAdvertCost = Printer.scanDouble();
    	Advert createdAdvert = new NewspaperAdvert(advertType, advertTitle,targetCompletionDate,estimatedCost,actualAdvertCost);
		campaign.addNewCampaignAdvert(createdAdvert);
    	System.out.printf("A new '%s' type advert titled '%s' has been added the system for the campaign named '%s'.\n\n",
    			advertType, advertTitle, campaign.getCampaignTitle());
    	Main.mainMenu();    	
	}

}
