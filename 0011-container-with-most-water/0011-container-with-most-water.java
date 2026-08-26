class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int max =0;
        int area =0;
        if(height.length==2){
            if(height[l]<height[r]){
                return height[l];
            }
            else{
                return height[r];
            }
        }
        while(l<r){
            if(height[l] < height[r]){
                area = height[l] *(r-l);
                l++;
                if(max<area){
                    max = area;
                }
            }
            else if(height[l] > height[r]){
                area = height[r] * (r-l);
                r--;
                if(max<area){
                    max = area;
                }
            }
            else{
                area = height[r] * (r-l);
                if(max<area){
                    max = area;
                    
            }
r--;
        }
        
    }
    return max;
}
}