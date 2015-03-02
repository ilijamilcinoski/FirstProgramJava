/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4;

/**
 *
 * @author im23405
 */
public class ex5 {
    private static int x;
 public static void main(String [] args){
 System.out.println(5+4*6/3-2);
 System.out.println((5+4)*6/(3-2));
 int y=++x;
 System.out.println("x="+x+"y="+y);
 int x=5;
 int z=++x;
 System.out.println("x="+x+"z="+z);
 int m=15%4;
 System.out.println("m ="+ m);
 int m3= 29;
 System.out.println("m << 2 = " + (m >> 2));
 double d=5.0;
 d*=4.0;
 System.out.println("d = " + d);
 System.out.println("Ternary: "+(x==5? "yes":"no"));
 }  
}
