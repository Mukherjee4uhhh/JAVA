import java.util.Scanner;
class palin
{
public static void main(String args[])
{
 int N;
 Scanner sc = new Scanner(System.in);
 N = sc.nextInt();
        int count=0;
        int rem;
        int rev = 0;
        int temp=N;
        while(N>0)
        {
            rem = N%10;
            rev = rev *10+ rem;
            N=N/10;
        }
        if(rev==temp)
	{
	System.out.println("yes");
	}
        else
	{
	System.out.println("no");
	}
    }
 }