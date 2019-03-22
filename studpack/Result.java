package studpack;
import java.util.Scanner;

class Student
{
    String name;
    int rollno;
    int mark1, mark2, mark3;

    Student()
    {
	Scanner sc = new Scanner(System.in);
	System.out.print("\nEnter name: ");
        name = sc.next();
	System.out.print("Enter Rollno: ");
        rollno = sc.nextInt();
	System.out.println("Enter marks of 3 subjects: ");
        mark1 = sc.nextInt(); mark2 = sc.nextInt(); mark3 = sc.nextInt();
        System.out.println("Student Object Created");
    }

    Student(String n, int roll, int m1, int m2, int m3)
    {
        name = n;
        rollno = roll;
        mark1 = m1; 
        mark2 = m2;
        mark3 = m3;
    }

}

interface Sports
{
    int grade=10;
    void display_grade();
}

public class Result extends Student implements Sports
{
    public Result(String n, int roll, int m1, int m2, int m3)
    {
        super(n,roll,m1,m2,m3);
    }

    public Result() 
    {
        super();
    }

    @Override
    public void display_grade() 
    {
        System.out.println("Grade is "+grade);
    }

    int total=mark1+mark2+mark3+grade;

    public void display_total()
    {
        System.out.println("\nName        : "+name);
        System.out.println("Roll no     : " +rollno);
        System.out.println("Total Marks : " +total);
    }
}

