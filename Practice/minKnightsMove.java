package Practice;

import java.util.LinkedList;
import java.util.Queue;

public class minKnightsMove {
	private static class cell {
		int x;
		int y;
		int dis;
		
		public cell(int x, int y, int dis) {
			this.x=x;
			this.y=y;
			this.dis = dis;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=31;
		int cx=1;
		int cy=1;
		int x=30;
		int y=30;
		System.out.println(minSteps(x,y,cx,cy,N));
	}
	
	public static int minSteps(int x, int y, int cx, int cy, int N) {
		int rc[] = new int[] {-1,-2,-2,-1,1,2,2,1};
		int cc[] = new int[] {-2,-1,1,2,-2,-1,1,2};
		boolean[][] vis = new boolean[N+1][N+1];
		Queue<cell> q=new LinkedList<cell>();
		q.offer(new cell(cx,cy,0));
		int nx, ny;
		cell t;
		
		while(!q.isEmpty()) {
			t = q.poll();
			
			if(t.x==x && t.y==y) {
				return t.dis;
			}
			
			for(int i=0;i<8;i++) {
				nx = t.x+rc[i];
				ny = t.y+cc[i];
				
				if(isValid(nx, ny, N) && !vis[nx][ny]) {
					vis[nx][ny]=true;
					q.offer(new cell(nx, ny, t.dis+1));
				}
			}
		}
		return Integer.MIN_VALUE;
	}
	
	public static boolean isValid(int x, int y, int N) {
		return (x>=0 && x<N) && (y>=0 && y<N);
	}

}
