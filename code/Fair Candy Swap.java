class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0,sumB = 0;
        for(int i = 0;i < A.length;i++){
            sumA = sumA + A[i];
        }
        for(int i = 0;i < B.length;i++){
            sumB = sumB + B[i];
        }
        HashSet<Integer> S = new HashSet<>();
        for(int a :A) S.add(a);
            int dir = (sumA - sumB)/2;
            for(int b:B){
                if(S.contains(b+dir)) return new int[]{b+dir,b};
            }
            
        return new int[0];
    }
}
