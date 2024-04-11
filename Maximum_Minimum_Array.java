class Maximum_Minimum_Array
{
	
	public static void main(String as[])
	{
		int x[]={1,2,3,5,2,9,10,7};
		int y=x.length;
		int max=x[0];
		int min=x[0];
		for(int i=0;i<y;i++)
		{
         if (x[i] > max) 
	    {
        max = x[i];
        }
  
		}
        System.out.println("Maximum Element In Array="+max);
		
		for(int i=0;i<y;i++)
		{
         if (x[i]<=min) 
	    {
        min = x[i];
        }
  
		}
		System.out.println("Minimum Element In Array="+min);
    }
		
}
