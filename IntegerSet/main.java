import java.util.ArrayList;
import java.util.Scanner;
public class main {
static ArrayList set;
static Scanner keyboard;
static String typed;	

public static void main(String[] args) {
	
		menu();		
		
	}

	private static void menu()
	{
	
		
	   
		System.out.println("What would you like to do?");
		System.out.println("Make a new set");
		System.out.println("Show current set");
		System.out.print("Type in new or show for selection: ");
		
	    keyboard = new Scanner (System.in);
		typed= keyboard.next();
		
		if(typed.equals("new"))
		{
			newSet();
		}
		else if(typed.equals("show"))
		{
			showSet();
		}
		
	}
	
	private static void newSet()
	{
		Scanner scan;
		
		int num=0;
		
		System.out.print("Enter set (split with whitspace): ");
		keyboard = new Scanner (System.in);
		typed= keyboard.nextLine();
		
		scan= new Scanner(typed);
		
		set= new ArrayList();
		
		System.out.println("Processing....... ");
		
		while(scan.hasNext())
		{
			set.add(scan.next());
			
		}
		
		System.out.println("Processing Done ");
		menu();
	}
	
	
	
	private static void showSet()
	{
		
		System.out.println("Your set is: "+set.toString());
		menu();
	}
	
	
	
	
	
}

