import java.util.*;
public class Swapnumbers
{
   public Static void main(String args[])
  {
    Scanner reader = new Scanner(System.in);
          System.out.print("\nEnter the first number: ");
          int firstnum = reader.nextInt();    
          System.out.print("\nEnter the second number: ");
          int secondnum = reader.nextInt();
          reader.close();
	  int temp = firstnum;
          fistnum = secondnum;
          secondnum = temp;
          System.out.print("Swaped numbers are: First number = " + firstnum + " Second number: " + secondnum);    
      }
}