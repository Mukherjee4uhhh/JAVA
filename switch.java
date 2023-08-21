import java.util.*;
class Swi
{
public static void main(String args[])
{
int day;
system.out.println("Enter the weekday no. 1 to 7");
Scanner c = new Scanner(System.in);
day = c.nextInt();
switch(day){
 	case 1:
	System.out.println("Monday");
    	break;
	case 2:
    	System.out.println("tuesday");
    	break;
	case 3:
  	System.out.println("wednesday");
    	break;
	case 4:
    	System.out.println("thersday");
    	break;
	case 5:
   	System.out.println("friday");
   	break;
	case 6:
    	System.out.println("saturday");
    	break;
	case 7:
    	System.out.println("sunday");
    	break;
	default:        
		System.out.println("only 1 to 7");

}
}
}