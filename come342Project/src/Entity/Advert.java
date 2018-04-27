package Entity;

import java.util.Scanner;
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
		Printer.print("\nAdvert Title: ");
    	String advertTitle = new Scanner(System.in).nextLine();
    	Printer.print("\nTarget Completion Date: ");
    	String targetCompletionDate = new Scanner(System.in).nextLine();
    	Printer.print("\nEstimated Advert Cost: ");
    	double estimatedCost = new Scanner(System.in).nextDouble();
    	Printer.print("\nActual Advert Cost: ");
    	double actualAdvertCost = new Scanner(System.in).nextDouble();
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
