my solution:

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 1;
        int max = 0;
        int res = 0;
        for(int i = 0;i < n - 1;i++){
            if(nums[i] == nums[i+1]){
                count = count + 1;
            }
            else{
                if(count > max){
                    max = count;
                    res = nums[i];
                }
                count = 1;
            }
        }
        if(count > max){
            res = nums[n-1];
        }
        return res;
    }
}

discuss:
public class Solution {
    public int majorityElement(int[] num) {

        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;
            
        }
        return major;
    }
}
