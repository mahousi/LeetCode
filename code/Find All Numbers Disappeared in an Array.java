class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> numsList = new ArrayList<Integer>();
        Arrays.sort(nums);
        if(nums.length==0){return numsList;}
        int count = 1;
        for(int i = 0; i< nums.length;i++){
            if(nums[i] == count){
                count++;
                continue;
            }
            else{
                if(nums[i]-count>0){
                    numsList.add(count++);
                    i--;
                }
                else{
                    continue;
                }
            }
        }
        for(int i = nums[nums.length-1]+1;i<=nums.length;i++){
            numsList.add(i);
        }
        return numsList;
    }
}
