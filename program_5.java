package Project_euler;

public class program_5 {

	public static void main(String[] args) {

		int i=1,j,c=0,a=0;
		
		for(i=21;i<1000000000;i++)
		{
			for(j=1;j<=20;j++)
			{
				c=i%j;
				if(c==0)
					a++;
			}
			if(a==20)
			{
				System.out.println(i);
				break;
             }
			a=0;
		}
           
	}

}
