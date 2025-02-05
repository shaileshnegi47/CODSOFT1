package javaapplication1;
import java.util.Scanner;
public class Grade_Calculator {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of subjects: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
   
    System.out.println("Enter your "+ i +" subject number : ");
     int a=sc.nextInt();
     sum +=a;
   
    }
       double avg = sum/n;  
        
        System.out.println("total number:="+ sum);
        System.out.println("you got : "+ avg);
       if(avg >=60){
           System.out.println(" Congratulation you got 'A' grade ");
          
       } 
       else if(avg>30 && avg<60){
           System.out.println("Congratulation you got'B' grade");
       }
       else{
           System.out.println("Single sheet of paper can't decide your future .Do Better in next time Champion ");
       }
   sc.close();
    }
    
}
