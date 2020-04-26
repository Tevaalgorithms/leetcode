class Solution {
    //  [1,2,2,3,3]
    public int countElements(int[] arr) {
        int result = 0;       
        HashSet<Integer> hs = new HashSet<>();        
        for(int i = 0; i < arr.length; i++) {          
           hs.add(arr[i]);          
        }
        for(int j = 0; j < arr.length; j++) {
            if(hs.contains(arr[j] + 1))
            {
                result++;
            }
        }
        return result;
    }
}
