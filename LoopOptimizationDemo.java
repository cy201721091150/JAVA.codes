//循环优化
public class LoopOptimizationDemo
{
	public static void main(String[] args) 
	{
		for (int i=0;i<1000 ;i++ )
		{
			for (int j=0;i<100 ;j++ )
			{
				for (int k=0;k<10 ;k++ )
				{
					System.out.println(i);
					System.out.println(j);
					System.out.println(k);
				}
			}
		}

	}
}//耗时最长,每一次都要定义,初始化,判断.
class LoopOptimizationDemo1
{
	public static void main(String[] args) 
	{
		int i,j,k;
		for (i=0;i<1000 ;i++ )
		{
			for (j=0;i<100 ;j++ )
			{
				for (k=0;k<10 ;k++ )
				{
					System.out.println(i);
					System.out.println(j);
					System.out.println(k);
				}
			}
		}

	}
}//耗时次之,只需要定义一次,其余不变,相比上则优化.
class LoopOptimizationDemo3
{
	public static void main(String[] args) 
	{
		int i,j,k;
		for (i=0;i<10 ;i++ )
		{
			for (j=0;i<100 ;j++ )
			{
				for (k=0;k<1000 ;k++ )
				{
					System.out.println(i);
					System.out.println(j);
					System.out.println(k);
				}
			}
		}

	}
}/*耗时最短,且最外层数字小,引起的变化就是初始化的次数减少,相比第二种循环而已
,因此在使用循环的时候通常先定义变量,不在循环体累去定义,并且将较小的循环数字放在外层,
能减少初始化的次数,能较大的提高性能,
*/