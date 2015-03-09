
package Week5;

import java.util.Date;
import java.util.Scanner;


public class DateExercise {
    public static void main(String[] args) {
    Date dataAndTimeOne= new Date();
    System.out.println(dataAndTimeOne);
    String dateAndTime= dataAndTimeOne.toString();
    
    Scanner myScanner = new Scanner(dateAndTime);
    String den=myScanner.next();
    String mesec=myScanner.next();
    String datum=myScanner.next();
    String vreme=myScanner.next();
    String timezone=myScanner.next();
    String godina=myScanner.next();
    
    
    System.out.println("datumot e: "+datum+ ", godina: " + godina);
    
    
    
    
    
    
    
    
    
    
    
}}
