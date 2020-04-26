/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int x, int y) {}
 *     public List<Integer> dimensions {}
 * };
 */

class Solution {
   
    
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {   
        
        List<Integer> dimension = binaryMatrix.dimensions();
        
        int row = dimension.get(0);
        int col = dimension.get(1);
        
        int i = 0;
        int j = col - 1;
        
        while(i < row && j >= 0) {
            if(binaryMatrix.get(i,j) == 0) {
                i++;
            } else {
                j--;
            }
        }
        
        if(j == col - 1) {
            return -1;
        } 
        
        return j + 1;
        
    }
}
