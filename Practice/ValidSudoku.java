package Practice;

import java.util.HashSet;

public class ValidSudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = {{'.','.','.','.','5','.','.','1','.'},
				{'.','4','.','3','.','.','.','.','.'},
				{'.','.','.','.','.','3','.','.','1'},
				{'8','.','.','.','.','.','.','2','.'},
				{'.','.','2','.','7','.','.','.','.'},
				{'.','1','5','.','.','.','.','.','.'},
				{'.','.','.','.','.','2','.','.','.'},
				{'.','2','.','9','.','.','.','.','.'},
				{'.','.','4','.','.','.','.','.','.'}};
		int ar[] = {0,0,0,3,3,3,6,6,6};
        int ac[] = {0,3,6,0,3,6,0,3,6};        
        
        for(int k=0;k<9;k++) {
            int row = ar[k];
            int col = ac[k];
            HashSet<Character> set = new HashSet<Character>();
            for(;row<ar[k]+3;row++) {
                for(;col<ac[k]+3;col++) {
                    if(board[row][col]!='.') {
                        if(!set.contains(board[row][col])) {
                            set.add(board[row][col]);
                        }
                        else 
                            System.out.println(false);
                    }
                }
            }    
        }
        System.out.println(true);

	}

}
