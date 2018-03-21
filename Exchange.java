//两数交换
class Exchange 
{
	public static void main(String[] args) 
	{
		//引出中间变量
		int a=10,b=12,c;
		c=a;
		a=b;
		b=c;
		System.out.println("a="+a+",b="+b);

		//算术运算,引出距离
		a=b-a;
		b=b-a;
		a=b+a;
		System.out.println("a="+a+",b="+b);

		//位运算(异或)
		a=b^a;
		b=b^a;
		a=b^a;
		System.out.println("a="+a+",b="+b);
	}
}
