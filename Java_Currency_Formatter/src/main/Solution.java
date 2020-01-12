package main;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Get the currency instance 
        DecimalFormat nF = (DecimalFormat) NumberFormat.getCurrencyInstance(); 
  
        // Sets the currency to US Dollar 
        nF.setCurrency(Currency.getInstance(Locale.US)); 

        DecimalFormatSymbols symbol = new DecimalFormatSymbols();
        symbol.setCurrencySymbol("$");

        // Set the new DecimalFormatSymbols into formatter object.
        nF.setDecimalFormatSymbols(symbol);
        
        String us_payment = nF.format(payment);
        

        
        // Sets the currency to China currency 
        nF.setCurrency(Currency.getInstance(Locale.CHINA)); 

		symbol = new DecimalFormatSymbols();
		symbol.setCurrencySymbol("¥");

// Set the new DecimalFormatSymbols into formatter object.
		nF.setDecimalFormatSymbols(symbol);
        String china_payment = nF.format(payment);
        
     // Get the currency instance 
        DecimalFormat nF_india = (DecimalFormat) NumberFormat.getCurrencyInstance( new Locale("in", "Rs.")); 
  
		symbol = new DecimalFormatSymbols();
		symbol.setCurrencySymbol("Rs.");

		// Set the new DecimalFormatSymbols into formatter object.
		nF.setDecimalFormatSymbols(symbol);
		 String india_payment = nF.format(payment);
        
		// Get the currency instance 
	    NumberFormat nF_fr = NumberFormat.getCurrencyInstance(Locale.FRANCE); 
        nF.setCurrency(Currency.getInstance(Locale.FRANCE)); 
        
        //DecimalFormatSymbols fr_symbol = new DecimalFormatSymbols();
        String fr_pattern = "### ###,###";
        //nF.applyPattern(fr_pattern);
        
        //fr_symbol.setGroupingSeparator(' ');
        //fr_symbol.setMonetaryDecimalSeparator(',');
        //fr_symbol.setCurrencySymbol("");
        //fr_symbol.set
        // Set the new DecimalFormatSymbols into formatter object.
       // nF.setDecimalFormatSymbols(fr_symbol);

        String fr_payment = nF_fr.format(payment);
        
        
        System.out.println("US: " + us_payment);
        System.out.println("India: " + india_payment);
        System.out.println("China: " + china_payment);
        System.out.println("France: " + fr_payment);
    }
}

