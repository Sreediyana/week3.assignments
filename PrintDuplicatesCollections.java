package Week3.Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicatesCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input= {11,12,13,14,14,14,15,17,17,17,17};
		List<Integer> ll=new ArrayList<Integer>();
		List<Integer> result=new ArrayList<Integer>();
		Set<Integer> resultset=new TreeSet<Integer>();
		for (int i : input) {
			ll.add(i);
		}
		Collections.sort(ll);
		//11,12,13,14,14,14,15,17,17
		for(int j=0;j<=ll.size()-1;j++)
		{

			if(result.contains(ll.get(j)))
			{

				//if duplicate then adds to set "resultset"
				resultset.add(ll.get(j));

			}			

			else
			{

				//else adds to new list"result"
				result.add(ll.get(j));
			}
			
		}
		System.out.println(resultset);
	}
	



}
