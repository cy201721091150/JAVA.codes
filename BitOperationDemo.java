class BitOperationDemo 
{
	public static void main(String[] args) 
	{
		/*
			3�Ķ�����00000011;
			5�Ķ�����00000101;

		&	00000011
			00000101
			------------
			00000001

		|	00000011
			00000101
			------------
			00000111

		^	00000011
			00000101
			------------
			00000110

	~(ȡ��)	00000011
			------------
			11111100
		
		
		*/
		System.out.println(3 & 5);//1
		System.out.println(3 | 5);//7
		System.out.println(3 ^ 5);//6
		System.out.println(~3);//-4

	}
}
