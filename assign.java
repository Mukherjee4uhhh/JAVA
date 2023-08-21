import java.util.Scanner;
class assign
{
public static void main(String args[])
{
int a,b;
System.out.println("Enter the values of a and b");
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
b = sc.nextInt();
System.out.println("add:"+ (a+b));
System.out.println("sub:"+ (a-b));
System.out.println("mul:"+ a*b);
System.out.println("div:"+ b/a);
System.out.println("incriment:"+ ++a);
}
}


