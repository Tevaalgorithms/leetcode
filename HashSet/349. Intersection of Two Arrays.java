class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {        
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i < nums1.length; i++) {
            hs.add(nums1[i]);
        }
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int j = 0; j < nums2.length; j++) {
            if(hs.contains(nums2[j])){
                result.add(nums2[j]);
                hs.remove(nums2[j]);
            }
        }
        
        int[] finalResult = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            finalResult[i] = result.get(i);            
        }
        return finalResult;
    }
}
