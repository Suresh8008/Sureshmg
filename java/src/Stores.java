import java.util.Scanner;
public class Stores
{

	static Scanner sc=new Scanner(System.in);
    int qun;
    public void meth()
    {
    	System.out.println("1.meet");
    	System.out.println("2.fruit");
    	System.out.println("3.vegetables");
    	System.out.println("4.creems");
    }}
    public static void main(String[] args)
    {
		new Stores().meth();
		switch(sc.nextInt())
		{
		case 1:
			System.out.println("101.chicken");
			System.out.println("102.mutton");
			System.out.println("103.fish");
			switch(sc.nextInt())
			{
			case 101:
				System.out.println("how many kgs u want");
				int kgs=sc.nextInt();
				if(kgs>0)
				{
					int a=kgs*200;
					System.out.println("your cost is" +a);
					System.out.println("choose one ");
					System.out.println("ooo. main");
					 System.out.println("111. bill");
					break;
				}
			case 102:
				System.out.println("how many kgs u want");
				int k=sc.nextInt();
				if(k>0)
				{
					int b=k*300;
					System.out.println("your cost is" +b);
					System.out.println("choose one ");
					System.out.println("ooo. main");
					 System.out.println("111. bill");
					break;
				}
			case 103:
				System.out.println("how many kgs u want");
				int s=sc.nextInt();
				if(s>0)
				{
					int a=s*200;
					System.out.println("your cost is" +a);
					System.out.println("choose one ");
					 System.out.println("ooo. main");
					 System.out.println("111. bill");
					break;
				}
			}
			switch(sc.nextInt())
			{
			case 000:
				System.out.println("choose one ");
				new Stores().meth();
				break;
			case 111:
				
				System.out.println("you bill=");
			}
	    break;
			
		case 2:
			System.out.println("201.mango");
			System.out.println("202.apple");
			System.out.println("203.banana");
			switch(sc.nextInt())
			{
		case 201:
			System.out.println("how many kgs u want");
			int kgs=sc.nextInt();
			if(kgs>0)
			{
				int a=kgs*100;
				System.out.println("your cost is" +a);
				System.out.println("choose one ");
				System.out.println("ooo. main");
				 System.out.println("111. bill");
				break;
			}
		case 202:
			System.out.println("how many kgs u want");
			int k=sc.nextInt();
			if(k>0)
			{
				int b=k*150;
				System.out.println("your cost is" +b);
				System.out.println("choose one ");
				System.out.println("ooo. main");
				 System.out.println("111. bill");
				break;
			}
			
			}
		case 203:
			System.out.println("how many kgs u want");
			int s=sc.nextInt();
			if(s>0)
			{
				int a=s*80;
				System.out.println("your cost is" +a);
				System.out.println("choose one ");
				System.out.println("ooo. main");
				 System.out.println("111. bill");
				break;
			}
			}
		switch(sc.nextInt())
		{
		case 000:
			System.out.println("choose one ");
			new Stores().meth();
			break;
		case 111:
			
			System.out.println("you bill=");
		}
    break;
    case3:
    	
			System.out.println("302.onion");
			System.out.println("303.mirchi");
			switch(sc.nextInt())
			{
		case 301:
			System.out.println("how many kgs u want");
			int i=sc.nextInt();
			if(i>=0)
			{
				int a=i*200;
				System.out.println("your cost is" +a);
				System.out.println("choose one ");
				System.out.println("ooo. main");
				 System.out.println("111. bill");
				break;
			}
		case 302:
			System.out.println("how many kgs u want");
			int j=sc.nextInt();
			if(j>0)
			{
				int b=j*300;
				System.out.println("your cost is" +b);
				System.out.println("choose one ");
				System.out.println("ooo. main");
				 System.out.println("111. bill");
				break;
			
			}
		case 303:
			System.out.println("how many kgs u want");
			int s=sc.nextInt();
			if(s>0)
			{
				int a=s*200;
				System.out.println("your cost is" +a);
				System.out.println("choose one ");
				System.out.println("ooo. main");
				 System.out.println("111. bill");
				break;
				switch(sc.nextInt())
				{
				case 000:
					System.out.println("choose one ");
					new Stores().meth();
					break;
				case 111:
					
					System.out.println("you bill=");
				
			
			}
    
	
			case4:
			System.out.println("101.face");
			System.out.println("402.skin");
			System.out.println("403.hair");
			
			switch(sc.nextInt())
			{
		case 401:
			System.out.println("how many kgs u want");
			int kgs=sc.nextInt();
			if(kgs>0)
			{
				int a1=kgs*200;
				System.out.println("your cost is" +a1);
				System.out.println("choose one ");
				System.out.println("ooo. main");
				 System.out.println("111. bill");
				break;
			}
		case 402:
			System.out.println("how many kgs u want");
			int k=sc.nextInt();
			if(k>0)
			{
				int b=k*300;
				System.out.println("your cost is" +b);
				System.out.println("choose one ");
				System.out.println("ooo. main");
				 System.out.println("111. bill");
				break;
			}
		case 403:
			System.out.println("how many kgs u want");
			int s1 =sc.nextInt();
			if(s1>0)
			{
				int a1=s1*200;
				System.out.println("your cost is" +a1);
				System.out.println("choose one ");
				System.out.println("ooo. main");
				 System.out.println("111. bill");
				break;}}
		
    
	


