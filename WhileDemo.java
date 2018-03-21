class WhileDemo 
{
	public static void main(String[] args) 
	{
		int t=1;
		long sum=1;
		while(t<100)
		{
			sum+=t;
			t++;
		}
		System.out.println(sum);
		System.out.println("--------------");
		
		int i=1;
		long sum1=1;
		do
		{
			sum1+=i;
			i++;
		}while(i<100);
		System.out.println(sum1);//(此处的分号是表示一句完整的语句的结束标志);
		//区别:while是判断之后再执行,而do-while是先执行一次再判断;
	}
}
