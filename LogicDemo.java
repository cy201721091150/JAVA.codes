class  LogicDemo
{
	public static void main(String[] args) 
	{
		// & and && and | and ||������
		System.out.println(true & true);//true
		System.out.println(true & false);//false
		System.out.println(false & true);//false
		System.out.println(false & false);//false
		System.out.println("--------------------------");
		System.out.println(true && true);//true
		System.out.println(true && false);//false
		System.out.println(false && true);//false
		System.out.println(false && false);//false
		System.out.println("--------------------------");
		//System.out.println(false & (1 / 0==1));�д���,֤��(1 / 0==1)ִ����.
		//System.out.println(false && (1 / 0==1));//û�д���,֤��(1 / 0==1)û��ִ����.
		System.out.println("--------------------------");
		System.out.println(true | true);//true
		System.out.println(true | false);//ture
		System.out.println(false | true);//true
		System.out.println(false | false);//false
		System.out.println("--------------------------");
		System.out.println(true || true);//true
		System.out.println(true || false);//ture
		System.out.println(false || true);//true
		System.out.println(false || false);//false
		//System.out.println(true | (1 / 0==1));�д���,֤��(1 / 0==1)ִ����.
		//System.out.println(true || (1 / 0==1));//û�д���,֤��(1 / 0==1)û��ִ����.
		System.out.println("--------------------------");

		//���(^);
		//������ͬ����(false),�����ͬ(true)
		System.out.println(false ^ false);//false
		System.out.println(true ^ false);//true
		System.out.println(true ^ false);//true
		System.out.println(true ^ true);//false
		System.out.println("--------------------------");

		//��;
		System.out.println(!true);//false
		System.out.println(!false);//true
		
		}
}
