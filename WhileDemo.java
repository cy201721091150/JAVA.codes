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
		System.out.println(sum1);//(�˴��ķֺ��Ǳ�ʾһ�����������Ľ�����־);
		//����:while���ж�֮����ִ��,��do-while����ִ��һ�����ж�;
	}
}
