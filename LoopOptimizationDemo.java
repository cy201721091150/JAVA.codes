//ѭ���Ż�
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
}//��ʱ�,ÿһ�ζ�Ҫ����,��ʼ��,�ж�.
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
}//��ʱ��֮,ֻ��Ҫ����һ��,���಻��,��������Ż�.
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
}/*��ʱ���,�����������С,����ı仯���ǳ�ʼ���Ĵ�������,��ȵڶ���ѭ������
,�����ʹ��ѭ����ʱ��ͨ���ȶ������,����ѭ������ȥ����,���ҽ���С��ѭ�����ַ������,
�ܼ��ٳ�ʼ���Ĵ���,�ܽϴ���������,
*/