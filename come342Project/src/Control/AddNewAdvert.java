package Control;

import Entity.Campaign;
import Printer.Printer;
import Entity.Advert;

public class AddNewAdvert {
	  private static final AddNewAdvert instance = new AddNewAdvert();
	    
	    // Disarkan instance ulasabilmek icin kullaniyoruz
	    public static AddNewAdvert getInstance() {
	        return instance;
	    }
	    
	    // Obje yaratamamak icin private yaptik
	    private AddNewAdvert() {
	        
	    }
	    
	  //Olan bir campanyaya a advert eklerken çalýþýyor.
	    public void showCampaignAdvert(Campaign campaign) {
	        Printer.print("\n");
	        int i = 1;
	        for(Advert advert : campaign.getAdvertList()) {
	            Printer.print(i + ".) " + advert.getAdvertTitle() + "\n");
	            i++;
	        }
	    }
	    
	    public void createNewCampaingAdvert(Campaign campaign,Advert advert) {
	    	campaign.addNewCampaignAdvert(advert);
	    }

}
