\\Create a package CIE which has two classes- Student and Internals. The class Personal has members like usn, name, sem. The class Internals has an array that stores the internal marks scored in five courses of the current semester of the student. Create another package SEE which has the class External which is a derived class of Student. This class has an array that stores the SEE marks scored in five courses of the current semester of the student. Import the two packages in a file that declares the final marks of n students in all five courses.

1.import SEE.*;
import CIE.*;
import java.util.Scanner;

class Totalmarks{

public static void main(strings[]args)
{
int i,j,n;
Scanner scan=new Scanner(system.in);
int total[]=new int[5];
System.out.println("Enter no of students: ");
n=scan.nextInt();
cie.Student s[]=new CIE.student[n];
cie.internals ci[]=new CIE.internals[n];
see.externals se[]=new SEE.Externals[n];

for(int i=0;i<n;i++)
{
   System.out.Println("enter student details:");
    s[i]=new cie.Student();
    s[i].accept();
    ci[i]=new cie.internals();
    ci[i]=accept();
    se[i]=new see.externals();
    se[i]=accept();
   }
for(i=0;i<n;i++)
{
System.out.Println(" student details:",+(i+1));
s[i].display();
for(j=0;j<5;j++)
{
total[j]=ci[i].ciem[j]+se[i].seem[j];
System.out.Println("total marks:"+(j+1)+":"+total[j]);
 }
   }
 }
}
package CIE;
import java.util.Scanner;
public class Student
{
Scanner scan=new Scanner(system.in);
public string usn,name;
public int sem;

public void accept(){
System.out.println("Enter USN: ");
usn=scan.nextline();
System.out.println("Enter Name: ");
name=scan.nextline();
System.out.println("Enter SEM: ");
sem=scan.nextInt();
}

public void display()
{ 
System.out.println("USN: ",+usn);
System.out.println("name: ",+name);
System.out.println("sem: ",+sem);
  }
}
import SEE.*;
import CIE.*;
import java.util.Scanner;

class Totalmarks{

public static void main(strings[]args)
{
int i,j,n;
Scanner scan=new Scanner(system.in);
int total[]=new int[5];
System.out.println("Enter no of students: ");
n=scan.nextInt();
cie.Student s[]=new CIE.student[n];
cie.internals ci[]=new CIE.internals[n];
see.externals se[]=new SEE.Externals[n];

for(int i=0;i<n;i++)
{
   System.out.Println("enter student details:");
    s[i]=new cie.Student();
    s[i].accept();
    ci[i]=new cie.internals();
    ci[i]=accept();
    se[i]=new see.externals();
    se[i]=accept();
   }
for(i=0;i<n;i++)
{
System.out.Println(" student details:",+(i+1));
s[i].display();
for(j=0;j<5;j++)
{
total[j]=ci[i].ciem[j]+se[i].seem[j];
System.out.Println("total marks:"+(j+1)+":"+total[j]);
 }
   }
 }
}
package SEE;
import CIE.*;
import java.util.Scanner;


public class Externals extends CIE.Students
{

Scanner scan=new Scanner(system.in);
public int seem[]=new int[5];

public void accept(){

for(int i=0;i<5;i++)
{
System.out.Println(" enter see marks",+(i+1));
seem[i]=scan.nextInt();
 }
   }
 }
