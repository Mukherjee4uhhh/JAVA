import java.util.Scanner;
class Vowel
{
    public static void main(String []args)
    {
        char n,A,a,E,e,I,i,O,o,U,u;
        Scanner sc = new Scanner(System.in);
        n = sc.next().charAt(0);
        if(n=='A' || n=='a')
        {
            System.out.println("Vowel");
        }
        else if(n=='E' || n=='e')
        {
            System.out.println("Vowel");
        }
        else if(n=='I' || n=='i')
        {
            System.out.println("Vowel");
        }
        else if(n=='O' || n=='o')
        {
            System.out.println("Vowel");
        }
        else if(n=='U' || n=='u')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}