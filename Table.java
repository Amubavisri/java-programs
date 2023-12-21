import java.util.Scanner;

public class Table
{
	public static void main (String args[])
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number, Number = ");
		int num = reader.nextInt();
		for (int i=1; i<15; i++)
		{
			System.out.print(num + " x " + i + "  = " + num*i + "\n");
		}
	}
}