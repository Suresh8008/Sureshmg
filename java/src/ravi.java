import com.android.dx.command.annotool.Main;

public class ravi
{
	void parcentage(int attendance, int held )
	{
		int parcentag =(attendance*100)/held;
		if(parcentag>=75&&attendance<=held)
		{
			System.out.println("your attendance  :" +parcentag );
			System.out.println("congrats !! your elligible for exam");
		}
		else
		{
			System.out.println("your not elligilible for exam");
		}
	}
	
	public static void main(String[]args)
		{
			new ravi().parcentage(10,100);
		}
	}