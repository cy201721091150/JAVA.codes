//switch���
class switchDemo 
{
	public static void main(String[] args) 
	{
		int weekday = 2;
		switch(weekday)
		{
			case 1 :System.out.println("��һ");
			break;
			case 2 :System.out.println("�ܶ�");
			break;
			case 3 :System.out.println("����");
			break;//break�൱��if�����"}"������,�Ƚ����������˳�;
			default://�൱��if elseif else�����һ��else������,��ִ�г����������������;
				System.out.println("��");
				/*
				switch���ʹ��ע������
				1)switch�����ڶԶ������ֵ����ƥ���жϵ�,�Ӷ�ʵ�ֵķ�֧����.
				��if��䲻ͬ����,if�������Ǹ�Boolean���ʽ,���Ա��ʽ��������д,
				2)switch���ֻ���൱����"���ʽ ==��ֵ"��Boolean���ʽ�ж�,�Ƴ���ʵif���
				��ǿ��,switch����ֻ�Ƕ�������ʵ�����͵��ж϶���,ʹ�ø���.
				switchֻ֧�ֵ�������byte,short,char,int.��֧����������(long).
				3)����switch������֧��int,�������ͻ��Զ�����Ϊint����.
				4)ִ��һ��case���֮��,�����case���ʧЧ,����ִ��.
				5)break����Ҫ,���û��break���ٴ�ִ����������,֪������break֮���ڽ���switch���.  
				*/


		}
	}
}
