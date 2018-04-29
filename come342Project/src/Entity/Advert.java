package Entity;

import Printer.Printer;
import come342.Main;

public class Advert {
	
	private String advertTitle;
	private String targetCompletionDate;
	private double estimatedAdvertCost;
	private double actualAdvertCost;
	
	public Advert(String advertTitle, String targetCompletionDate, double estimatedAdvertCost,
			double actualAdvertCost) {
		this.advertTitle = advertTitle;
		this.targetCompletionDate = targetCompletionDate;
		this.estimatedAdvertCost = estimatedAdvertCost;
		this.actualAdvertCost = actualAdvertCost;
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
    	Advert createdAdvert = new Advert(advertTitle,targetCompletionDate,estimatedCost,actualAdvertCost);
		
    	
    	Main.mainMenu();
    	
	}
	
	public String getAdvertTitle() {
		return advertTitle;
	}
	public void setAdvertTitle(String advertTitle) {
		this.advertTitle = advertTitle;
	}
	public String getTargetCompletionDate() {
		return targetCompletionDate;
	}
	public void setTargetCompletionDate(String targetCompletionDate) {
		this.targetCompletionDate = targetCompletionDate;
	}
	public double getEstimatedAdvertCost() {
		return estimatedAdvertCost;
	}
	public void setEstimatedAdvertCost(double estimatedAdvertCost) {
		this.estimatedAdvertCost = estimatedAdvertCost;
	}
	public double getActualAdvertCost() {
		return actualAdvertCost;
	}
	public void setActualAdvertCost(double actualAdvertCost) {
		this.actualAdvertCost = actualAdvertCost;
	}
	
	
	
	
	
	

}
