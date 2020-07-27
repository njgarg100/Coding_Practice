package Practice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = new int[][] {{1,2,1,1,2,1,1}};
		int res = orangesRotting(grid);
		System.out.println(res + "");
	}
	
	static class location {
        int r;
        int c;
        
        public location(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
    static int ROW, COL;
    public static int orangesRotting(int[][] grid) {
        ROW = grid.length;
        COL = grid[0].length;
        int time = rottingUtil(grid);
        for(int i=0;i<ROW;i++) {
            for(int j=0;j<COL;j++) {
                if(grid[i][j]==1)
                    return -1;
            }
        }
        return time;
    }
    
    public static int rottingUtil(int[][] grid) {
        boolean vis[][] = new boolean[ROW][COL];
        int sum=0;
        Queue<location> q = new LinkedList<location>();
        for(int i=0;i<ROW;i++) {
            for(int j=0;j<COL;j++) {
                if(grid[i][j]==2) {     // && !vis[i][j]) {
                    //sum += BFS(grid,i,j,vis);
                    location l = new location(i,j);
                    vis[i][j]=true;
                    q.offer(l);
                }
            }
        }
        if(q.isEmpty()) return 0;
        q.offer(null);
        sum = BFS(grid,vis,q);
        return sum;
    }
    
    public static int BFS(int[][] grid, boolean[][] vis, Queue<location> q) {
        
        int count = 0;
        int rc[] = new int[] {-1,0,0,1};
        int cc[] = new int[] {0,-1,1,0};
        int flag=0;
        while(!q.isEmpty()) {
            
            location temp = q.poll();
            if(temp!=null) {
                for(int i=0;i<4;i++) {
                    if(isSafe(grid, temp.r+rc[i], temp.c+cc[i], vis)) {
                        vis[temp.r+rc[i]][temp.c+cc[i]]=true;
                        grid[temp.r+rc[i]][temp.c+cc[i]]=2;
                        location in = new location(temp.r+rc[i], temp.c+cc[i]);
                        q.offer(in);
                        flag=1;
                    }
                }
            }
            else {
                if(flag==1) count++;
                flag=0;
                if(!q.isEmpty()) q.offer(null);
            }
        }
        return count;
    }
    
    public static boolean isSafe(int[][] grid, int row, int col, boolean[][] vis) {
        return row>=0 && row<ROW && col>=0 && col<COL && (grid[row][col]==1 && !vis[row][col]);
    }

}
