/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Random;
import java.util.Scanner;


public class JavaApplication1 {

    
    public static void main(String[] args) {
        // TODO code application logic here
       try{
            Scanner sc=new Scanner(System.in);
               Random r= new Random();
               int no=0,p=1,c=0;
               int random=r.nextInt(101);
               System.out.println(random);
               System.out.println("You have only five attemps to guess the correct number");
          
               while(no!=random && p<=5){
                   c++;
                   p++;
                   System.out.println("Enter the any number");
                   no=sc.nextInt();
                   if(no>random && no!=random){
                       System.out.println("your number is greater than Random number");
                   }
                   else if(no<random && no!= random){
                       System.out.println("Your number is less than Random number");
                       
                   }
               }
               System.out.println("Congratulation your guess is correct Random no is " +no);
               if(c==1){
                   System.out.println("Congratulation you guess the correct number in 1st attempt");
                   System.out.println("Your score is 100");
               }else if(c==2){
                   System.out.println("Congratulation you guess the correct number in 2nd attempt");
                   System.out.println("Your score is 80");
               }else if(c==3){
                   System.out.println("Congratulation you guess the correct number in 3rd attempt");
                   System.out.println("Your score is 60");
               }else if(c==4){
                   System.out.println("Congratulation you guess the correct number in 4th attempt");
                   System.out.println("Your score is 40");
               }else if(c==5){
                   System.out.println("Congratulation you guess the correct number in 5th attempt");
                   System.out.println("Your score is 20");
               }else{
                   System.out.println("sorry you are failed");
               }
       }
         catch(Exception e){
           System.out.println(e);
       } 
    }
       
    
}
