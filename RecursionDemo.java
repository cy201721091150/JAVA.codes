class RecursionDemo 
{
	public static void main(String[] args) 
	{
		int a=sum(3);
		System.out.println(a);
	}
	static int sum(int a)
{
	if (a==0)
	{
		return 1;
	}
	else if (a==1)
	{
		return 2;
	}
	else return sum(a-1)+sum(a-2);

}
}
