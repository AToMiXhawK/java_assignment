package studpack;

interface Student
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
    int grade;
    
    Sports(int g)
    {
        grade = g;
    }

    display()
    {
        System.out.println("Grade is "+grade);
    }
}

class Result implements Student, Sports
