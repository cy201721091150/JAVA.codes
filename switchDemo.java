//switch语句
class switchDemo 
{
	public static void main(String[] args) 
	{
		int weekday = 2;
		switch(weekday)
		{
			case 1 :System.out.println("周一");
			break;
			case 2 :System.out.println("周二");
			break;
			case 3 :System.out.println("周三");
			break;//break相当于if语句中"}"的作用,既结束该语句而退出;
			default://相当于if elseif else中最后一个else的作用,既执行除上述语句以外的情况;
				System.out.println("无");
				/*
				switch语句使用注意事项
				1)switch适用于对多个整型值进行匹配判断的,从而实现的分支控制.
				和if语句不同的是,if语句后面是跟Boolean表达式,所以表达式可以任意写,
				2)switch语句只是相当于做"表达式 ==数值"的Boolean表达式判断,推出其实if语句
				更强大,switch仅仅只是对整数的实型类型的判断而已,使用更简单.
				switch只支持的类型是byte,short,char,int.不支持其它类型(long).
				3)本质switch仅仅是支持int,上述类型会自动提升为int类型.
				4)执行一个case语句之后,其余的case语句失效,不再执行.
				5)break很重要,如果没有break则再次执行下面的语句,知道遇见break之后在结束switch语句.  
				*/


		}
	}
}
