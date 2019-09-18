package Project_euler;

public class program_6 
{

	public static void main(String[] args) 
	{
		int i,a=0,c,b=0;
		for(i=1;i<=100;i++)
		{
			a=a+(i*i);
			b=b+i;
			
		}
		c=(b*b)-a;
		System.out.println(c);

	}

}
