/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade_calculator;

import java.util.Scanner;

/**
 *
 * @author HARSHAL
 */
public class Grade_Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter your number of subject");
        int sub=sc.nextInt();
        int sum=0;
        int a[]=new int[10];
        for(int i=1;i<=sub;i++){
            System.out.println("Enter the Your marks");
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        int score=sum/sub;
        if(score>=80 && score<=100){
            System.out.println("Total Marks are " +sum);
            System.out.println("Average is "+score);
            System.out.println("Congratulation your Grade is O ");
        }
        else if(score>=70 && score<80){
            System.out.println("Total Marks are " +sum);
            System.out.println("Average is "+score);
            System.out.println("Congratulation your Grade is A");
            
        }else if(score>=60 && score<70){
            System.out.println("Total Marks are " +sum);
            System.out.println("Average is "+score);
            System.out.println("Congratulation your Grade is B");
        }else if(score>=50 && score<70){
            System.out.println("Total Marks are " +sum);
            System.out.println("Average is "+score);
            System.out.println("Congratulation your Grade is C");
        }else if(score>=36 && score<50){
            System.out.println("Total Marks are " +sum);
            System.out.println("Average is "+score);
            System.out.println("Congratulation your Grade is C-");
        }
        else{
            System.out.println("Total Marks are " +sum);
            System.out.println("Average is "+score);
            System.out.println("Sorry you are Fail");
        }
        }catch(Exception e){
            System.out.println(e);
        }
 
    }
    
}
