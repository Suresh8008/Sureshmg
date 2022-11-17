package JAVA;

public class Parameter {
int sum(int a,char b)
{
	int res=a+b;
	return res;

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameter obj=new Parameter();
int total=obj.sum(100, 'm');
System.out.println(total);
	}

}
