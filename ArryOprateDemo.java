class ArryOprateDemo
{
	//获取数组最大元素
	static int getMax(int[] nums)
	{
		int max = nums[0];//假设第一个元素是最大值
		for(int index = 1;index<nums.length;index++)
		{
			if(nums[index]>max)
			{
				max=nums[index];
			}
		}
		return max;
	}
	//获取数组最小元素
	static int getMin(int[] nums)
	{
		int min = nums[0];//假设第一个元素是最小值
		for(int index = 1;index<nums.length;index++)
		{
			if(nums[index]<min)
			{
				min=nums[index];
			}
		}
		return min;
	}
	public static void main(String[] args) 
	{
		int[] nums=new int[]{-1,9,4};
		int max = ArryOprateDemo.getMax(nums);
		System.out.println(max);
		System.out.println(ArryOprateDemo.getMin(nums));
		String[] arr = {"A","B","C","D","E"};
		ArryOprateDemo.print(arr);
	}
	static void print(String[] arr)
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
}

