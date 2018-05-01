package Entity;

public abstract class Advert {
	
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
