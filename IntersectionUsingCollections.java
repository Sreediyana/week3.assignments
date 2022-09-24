package Week3.Assignments;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.LinkedHashSet;

public class IntersectionUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,9,8};
		int[] b= {5,6,2,3,9,8};
		//input list1
		List<Integer> lone=new ArrayList<Integer>();
		//input list2
		List<Integer> ltwo=new ArrayList<Integer>();
		//result storage list
		List<Integer> dup=new ArrayList<Integer>();
		//adding from array a to list lone
		for (Integer temp1 : a) {
			lone.add(temp1);

		}
		//adding from array b to list ltwo
		for (Integer temp2 : b) {
			ltwo.add(temp2);

		}


		for(int i=0;i<=lone.size()-1;i++)
		{
			for(int j=0;j<=ltwo.size()-1;j++)
			{

				if(lone.get(i)==ltwo.get(j))
				{

					//if same value on both list,add that number to dup list
					dup.add(lone.get(i));
				}

			}
		}
		System.out.println(dup);




	}




}



