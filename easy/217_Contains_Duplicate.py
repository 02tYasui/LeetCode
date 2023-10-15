from typing import List

class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        # timeout発生↓
        # size = len(nums)
        # for i in range(size-1):
        #     for j in range(i+1, size):
        #         if nums[i] == nums [j]:
        #             return True

        # return False

        # set関数で重複している数値を削除し配列に入れなおす→元のnumsとset(nums)が異なれば重複あり
        return len(nums) != len(set(nums))