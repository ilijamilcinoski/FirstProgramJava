/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3;

import java.util.Scanner;

/**
 *
 * @author Ilija
 */
public class Avrage3 {

public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("On the next line , enter four exam grades");
int exam1=input.nextInt();
int exam2=input.nextInt();
int exam3=input.nextInt();
int exam4=input.nextInt();
int average=input.nextInt();
System.out.println("The average of"+ (exam1+","+exam2+exam3+exam4)+"is:"+average);


}
    
}
