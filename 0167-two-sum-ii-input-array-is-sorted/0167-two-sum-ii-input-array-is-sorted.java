class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int l = 0;
       int r = numbers.length-1;
       int[] res = new int[2];
       int cal = 0;
       while(l<r){
        cal = numbers[l] + numbers[r];
        if(cal == target){
            res[0] = l+1;
            res[1] = r+1;
            return res;
        }
        else if(cal> target){
            r --;
        }
        else if(cal<target){
            l++;
        }
       }
       return res;
    }
}