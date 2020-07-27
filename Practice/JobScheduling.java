package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JobScheduling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Job> a = new ArrayList<Job>();
		Job b1 = new Job('a', 2, 100);
		Job b2 = new Job('b', 1, 19);
		Job b3 = new Job('c', 2, 27);
		Job b4 = new Job('d', 1, 27);
		Job b5 = new Job('e', 3, 15);
		a.add(b1);
		a.add(b2);
		a.add(b3);
		a.add(b4);
		a.add(b5);
		System.out.println(a.size());
		printjobscheduling(a,a.size());
	}

	private static void printjobscheduling(List<Job> a, int size) {
		// TODO Auto-generated method stub
		Collections.sort(a, new Comparator<Job>() {

			@Override
			public int compare(Job o1, Job o2) {
				// TODO Auto-generated method stub
				if(o1.profit <= o2.profit)
					return 1;
				return -1;
			}
			
		});
		boolean slot[] = new boolean[size];
		char result[] = new char[size];
		for(int i=0;i<size;i++) {
			for(int j=Math.min(size, a.get(i).dead)-1;j>=0;j--) {
				if(slot[j]==false) {
					slot[j]=true;
					result[j]=a.get(i).jobid;
					break;
				}
			}
		}

		for(int i=0;i<size;i++) {
			if(slot[i])
				System.out.println(result[i]);
			//System.out.println(slot[i]);
		}
		
	}

}
