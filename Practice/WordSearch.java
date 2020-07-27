package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordSearch {
	static int ROW, COL;
	public static void main(String[] args) {
		char[][] board = {{'A','B','C','E'},
				 		  {'S','F','E','S'},
				          {'A','D','E','E'}};
		String word="ABCESEEEFS";
		System.out.println(exist(board, word));
	}
	
	public static boolean exist(char[][] board, String word) {
        if(word.length()==0) return false;
        ROW=board.length;
        COL = board[0].length;
        
        int i=0;
        
        while(i<ROW) {
        	int j=0;
            while(j<COL) {
                if(board[i][j]==word.charAt(0)) {
                    boolean[][] vis = new boolean[ROW][COL];
                    boolean res =  dfs(board, vis, word.substring(1), i, j);
                    if(res==true) return res;
                }
                j++;
            }
            i++;
        }
        return false;
    }
    
    public static boolean dfs(char[][] board, boolean[][] vis, String word, int row, int col) {
        if(word.length()==0) return true;
        vis[row][col] = true;
        int rc[] = {-1, 0, 0, 1};
        int cc[] = {0, -1, 1, 0};
        char letter = word.charAt(0);
        for(int k=0;k<4;k++) {
            if(isValid(row+rc[k], col+cc[k], letter, board, vis)) {
                if(dfs(board, vis, word.substring(1), row+rc[k], col+cc[k]))
                    return true;
                else {
                	vis[row+rc[k]][col+cc[k]]=false;
                	continue;
                }
                    
            }
        }
        return false;
    }
    
    public static boolean isValid(int row, int col, char letter, char[][] board, boolean[][] vis) {
        return (row>=0 && row<ROW) && (col>=0 && col<COL) && (board[row][col]==letter && !vis[row][col]);
    }
}
