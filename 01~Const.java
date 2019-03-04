//Program to show constructor overloading

class Shape
{
    int a, b;
    double c, area;
    
    Shape()
    {
        a = 0;
        b = 0;
        c = 0;
        area = 0;
    }

    Shape(int side)
    {
        a = side;
        b = 0;
        c = 0;
        area = side*side;
    }

    Shape(double radius)
    {
        a = 0;
        b = 0;
        c = radius;
        area = 3.14*radius*radius;
    }

    Shape(int length, int breadth)
    {
        a = length;
        b = breadth;
        c = 0;
        area = length*breadth;
    }

    double area() { return area; }
}

class Const
{
    public static void main(String[] args) 
    {
        Shape square = new Shape(4);
        Shape circle = new Shape(2.257330592);
        Shape rectangle = new Shape(2,4);
        Shape noshape = new Shape();

        System.out.println("Area of Square is: "+square.area());
        System.out.println("Area of Circle is: " + circle.area());
        System.out.println("Area of Rectangle is: " + rectangle.area());
        System.out.println("Area of NoShape is: " + noshape.area()); 
    }
}