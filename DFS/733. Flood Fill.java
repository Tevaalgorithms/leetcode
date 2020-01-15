class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image == null || image.length == 0) {
            return null;
        }
        
        int oldColor = image[sr][sc];
        
        if(oldColor != newColor) {
           dfs(image, newColor, oldColor, sr, sc);
        }       
        return image;
    }
    
    private void dfs(int[][] image, int newColor, int oldColor, int src, int sc) {
        if(src < 0 || src >= image.length || sc < 0 || sc >= image[src].length) {
            return;
        }
        
        if(image[src][sc] != oldColor){
            return;
        }
        
        image[src][sc] = newColor;
        
        dfs(image, newColor, oldColor, src + 1, sc);
        
        dfs(image, newColor, oldColor, src - 1, sc);
        
        dfs(image, newColor, oldColor, src, sc + 1);
        
        dfs(image, newColor, oldColor, src, sc -1);
     
    }
}
