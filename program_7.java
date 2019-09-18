package Project_euler;

public class program_7
{

	public static void main(String[] args) 
	{
     int i=1,j,c=1,k=0;
     while(c<10002)
     {
    	 i++;
    	 if(i%2==1||i==2)
    	 {
    		 for(j=1;j<=i;j++)
    	 
    	 {
    		 if(i%j==0)
    			 k++;
    		 }
    	 if(k==2)
    	 {	 c++;
    	 }
    	 }
    	k=0;
     }
     System.out.println(i);

	}

}
