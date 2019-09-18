package Project_euler;

public class program_3 
{

	public static void main(String[] args)
	{
	long n=600851475143L,i;
	
	for(i=3;i<n;i++)
	{
	 while(n%i==0&&i<n)
		 n/=i;
	 
	}
	System.out.println(n);
	}
	

}
