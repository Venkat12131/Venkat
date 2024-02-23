class ArrayDemo1
{
	public static void main(String args[])
	{
		int array[]={100000,343543,445345,3452435,1,0};
		int a[]=new int[5];
		int min=0;
			
		for(int i=1;i<array.length;i++)
		{
			if(array[min]<=array[i])
			{
				a.insert(array[min]);
			}
			else 
			{
				a.insert(array[i]);
			}
		}
		for(int j=0;j<a.length;j++)	
		{
			if(a[min]<a[i])
			{
				min=j;
			}
		}
		System.out.println("The peek element  index is:"+min);
		System.out.println("the peek element is present in the  givemnb array is:"+array[min]);

		
	}
}
	