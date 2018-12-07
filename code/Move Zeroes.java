1ms:
class Solution {
   public void moveZeroes(int[] nums) {
        int indexToPut = 0;
        while(indexToPut < nums.length && nums[indexToPut]!=0) indexToPut++;
        
        for(int i = indexToPut+1 ; i < nums.length ; i++){
            if(nums[i]!=0){
                swapWithZero(indexToPut,i,nums);
                indexToPut++;
            }
        }
        
    }
    
    private void swapWithZero(int firstIndex, int secondIndex, int[] nums){
        nums[firstIndex] = nums[secondIndex];
        nums[secondIndex] = 0;
    }
}

my solution:
class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;int count2 = 0;
        for(int i = nums.length - 1;i >= 0;i--){
            if(nums[i] == 0){
                count++;
                continue;
            }
            else{
                break;
            }
        }
        for(int i = nums.length - 1 -count;i >= 0;i--){
            if(nums[i] != 0){
                count2++;
                continue;
            }
            else{
                exch(nums,i,count2);
            }
        }
    }
    public void exch(int[] nums,int j,int length){
        int tmp = nums[j];
        for(int k = 0;k<length;k++){
            nums[j+k] = nums[j+k+1];
    }
    nums[j+length] = tmp;
    }
}
