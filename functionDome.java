//�����Ķ���͵���
class  functionDome
{
	//�޲�������.
	//����:����һ������,ר�Ŵ�ӡ--------------
	static void p()
	{
		System.out.println("-----------------");
	}

	//�в����޷���
	//����:��ӡ����ֵ
	static void pVlue(String val)
	{
		System.out.println(val);
	}

	//�޲����з���
	//����:�����ҵ�����
	static int getage()
	{
		return 19;
	}
	//�в����з���
	//����:������֮��:getsum
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
