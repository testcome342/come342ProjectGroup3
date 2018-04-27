package Control;


import come342.Database;
import Entity.CreativeStaff;

public class AddNewStaff {
	
private static final AddNewStaff instance = new AddNewStaff();
    
    // Disarkan instance ulasabilmek icin kullaniyoruz
    public static AddNewStaff getInstance() {
        return instance;
    }

    // Obje yaratamamak icin private yaptik
    private AddNewStaff() {  
    }
    
    public void createNewStaff(CreativeStaff staff) {
        Database.creativeStaffList.add(staff);
        //Dosya yazma yapýlabilir.
    }
}
