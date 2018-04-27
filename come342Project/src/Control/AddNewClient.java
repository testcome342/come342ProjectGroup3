// Author : Ilgin Yalcin
// Date   : 13/04/2018

package Control;

import Entity.Client;
import come342.Database;

public class AddNewClient {
private static final AddNewClient instance = new AddNewClient();
    
    // Disardan instance ulasabilmek icin kullaniyoruz
    public static AddNewClient getInstance() {
        return instance;
    }
    
    // Obje yaratamamak icin private yaptik
    private AddNewClient() {
        
    }
    
    public void createNewClient(Client client) {
        Database.clientList.add(client);
        //Dosya yazma yapýlabilir.
    }

}
