import java.util.Scanner;
public class StringArray {

	public static void main(String[] args) 
	{ 
		// IO
		Scanner input=new Scanner( System.in);
		boolean run=true;
		while(run)
		{
		
		 // Main Menu Option
		System.out.println(" Enter a number for Choice");
		System.out.println(" 1 - Input");
		System.out.println(" 2 - insert at a particular index");
		System.out.println(" 3 - search a String ");
		System.out.println(" 4 - Exit");
		int a=input.nextInt();
		// Condition menu
		switch(a)
		{
		case 1 : System.out.println(" Input Array");
		Input();
		break;
		case 2: System.out.println("Store String At a particular index "); 
		particular();
		break;
		
		case 3 : System.out.println(" ");
		search();
		break;
		
		case 4 :
			System.out.println(" Program is End");
			run = false; 
			break;
	}
		}
}
	
	// input Method
	public static void Input()
	{ 
		boolean run=true;
		while(run)
		{
		Scanner input=new Scanner(System.in);
		String [] names= new String [5];
		
		for(int i=0 ; i<5; i++)
		{
			System.out.println(" Enter a string A["+i+"]");
			names[i]= input.next();
		}
		// Sub Menu
		boolean sbrun=true;
		while(sbrun)
		{
		System.out.println(" Enter choice");
		System.out.println(" a - concatination");
		System.out.println(" b- length");
		System.out.println(" c - equal");
		System.out.println(" d -  lowercase");
		System.out.println(" e - uppercase");
		System.out.println(" f - index");
		System.out.println(" i- exit");
		char b=input.next().toLowerCase().charAt(0);
		// Concatination
		switch(b)
		{
		case 'a' : System.out.println(" Here is concatination");
		concate(names);
		break;
		// length
		case 'b' : System.out.println(" Here is check length");
		length(names);
		
		break;
		// Equal
		case'c' : System.out.println(" For equalation");
		equal(names);
		break;
		// Lowercase
		case 'd' : System.out.println(" lower case");
		lowercase(names);
		break;
		// Uppercase
		case 'e' :
			System.out.println(" Upper Case");
			uppercase(names);
			break;
			// Index
		case 'f' : System.out.println(" Index");
		index(names);	
		break;
		// Exit
		case 'i' : System.out.println(" Exit");
		System.out.println("Program goes back to main menu");	
		run=false;
		sbrun=false;
		break;
		default : System.out.println(" I do not recongnize ");
		}
	}
		}
		}
	
	//Concate method
	public static void concate(String [] names )
	{
		Scanner input=new Scanner(System.in);
		System.out.println(" Enter a String for concatination");
		String value=input.next();
		for(int j=0; j<names.length; j++)
		{
			names[j]=names[j]+value;
			System.out.println(" "+names[j]);
		}
		
		
		
	}
	// length Method
	public static void length(String [] names)
	{
		int flag=0;
		while(flag==0)
		{
		for(int j=1; j<names.length; j++)
		{
			int z=names[j].length();
			System.out.println("The A["+j+"]"+z);
		flag++;
		
		}
		
				
		}
		
		}
	// Equality
	private static void equal(String[] names) {
	Scanner input=new Scanner(System.in);
		System.out.println(" Enter a length for check");
	int s=input.nextInt();
	int check=0;
	while(check==0)
	{
		for(int j=0; j<names.length; j++)
		{
			if(names[j].length()==s)
			{
				System.out.println(" Match A["+j+"]");
				check++;
		}
	
	 }	if(check==0)
			System.out.println(" No letter Match to this length");
		break;

		}
	
	}
	// Lower Case
	public static void lowercase(String [] names)
	{
		for(int j=0; j<names.length; j++)
		{
			names[j]=names[j].toLowerCase();
		System.out.println(" A["+j+"]"+names[j]);
		}
	}
	// Upper Case
public static void uppercase(String [] names)
{
	for(int j=0; j<names.length; j++)
	{
		names[j]=names[j].toUpperCase();
	System.out.println(" A["+j+"]"+names[j]);
	}
}

// Index
public static void index(String[] names)
{
	System.out.println(" Enter char for finding");
	Scanner input=new Scanner(System.in);
	char a=input.next().charAt(0);
	for(int j=0; j<names.length; j++)
	{
	int h=names[j].indexOf(a,0);
	System.out.println(h);
}

	}
// Store at a particular
public static void particular()
{
Scanner input=new Scanner(System.in);
System.out.println(" Enter a string at particular index");
String a=input.next();
String [] list=new String[5];
System.out.println(" Enter index less than five to store String");
int b=input.nextInt();
list[b]=a;
System.out.println(" A["+b+"]"+list[b]);
}
// Search String
public static void search()
{
	Scanner input=new Scanner(System.in);
	String [] search=new String [5];
	int flag=0;
	while(flag==0)
	{
			
	for(int j=0; j<search.length; j++)
	{
		System.out.println(" Enter a String at A["+j+"]");
		search[j]=input.next();
		
	}
	System.out.println(" Enter a String for Searching");
	String b=input.next();
	for(int s=0; s<search.length; s++)
	{
		if(search[s].equals(b))
		{
			System.out.println(" Searched ["+s+"]"+search[s]);
		flag++;
		}
	}
	if(flag==0)
	{
		System.out.println(" String Not Found");
		break;
	}
	
	} 
}

}

