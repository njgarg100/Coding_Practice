package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Learning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<matrix.length;i++) {
            for(int j=i;j<matrix[0].length;j++) {
                swap(matrix,i,j);
            }
        }
        int te;
        for(int i=0;i<matrix.length;i++) {
            for(int j=matrix[0].length-1,k=0;j>=0;j--,k++) {
                te=matrix[i][j];
                matrix[i][j]=matrix[i][k];
                matrix[i][k] = te;
            }
        }
        
        for(int i=0;i<matrix.length;i++) {
        	for(int j=0;j<matrix[0].length;j++) {
        		System.out.print(matrix[i][j]);
        	}
        	System.out.println();
        }
    }
    public static void swap(int[][] temp, int i, int j) {
        int t;
        t = temp[i][j];
        temp[i][j] = temp[j][i];
        temp[j][i] = t;
    }
		
		/*
		 * Map<String, Integer> map = new HashMap<>(); map.put("Anuj", 0); map.put("is",
		 * 2); map.put("talk", 3); Collection<Integer> l = map.values();
		 * System.out.println((l.stream().filter(x->x>0).collect(Collectors.toList())).
		 * isEmpty());
		 */

	}


