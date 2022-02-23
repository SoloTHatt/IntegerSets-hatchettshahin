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
		set= new ArrayList();

		
		if(typed.equals("new"))
		{
			newSet();
		}
		else if(typed.equals("show"))
		{
			showSet();
		}
		else if(typed.equals("select"))
		{
			setSelect(set);
		}
		
	}
	
	private static ArrayList newSet()
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

		return (set);
	}
	
	
	
	private static void showSet()
	{
		
		System.out.println("Your set is: "+set.toString());
		menu();
	}
	
	private static void setSelect(ArrayList<ArrayList> set)
	{
		
		System.out.println("Please select a set (" + set.get(0)+","+set.get(set.size())+")");

		keyboard = new Scanner (System.in);
		typed= keyboard.next();

		System.out.println("Set"+typed+"is now the current set:"+set);
		menu();

	}

	private static void setDelete(ArrayList<ArrayList> currentSet)
	{
		System.out.println("Set "+currentSet+"Has been deleted. Remaining sets have been relabled. The current set is:");

		//cannot relabel sets just yet. we need to initilize a collection, then move sets around. 

		set.remove(currentSet);

		menu();

	}



	
	
	
	
}

