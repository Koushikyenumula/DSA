class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int L = 0;
        int R = numbers.length-1;
        int res[] = new int[2];
        int cs = 0;
        while(L < R){
            cs = numbers[L] + numbers[R];
            if(cs == target){
                res[0] = L+1;
                res[1] = R+1;
                break;
            }
            else if(cs<target){
                L++;
            }
            else if(cs> target){
                R--;
            }
        }
        return res;
    }
}