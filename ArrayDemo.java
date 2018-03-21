class ArrayDemo 
{
	public static void main(String[] args) 
	{
		int[] nums = new int[]{1,2,3,4,5};
		/*new关键字用来表示正在堆空间开辟一块内存区域,用来储存数据,
		每new一次系统储存一次数据
		*/
		/*简单写法:int[] nums = {1,2,3}
		必须在定义之后立刻初始化,不能先声明后初始化;
		如int[] nums;
		  nums = {1,2,3}
		 此种初始化方式就是错的;
		*/
		//数组基本操作
		System.out.println("数组的长度:"+nums.length);//数组的长度;
		print(nums);
		System.out.println();
		//数组的简易输出,不关心数组的索引时使用
		for (int ele : nums)
		{
			System.out.print(ele+"  ");
		}//此处的ele表示代表数组的所有元素
		System.out.println();
		System.out.println("---------------------");
		int a = nums[0];
		nums[2] = 0;//修改数组值;
		System.out.println(a);
		System.out.println(nums[2]);
		float[] b=new float[2];
		//b=null;空引用,空指针;
		for (int i=0;i<2 ;i++ )
		{
			System.out.println(b[i]);
		}
		System.out.println("---------------------");
		/*常见的错误类型
		  1.null Point Exception(空指针,空引用)
		  2.Arry index Out Of Bounds Exception 索引(下标)越界;
		*/
		//二维数组的定义
		int[][] arr = new int[][]{{1,2,3},{4,5,7},{6,8,9}};
		//输出二维数组
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0;j<arr.length ;j++ )
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		//方法的参数可变举例
		int[] src=new int[]{10,20,30,40,50};//源数组
		int[] dest=new int[]{0,0,0,0,0,0,0,0,0,0,0,0};//目标数组
		int sum = ArrayDemo.getSum(2,src);
		System.out.println(sum);
		System.out.println("---------------------");
		print(dest);
		ArrayDemo.copy(src,0,3,dest,2);
		//从src数组的第0索引位置复制3个元素到从dest数组第2位置索引开始粘贴
		print(dest);
		
	}
	static int getSum(int a,int ... arr)
		//此处可变的参数最多只允许有1个,其他不变的参数不限制
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
			//如果当前index不是最后一个索引,则拼凑", "
			if (index!=arr.length-1)
			{
				ret=ret+", ";
			}
		}
		ret = ret+"]";
		System.out.println(ret);		
	}
	static void copy(int[] src,int srcPos,int length,int[] dest,int destPos)
	//从src数组的第0索引位置复制3个元素到从dest数组第2位置索引开始粘贴
	{
		for(int index=srcPos;index<length+srcPos;index++)
		{
			dest[destPos]=src[index];
			destPos++;
		}
	}
	
}
