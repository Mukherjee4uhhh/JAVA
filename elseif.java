import java.util.Scanner;
class elseif
{
public static void main(String args[])
{
int a,b,c;
System.out.println("Enter the numbers");
Scanner sc = new Scanner(System.in);
a= sc.nextInt();
b= sc.nextInt();
c= sc.nextInt();

if (a>b && a>c)
{
System.out.println("a is the greatest");
}
else if (b>c && b>a)
{
System.out.println("b is the greatest");
}
else
{
System.out.println("c is the greatest");
}
}
}