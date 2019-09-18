package Project_euler;

public class program_1
{
	public static void main(String[] args)
	{
		int i,s=0;
		for(i=0;i<1000;i++)
		{
			if(i%3==0||i%5==0)
				s=s+i;
			
		}
		System.out.println(s);
	}
}