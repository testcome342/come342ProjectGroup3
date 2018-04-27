// Author : Murat Özer
// Date   : 13/04/2018

package Entity;

import java.util.ArrayList;
import java.util.List;
import Printer.Printer;

public class Campaign {
	private String campaignTitle;
	private String campaignStartDate;
	private String campaignFinishDate;
	private double estimatedCost;
	private List<CreativeStaff> campaignStaffList = new ArrayList<CreativeStaff>();
    
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
