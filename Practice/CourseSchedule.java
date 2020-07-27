package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
//Course Schedule - ***************Not Giving Output**********
public class CourseSchedule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num = {{1,0},{0,1}};
		System.out.println(canFinish(2, num));
	}
	
	public static boolean canFinish(int numCourses, int[][] prerequisites) {
        if(isCycle(prerequisites, prerequisites.length, numCourses)==1)
            return false;
        List<List<Integer>> adj = createGraph(prerequisites, numCourses);
        boolean possible = topologicalSort(adj, numCourses);
        return possible;
    }
    private static List<List<Integer>> createGraph(int[][] courses, int numCourses) {
        List<List<Integer>> res = new ArrayList();
        for(int j=0;j<numCourses;j++) {
        	res.add(new ArrayList<Integer>());
        }
        for(int i=0;i<courses.length;i++) {
            if(res.get(courses[i][1])==null) {
                res.add(new ArrayList<Integer>());
                res.get(courses[i][1]).add(courses[i][0]);
            }
            else
                res.get(courses[i][1]).add(courses[i][0]);
        }
        return res;
    }
    
    private static boolean topologicalSort(List<List<Integer>> adj, int numCourses) {
        Stack<Integer> s = new Stack<Integer>();
        boolean[] vis = new boolean[numCourses];
        
        for(int i=0;i<numCourses;i++) {
            if(!vis[i]) {
                topoUtil(s, adj, vis, i);
            }
        }
        
        if(s.size()==numCourses)
            return true;
        
        return false;
        
    }
    
    private static void topoUtil(Stack<Integer> s, List<List<Integer>> adj, boolean[] vis, int course) {
        vis[course] = true;
        Integer i;
        Iterator<Integer> it = adj.get(course).iterator();
        while(it.hasNext()) {
            i = it.next();
            if(!vis[i])
                topoUtil(s, adj, vis, i);
        }
        s.push(new Integer(course));
    }
    
    private static int isCycle(int[][] courses, int edge, int vert) {
        int parent[] = new int[vert];
        
        for(int i=0;i<vert;i++) {
            parent[i] = -1;
        }
        for(int i=0;i<edge;i++) {
            int x = find(parent, courses[i][0]);
            int y = find(parent, courses[i][1]);
            
            if(x==y) return 0;
            
            union(parent, x, y);
        }
        System.out.println(1);
        return 1;
    }
    
    private static int find(int[] parent, int i) {
        if(parent[i]==-1) {
            return i;
        }
        return find(parent, parent[i]);
    }
    
    private static void union(int[] parent, int x, int y) {
        int px = find(parent, x);
        int py = find(parent, y);
        parent[px]=py;
    }
    
}

