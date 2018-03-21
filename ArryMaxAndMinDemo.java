class ArryMaxAndMinDemo 
{
	public static void main(String[] args) 
	{
		int[] nums=new int[]{5,8,3,5,2,7,9};
		int t;
		for(int i=0;i<nums.length-1;i++)
		{
			for(int j=i;j<nums.length;j++)
			{
				if(nums[i]>nums[j])//比较排序
				{
					t=nums[i];
					nums[i]=nums[j];
					nums[j]=t;
				}
			}
		}
		for (int j=0;j<nums.length;j++)
		{
			System.out.println(nums[j]);
		}
		System.out.println("-------------------------------");
		int k,te;
		for(int i=0;i<nums.length-1;i++)
		{
			k=i;
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]>nums[j])//计数排序
				{
					k=i;
				}
				if(k!=i)
				{
					te=nums[i];
					nums[i]=nums[j];
					nums[j]=te;
				}
			}
		}
		for (int j=0;j<nums.length;j++)
		{
			System.out.println(nums[j]);
		}
	}
}
