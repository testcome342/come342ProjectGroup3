// Author : Murat Özer
// Date   : 13/04/2018
package come342;

import java.util.ArrayList;
import java.util.List;
import Entity.Campaign;
import Entity.Client;
import Entity.CreativeStaff;
import Entity.Advert;


public class Database {
    
    public static List<Client> clientList = new ArrayList<Client>();
    public static List<Campaign> campaignList = new ArrayList<Campaign>();
    public static List<CreativeStaff> creativeStaffList = new ArrayList<CreativeStaff>();
    public static List<Advert> advertList = new ArrayList<Advert>();
    
 
    //public static List<AdminStaff> adminStaffList = new ArrayList<AdminStaff>();

    public static void init() {
    	//Dosyadan okuyacak burada
        
    	Client nestle = new Client("NESTLE", "Ýstanbul/Þiþli", "info@nestle.com.tr", "Murat Bey", "murat@nestle.com.tr");
        Campaign nestle15 = new Campaign("NESTLE 15. YIL", "20/06/2017", "20/08/2017",1500000.00);
        nestle.addNewClientCampaign(nestle15);
        clientList.add(nestle);
        
        Client tekno = new Client("TEKNOSA", "Ýstanbul/Mecidiyekoy", "info@teknosa.com", "Ilgýn Haným", "ilgin@teknosa.com");
        Campaign tekno5 = new Campaign("TEKNOSA 5. YIL", "10/06/2017", "30/08/2017",1100000.00);
        Campaign tekno10 = new Campaign("TEKNOSA YENÝ YIL", "10/11/2017", "30/11/2017",3100000.00);
        tekno.addNewClientCampaign(tekno5);
        tekno.addNewClientCampaign(tekno10);
        clientList.add(tekno);
        
        creativeStaffList.add(new CreativeStaff("Hayrettin Çelik", 1, "20/05/2015"));
        creativeStaffList.add(new CreativeStaff("Tunahan Iþýk", 2, "23/06/2015"));
        creativeStaffList.add(new CreativeStaff("Ali Dinçer", 3, "27/06/2015"));     
        
        
        Advert advert1 = new Advert("ABC","30/20/10",30.00,40.00);
        tekno5.addNewCampaignAdvert(advert1);
    }
}

