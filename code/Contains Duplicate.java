1. Slow solution in 1 line:
Streams has method distinct which returns a stream consisting of the distinct elements of this stream. We can compare size of stream of distinct with original array.

public boolean containsDuplicate(int[] nums) {
	return IntStream.of(nums).distinct().count() < nums.length;                
}
2. Solution with Set

public boolean containsDuplicate(int[] nums) {
	Set<Integer> set = new HashSet<>();
	for (int i=0; i<nums.length;i++) {
		if (!set.add(nums[i])) return true;
	}
	return false;
}
3. Fast solution(5 ms, with sorting):
If the array is ordered, duplicates would be one by one, so we can compare nums[i] with nums[i+1]

public boolean containsDuplicate(int[] nums) {
	Arrays.sort(nums);
	for (int i=0; i<nums.length-1;i++) {
		if (nums[i] == nums[i+1]) return true;
	}
	return false;
}
