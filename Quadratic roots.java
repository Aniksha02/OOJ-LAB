//Java Program to Find Roots of a Quadratic Equation by taking input from user

import java.lang.*;
import java.util.Scanner;
public class Main {

  public static void main(String[] args) {

    // value a, b, and c
    double a , b , c ;
    double root1, root2;
    
    Scanner sc= new Scanner(System.in); 
  
    
   System.out.println("enter value of A");
    a=sc.nextInt();
   
   System.out.println("enter value of B");
    b=sc.nextInt();
   
   System.out.println("enter value of C");
    c=sc.nextInt();
   
  
    // calculate the determinant (b2 - 4ac)
    double determinant = b * b - 4 * a * c;

    // check if determinant is greater than 0
    if (determinant > 0) {

      // two real and distinct roots
      root1 = (-b + Math.sqrt(determinant)) / (2 * a);
      root2 = (-b - Math.sqrt(determinant)) / (2 * a);

      System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
    }

    // check if determinant is equal to 0
    else if (determinant == 0) {

      // two real and equal roots
      // determinant is equal to 0
      // so -b + 0 == -b
      root1 = root2 = -b / (2 * a);
      System.out.format("root1 = root2 = %.2f;", root1);
    }

    // if determinant is less than zero
    else {

      // roots are complex number and distinct
      double real = -b / (2 * a);
      double imaginary = Math.sqrt(-determinant) / (2 * a);
      System.out.format("root1 = %.2f+%.2fi", real, imaginary);
      System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
    }
  }
}
