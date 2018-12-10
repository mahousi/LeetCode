discuss:
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int ones = 0;
        //Starting from one but last, as last one is always 0.
        for (int i = bits.length - 2; i >= 0 && bits[i] != 0 ; i--) { 
            ones++;
        }
        if (ones % 2 > 0) return false; 
        return true;
    }
}

my solution:
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        int count = 1;
        if(bits.length <= 1) return true;
        if(bits[n-2] == 0) return true;
        for(int i = n - 3;i >= 0;i--){
            if(count % 2 == 1){
                if(bits[i] == 0){
                    return false;
                }
                count++;
            }
            else{
                if(bits[i] == 0){
                    return true;
                }
                count++;
            }
        }
        if(count % 2 == 0) return true;
        else return false;
    }
}
