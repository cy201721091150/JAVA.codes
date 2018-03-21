class  LogicDemo
{
	public static void main(String[] args) 
	{
		// & and && and | and ||的区别
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
		//System.out.println(false & (1 / 0==1));有错误,证明(1 / 0==1)执行了.
		//System.out.println(false && (1 / 0==1));//没有错误,证明(1 / 0==1)没有执行了.
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
		//System.out.println(true | (1 / 0==1));有错误,证明(1 / 0==1)执行了.
		//System.out.println(true || (1 / 0==1));//没有错误,证明(1 / 0==1)没有执行了.
		System.out.println("--------------------------");

		//异或(^);
		//两者相同则异(false),否则就同(true)
		System.out.println(false ^ false);//false
		System.out.println(true ^ false);//true
		System.out.println(true ^ false);//true
		System.out.println(true ^ true);//false
		System.out.println("--------------------------");

		//非;
		System.out.println(!true);//false
		System.out.println(!false);//true
		
		}
}
