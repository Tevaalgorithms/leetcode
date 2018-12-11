/*
Question : Two Sum  
*/
class TwoSum 
{
    public int[] twoSum(int[] nums, int target) 
    {
        Map<Integer, Integer> m = new HashMap<>();
        for(int i =0; i < nums.length; i++)
        {
            m.put(nums[i], i);
        }
        for(int j = 0; j < nums.length; j++)
        {
            int remainder = target - nums[j];
            if(m.containsKey(remainder) && m.get(remainder) != j)
            {
                return new int[]{j, m.get(remainder)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
