class Duplicate_Array
{
	
	public static void main(String as[])
	{
		int x[]={1,2,3,5,2,6,6,7};
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]==x[j])
				{
				
		System.out.println(x[j]);
				}
			}
		}
	}
}