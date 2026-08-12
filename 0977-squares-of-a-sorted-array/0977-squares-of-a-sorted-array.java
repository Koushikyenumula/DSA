class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int l =0;
        int r = len-1;
        int pos = len-1;

        while(l<=r){
            int ls = nums[l]* nums[l];
            int rs = nums[r]* nums[r];
            if(ls> rs){
                res[pos] = ls;
                l++;
            }
            else{
                res[pos]=rs;
                r--;
            }
            pos--;
        }
        return res;
    }
}