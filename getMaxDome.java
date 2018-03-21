class getMaxDome 
{
	public static void main(String[] args) 
	{
		int[] nums=new int[]{1,4,7,9}; 
		System.out.println(getMaxDome.getMax(nums));
	}
	static int getMax(int[] nums)
	{
		int max=nums[0];
		for (int i=0;i<nums.length ;i++ )
		{
			if (nums[i]>max)
		{
				max=nums[i];
		}
		}
		return max;
	}
}
