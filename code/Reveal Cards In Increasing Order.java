class Solution {
     public void shift(int[] arr,int k){
            int h=arr[k-1];
            for(int i=k-1;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=h;
        }
    public int[] deckRevealedIncreasing(int[] deck) {
        int k=deck.length;
        Arrays.sort(deck);
       for(int i=0;i<deck.length;i++){
           shift(deck,deck.length);
               if(i>=1 && i<deck.length-1){shift(deck,i+1);}
       }
        return deck;
    }
}
