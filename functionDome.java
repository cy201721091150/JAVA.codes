//方法的定义和调用
class  functionDome
{
	//无参数返回.
	//需求:定义一个方法,专门打印--------------
	static void p()
	{
		System.out.println("-----------------");
	}

	//有参数无返回
	//需求:打印任意值
	static void pVlue(String val)
	{
		System.out.println(val);
	}

	//无参数有返回
	//需求:返回我的年龄
	static int getage()
	{
		return 19;
	}
	//有参数有返回
	//需求:求两数之和:getsum
	static int getsum(int a,int b)
	{
		return a+b;
	}
	public static void main(String[] args) 
	{
		functionDome.p();
		functionDome.pVlue("SB");
		int a=functionDome.getage();
		int b=functionDome.getsum(125,125);
		System.out.println(a);
		System.out.println(b);
	}
}
