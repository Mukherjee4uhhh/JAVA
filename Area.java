import java .util.Scanner;
abstract class Shape
{
double dim1;
double dim2;
Shape (double a,double b)
{
dim1 = a;
dim2 = b;
}
abstract double area();
}
class Rectangle extends Shape
{
Rectangle(double a,double b)
{
super(a,b);
}
double area()
{
return dim1*dim2;
}
}
class Triangle extends Shape
{
Triangle(double a,double b)
{
super(a,b);
}
double area()
{
return dim1*dim2/2;
}
}
class Ellipse extends Shape
{
Ellipse(double a,double b)
{
super(a,b);
}
double area()
{
return 3.14159*dim1*dim2;
}
}
public class Area {
public static void main(string args[])
{
Scanner sc = new scanner(System.in);
int ch;
do{
system.out.println("1.RECTANGLE"); 
system.out.println("2.TRIANGLE"); 
system.out.println("3.ELLIPSE"); 
system.out.println("Enter Your Choise:"); 
ch = sc.nextInt();
switch(ch)
{
case 1:
system.out.println("Enter two dimension for area of a rectangle :");
double a = sc.nextDouble();
double b = sc.nextDouble();
Rectangle d1 = new Rctangle(a,b);
system.out.println("area of rectangle in"+d1.area());
break;
case 2:
system.out.println("Enter two dimension for area of a triangle :");
double c = sc.nextDouble();
double d = sc.nextDouble();
Rectangle d1 = new Rctangle(c,d);
system.out.println("area of triangle in"+d2.area());
break;
case 3:
system.out.println("Enter two dimension for area of a ellipse :");
double e = sc.nextDouble();
double f = sc.nextDouble();
Rectangle d1 = new Rctangle(e,f);
system.out.println("area of ellips in"+d3.area());
break;
default:
}
system.out.println("press 1 to continue of 0 to exit :");
ch = sc.nextInt();
}
while(ch==1);
}
}

 