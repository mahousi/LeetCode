public class Solution {

	public int arrayPairSum(int[] nums) {
		int[] exist = new int[20001];
		for (int i = 0; i < nums.length; i++) {
			exist[nums[i] + 10000]++;
		}
		int sum = 0;
		boolean odd = true;
		for (int i = 0; i < exist.length; i++) {
			while (exist[i] > 0) {
				if (odd) {
					sum += i - 10000;
				}
				odd = !odd;
				exist[i]--;
			}
		}
		return sum;
	}
	
}


//second solution
class Solution {
    public int arrayPairSum(int[] nums) {
        quickSortHelp(nums);
        int sum = 0;
        for(int i:nums)System.out.println(i);
        for(int i=0;i<(nums.length+1)/2;i++){
            sum = sum+nums[2*i];
        }
        return sum;
    }
    
    public void quickSortHelp(int[] nums){
        quickSort(nums,0,nums.length-1);
    }
    
    public void quickSort(int[] nums,int low,int high){
        int par = partition(nums,low,high);
        if(low > high) return;
        quickSort(nums,low,par-1);
        quickSort(nums,par+1,high);
    }
    
    public int partition(int[] nums,int low,int high){
        while(low<high){
            while(nums[high]>=nums[low]&&low<high){
                high--;
            }
            swap(nums,low,high);
            while(nums[low]<=nums[high]&&low<high){
                low++;
            }
            swap(nums,low,high);
        }
        return low;
    }
    
    public void swap(int nums[],int low,int high){
        int tmp = nums[low];
        nums[low]= nums[high];
        nums[high]=tmp;
        //nums[low] = nums[low] ^ nums[high];
        //nums[high] = nums[low] ^ nums[high];
        //nums[low] = nums[low] ^ nums[high];
    }
}
