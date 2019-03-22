package studpack;

class Student
{
    String name;
    int rollno;
    int mark1, mark2, mark3;

    Student()
    {
        name = "NULL";
        rollno = 0 ;
        mark1 = 0; mark2 = 0; mark3 = 0;
        System.out.println("Object Created");
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
        System.out.println("Total is "+total);
    }
}