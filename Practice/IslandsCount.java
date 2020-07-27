package Practice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class IslandsCount {
	static int ROW=0, COL=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char M[][] = new char[][] { { '1', '1', '0', '0' }, 
										{ '0', '1', '0', '0' }, 
										{ '1', '0', '0', '1' }, 
										{ '0', '0', '0', '0' }, 
										{ '1', '0', '1', '0' } };
			int count = numIslands(M);
			System.out.println(count + " ");
			
	}
	
	    public static int numIslands(char[][] grid) {
	        ROW = grid.length;
	        COL = grid[0].length;
	        return countIslands(grid);
	    }
	    
	    public static int countIslands(char[][] grid) {
	        boolean[][] vis = new boolean[ROW][COL];
	        
	        int count=0;
	        
	        for(int i=0;i<ROW;i++) {
	            for(int j=0;j<COL;j++) {
	                if(grid[i][j]=='1' && !vis[i][j]) {
	                    DFS(grid, i, j, vis);
	                    count++;
	                }
	            }
	        }
	        return count;
	    }
	    
	    public static void DFS(char[][] grid, int row, int col, boolean[][] visited) {
	        visited[row][col] = true;
	        
	        int rc[] = new int[] {-1,0,0,1};
	        int cc[] = new int[] {0,-1,1,0};
	        
	        for(int i=0;i<4;i++) {
	            if(isSafe(row+rc[i], col+cc[i], grid, visited))
	                DFS(grid, row+rc[i], col+cc[i], visited);
	        }
	    }
	    public static boolean isSafe(int row, int col, char[][] grid, boolean[][] vis) {
	        return (row>=0) && (row<ROW) && (col>=0) && (col<COL) && (grid[row][col]==1 && !vis[row][col]);
	    }
	

}
