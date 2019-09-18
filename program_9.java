package Project_euler;

public class program_9 
{

	public static void main(String[] args) 
	{
		int a,b,c,j,i;
		for(a=1;a<1000;a++)
		{
			for(b=a;b<1000;b++)
			{
				for(c=b;c<1000;c++)
				{
					i=a*a;
					j=b*b;
					if((i+j)==(c*c)&&(a+b+c)==1000)
					{
                        System.out.println(a*b*c);
                        break;
						
					}
				}
			}
		}

	}

}
