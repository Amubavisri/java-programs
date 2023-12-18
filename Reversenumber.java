import java.util.*;
public class Reversenumber
{
     public static void main(String args[])   
   {
     Scanner reader = new Scanner(System.in);
     System.out.print("\n Enter a number");
     int num = reader.nextInt();
	  int numcopy = num;
	  int reversenum = 0;
	  while(num >0)
	  {
	    reversenum = reversenum*10 + num%10;
	    num = num/10;
	    System.out.print(num);
	  }	
	     System.out.print("\nReverse of the given number is " + reversenum); 
	}
}
     