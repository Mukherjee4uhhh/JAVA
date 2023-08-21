import java.util.Scanner;
class ifelse
{
public static void main(String args[])
{
int age;
System.out.println("Enter the ager");
Scanner sc = new Scanner(System.in);
age = sc.nextInt();

if (age >= 18)
{
System.out.println("You are eligible to vote");
}
else
{
System.out.println("You are not eligible to vote");
}
}
}