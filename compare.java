class compareDemo 
{
	public static void main(String[] args) 
	{
		//判断一个数是奇数还是偶数;
		//判断一个数的奇偶,只需要对2取余,之后判断是否为0;
		int number=2;
		String a = number % 2 == 0 ? "偶数":"奇数";
		System.out.println(a);
	}
}