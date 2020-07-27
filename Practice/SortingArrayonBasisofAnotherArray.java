package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class SortingArrayonBasisofAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ModelStock> s = new ArrayList<ModelStock>();
		s.add(new ModelStock(10,20));
		s.add(new ModelStock(30,10));
		s.add(new ModelStock(90,80));
		s.add(new ModelStock(80,40));
		s.add(new ModelStock(60,50));
		Collections.sort(s, new Comparator<ModelStock>() {
			@Override
			public int compare(ModelStock o1, ModelStock o2) {
				// TODO Auto-generated method stub
				if(o1.sell < o2.sell) {
					return 1;
				}
				return -1;
			}
		});
	
		for(int i=0;i<s.size();i++)
		{
			System.out.println(s.get(i).buy + " " + s.get(i).sell);
			
		}
		//System.out.println();
	}

	
}
