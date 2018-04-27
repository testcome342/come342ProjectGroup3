// Author : Ýsmail Semih GÜL
// Date   : 13/04/2018

package Entity;

public class CreativeStaff extends StaffMember {

    
    public CreativeStaff(String staffName, int staffNo, String staffStartDate) {
        super(staffName, staffNo, staffStartDate);
    }

    public void assignStaffContact() {
        System.out.println("assign staff contact" + this.getStaffName());
    }

}
