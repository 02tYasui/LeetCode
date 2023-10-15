from typing import List

class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        size = len(nums)
        for i in range(size-1):
            for j in range(i+1, size):
                if nums[i] == nums [j]:
                    return True

        return False