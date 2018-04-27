// Author : Murat Özer
// Date   : 13/04/2018

package Control;
import Entity.Client;
import Entity.Campaign;
import Printer.Printer;

public class AddNewCampaign {
	
    
    private static final AddNewCampaign instance = new AddNewCampaign();
    
    // Disarkan instance ulasabilmek icin kullaniyoruz
    public static AddNewCampaign getInstance() {
        return instance;
    }
    
    // Obje yaratamamak icin private yaptik
    private AddNewCampaign() {
        
    }
    
    //Olan bir client a campanya eklerken çalýþýyor.
    public void showClientCampaigns(Client client) {
        Printer.print("\n");
        int i = 1;
        for(Campaign campaign : client.getCampaignList()) {
            Printer.print(i + ".) " + campaign.getCampaignTitle() + "\n");
            i++;
        }
    }
    
    public void createNewCampaign(Client client, Campaign campaign) {
        client.addNewClientCampaign(campaign);
       
    }
}
