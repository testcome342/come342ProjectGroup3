package Printer;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

import come342.Database;


public class Printer {
	
	public static void print(String message) {
        System.out.print(message);
    }
    
    public static void println(String message) {
        System.out.println(message);
    }
    
    public static void printSymbol(String symbol, int value) {
        Stream.generate(() -> symbol).limit(value).forEach(System.out::print);
    }
    
    private static String makeDashes(int n){
        return String.join("", Collections.nCopies(n, "-"));
    }
    
    public static void printHeadings(String h1, String h2, String h3, String h4, String h5){
        System.out.printf("%n%-25s%-25s%-25s%-25s%-25s", h1, h2, h3, h4, h5);
        System.out.printf("%n%-25s%-25s%-25s%-25s%-25s", makeDashes(20),makeDashes(20),makeDashes(20),makeDashes(20),makeDashes(20));
    }
    public static String makeCost(Double cost){
        DecimalFormat costFormat = new DecimalFormat("$ ###,###,###.##");
        return costFormat.format(cost);
    }
    
    public static void showClientList(){
        print("\nClient List\n");
        printSymbol("-", 25);
        printHeadings("COMPANY NAME", "COMPANY ADDRESS", "COMPANY EMAIL", "CONTACT NAME", "CONTACT EMAIL");
        
        //Database deki clientlarýn bilgilerini forEach ile getiriyor ve yazdýrýyor.
        Database.clientList.forEach((client) -> {
            client.getClientDetail();
        });
        println("\n");
       
    }
    
   public static void showCampaignList(){
        print("\nCampain List\n");
        printSymbol("-", 25);
        printHeadings("CAMPAIGN TITLE", "START DATE", "FINISH DATE", "ESTIMATED COST", "ASSIGNED STAFFS");
        
        //Databasedeki campaignlarýn bilgilerini forEach ile getiriyor ve yazdýrýyor.
        Database.campaignList.forEach((campaign) -> {
           campaign.getCampaignDetails();
        });
        
        
        println("\n");

    }
   public static int scanInt() {
       int value = new Scanner(System.in).nextInt();
       return value;
   }
   public static String scanString() {
       String value = new Scanner(System.in).nextLine();
       return value;
   }
   public static Double scanDouble() {
       Double value = new Scanner(System.in).nextDouble();
       return value;
   }


}
