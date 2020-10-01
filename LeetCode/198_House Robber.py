class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums)==0:
            return 0
        elif len(nums) == 1:
            return nums[0]
        elif len(nums) == 2:
            return max(nums)
        first = nums[0]
        second = max(first,nums[1])
        
        for i in range(2,len(nums)):
            c = max(second,first+nums[i])
            first = second
            second = c
            
        return c