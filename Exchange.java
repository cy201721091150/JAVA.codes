//��������
class Exchange 
{
	public static void main(String[] args) 
	{
		//�����м����
		int a=10,b=12,c;
		c=a;
		a=b;
		b=c;
		System.out.println("a="+a+",b="+b);

		//��������,��������
		a=b-a;
		b=b-a;
		a=b+a;
		System.out.println("a="+a+",b="+b);

		//λ����(���)
		a=b^a;
		b=b^a;
		a=b^a;
		System.out.println("a="+a+",b="+b);
	}
}
