class ArrayDemo 
{
	public static void main(String[] args) 
	{
		int[] nums = new int[]{1,2,3,4,5};
		/*new�ؼ���������ʾ���ڶѿռ俪��һ���ڴ�����,������������,
		ÿnewһ��ϵͳ����һ������
		*/
		/*��д��:int[] nums = {1,2,3}
		�����ڶ���֮�����̳�ʼ��,�������������ʼ��;
		��int[] nums;
		  nums = {1,2,3}
		 ���ֳ�ʼ����ʽ���Ǵ��;
		*/
		//�����������
		System.out.println("����ĳ���:"+nums.length);//����ĳ���;
		print(nums);
		System.out.println();
		//����ļ������,���������������ʱʹ��
		for (int ele : nums)
		{
			System.out.print(ele+"  ");
		}//�˴���ele��ʾ�������������Ԫ��
		System.out.println();
		System.out.println("---------------------");
		int a = nums[0];
		nums[2] = 0;//�޸�����ֵ;
		System.out.println(a);
		System.out.println(nums[2]);
		float[] b=new float[2];
		//b=null;������,��ָ��;
		for (int i=0;i<2 ;i++ )
		{
			System.out.println(b[i]);
		}
		System.out.println("---------------------");
		/*�����Ĵ�������
		  1.null Point Exception(��ָ��,������)
		  2.Arry index Out Of Bounds Exception ����(�±�)Խ��;
		*/
		//��ά����Ķ���
		int[][] arr = new int[][]{{1,2,3},{4,5,7},{6,8,9}};
		//�����ά����
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0;j<arr.length ;j++ )
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		//�����Ĳ����ɱ����
		int[] src=new int[]{10,20,30,40,50};//Դ����
		int[] dest=new int[]{0,0,0,0,0,0,0,0,0,0,0,0};//Ŀ������
		int sum = ArrayDemo.getSum(2,src);
		System.out.println(sum);
		System.out.println("---------------------");
		print(dest);
		ArrayDemo.copy(src,0,3,dest,2);
		//��src����ĵ�0����λ�ø���3��Ԫ�ص���dest�����2λ��������ʼճ��
		print(dest);
		
	}
	static int getSum(int a,int ... arr)
		//�˴��ɱ�Ĳ������ֻ������1��,��������Ĳ���������
	{
		int sum = 0;
		
		for (int price:arr)
		{
			sum+=price;
		}
		return sum+a;
	}
	static void print(int[] arr)
	{
		if(arr==null)
		{
			System.out.println("null");
			return;
		}
		String ret ="[";
		for(int index=0;index<arr.length;index++)
		{
			ret+=arr[index];
			//�����ǰindex�������һ������,��ƴ��", "
			if (index!=arr.length-1)
			{
				ret=ret+", ";
			}
		}
		ret = ret+"]";
		System.out.println(ret);		
	}
	static void copy(int[] src,int srcPos,int length,int[] dest,int destPos)
	//��src����ĵ�0����λ�ø���3��Ԫ�ص���dest�����2λ��������ʼճ��
	{
		for(int index=srcPos;index<length+srcPos;index++)
		{
			dest[destPos]=src[index];
			destPos++;
		}
	}
	
}
