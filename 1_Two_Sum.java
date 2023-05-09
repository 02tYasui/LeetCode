/*  comment
 *  特に詰まることなく回答はできた
 *  別海としてHashMapを用いて方法もあるようなのでHashMapの理解は今後の課題か(業務内で使用したことがないため)
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}