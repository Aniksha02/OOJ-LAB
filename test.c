


This program calculates the grade of a student based on the marks entered by user in each subject. Program prints the grade based on this logic.
If the average of marks is >= 80 then prints Grade ‘A’
If the average is <80 and >=60 then prints Grade ‘B’
If the average is <60 and >=40 then prints Grade ‘C’
else prints Grade ‘D’



import java.util.Scanner;

public class JavaExample
{
    public static void main(String args[])
    {
        int totalmarks,test,exam;
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
     {   
     System.out.println("enter value of test");
     
     if(test>50);
     system.out.println("value invaliid")
     else
		 test=sc.nextInt();}
		 {
		     System.out.println("enter value of exam");
     
     if(test>100);
     system.out.println("value invaliid")
     else
		 exam=sc.nextInt();
		 }
		 

           totalmarks = test + exam;
        }
        scanner.close();
        //Calculating average here
        avg = total/6;
        System.out.print("The student Grade is: ");
        if(avg>=80)
        {
            System.out.print("A");
        }
        else if(avg>=60 && avg<80)
        {
           System.out.print("B");
        } 
        else if(avg>=40 && avg<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}
