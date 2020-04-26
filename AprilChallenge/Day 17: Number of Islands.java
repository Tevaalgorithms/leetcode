class Solution {
    public int numIslands(char[][] grid) {
        int noOfIslands = 0;
        for(int row = 0; row < grid.length; row++) {
            for(int col = 0; col < grid[row].length; col++) {
                if(grid[row][col] == '1') {
                    noOfIslands += dfsHelper(row, col, grid);
                }
            }
        }
        return noOfIslands;        
    }
    
    private int dfsHelper(int row, int col, char[][] grid) {
        // First I need to check whether the given row and col is in the valid boundary
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[row].length) {
            return 0;
        }
        
        // this is not a valid cell / this is water surface
        if(grid[row][col] == '0') {
            return 0;
        }
        
        // Don't want to count the same cell over and over again
        if(grid[row][col] == '1') {
           grid[row][col] = '0'; 
        }
        
        dfsHelper(row + 1, col, grid);
        
        dfsHelper(row - 1, col, grid);
        
        dfsHelper(row, col + 1, grid);
        
        dfsHelper(row, col - 1, grid);
        
        return 1;
    }
}
