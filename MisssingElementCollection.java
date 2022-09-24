package Week3.Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MisssingElementCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input= {1,2,3,4,7,6,8};
		List<Integer> lobj=new ArrayList<Integer>();
		for (int temp : input) {
			lobj.add(temp);
		}
		Collections.sort(lobj);
		//1,2,3,4,6,7,8
		//System.out.println(lobj.get(0));
		//System.out.println(lobj.get(1));
		int storevar=lobj.get(0);//1 is stored

		for(int i=1;i<=lobj.size()-1;i++)
		{
			int temp1=lobj.get(i)-1;//logic is 2nd value-1=1st vaue,so we store 2nd value-1 in temp variable
			//get(1)-1-->2-1=1(sv=1) equal
			//get(2)-1=3-1=2(sv=2)equal
			//get(3)-1=4-1=3(sv=3)equal
			//get(4)-1=6-1=5(sv=4)not equal

			if(storevar==temp1)
			{
				//stroevar=2,3,4,5

			}
			else
			{
				System.out.println(temp1);
				break;
			}
			storevar++;
		}

	}

}


