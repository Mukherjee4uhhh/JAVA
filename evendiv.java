import java.util.Scanner;
class evendiv
{
public static void main(String args[])
{
 int N;
 Scanner sc = new Scanner(System.in);
 N = sc.nextInt();
        int count=0;
        int rem;
        int temp=N;
        while(N>0)
        {
            rem = N%10;
            if(rem!=0 && temp%rem==0)
            count++;
            N=N/10;
        }
        System.out.println(count);
    }
 }