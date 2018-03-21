class  DeltaDemo
{
	public static void main(String[] args) 
	{
		int i,j,k;
		for (i=0;i<9;i++)
		{
			for (j=0;j<9-i;j++)
			{
				System.out.print(" ");
				
			}
			for (k=0;k<=2*i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
