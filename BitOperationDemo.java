class BitOperationDemo 
{
	public static void main(String[] args) 
	{
		/*
			3的二进制00000011;
			5的二进制00000101;

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

	~(取反)	00000011
			------------
			11111100
		
		
		*/
		System.out.println(3 & 5);//1
		System.out.println(3 | 5);//7
		System.out.println(3 ^ 5);//6
		System.out.println(~3);//-4

	}
}
