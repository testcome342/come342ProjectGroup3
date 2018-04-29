// Author : Ýsmail Semih GÜL
// Date   : 13/04/2018

package Entity;


public abstract class StaffMember {
    private String staffName;
    private int staffNo;
    private String staffStartDate;

    public StaffMember(String staffName, int staffNo, String staffStartDate) {
        this.staffName = staffName;
        this.staffNo = staffNo;
        this.staffStartDate = staffStartDate;
    }
        
    public void getStaffDetails() {
        System.out.println(
                "Staff Name is " + this.staffName + 
                " and Staff No is " + this.staffNo +
                " .Staff Start Date is " + this.staffStartDate
                );
    }
    


    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public int getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(int staffNo) {
        this.staffNo = staffNo;
    }

    public String getStaffStartDate() {
        return staffStartDate;
    }

    public void setStaffStartDate(String staffStartDate) {
        this.staffStartDate = staffStartDate;
    }

    
}
