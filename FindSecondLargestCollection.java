package Week3.Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] input= {3,2,11,4,6,7};

List<Integer> listobj=new ArrayList<Integer>();

for (Integer temp : input) {
	listobj.add(temp);
	
}
Collections.sort(listobj);
//listobj.size()-6-->6-2=4
//index starts from 0 and so 4th value is 6
System.out.println(listobj.get(listobj.size()-2));
	}

}
