/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;
import java.util.Scanner;
/**
 *
 * @author Ilija Milchinoski
 */
public class JavaProgramWithScanner {
public static void main (String[] args) {
   final double PI =3.1428;
   
    Scanner keybord= new Scanner(System.in);
   System.out.print("Think of a planrt and enter its +radius in miles:");
   double radius= keybord.nextDouble();
   double volume=4.0*PI*radius*radius*radius/3.0;
   double earthVolume =4.0*PI*radius*radius*radius/3.0;
   double proportion =volume / earthVolume;
   System.out.println();
   System.out.println("Your Planet has a radius of " + radius +"miles");
   System.out.println("and has a volume of"+radius+"miles");
   System.out.println("This Volume is" +proportion+"times the earth volume.");
   
   
   
   
}//End code
//End Project JavaProgramWithScanner.java
 
         
         
         
         
         
         
}
