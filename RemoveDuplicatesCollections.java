package Week3.Assignments;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text="We java java learn java basics learn as a part of java";

String[] sepword=text.split(" ");//stores seperate words

Set<String> ll=new LinkedHashSet<String>();

for(int i=0;i<=sepword.length-1;i++)	
{
	//if list contains same word
	//if(ll.contains(sepword[i]))
	//{
	//	ll.add(" ");
	//}
	//else
	//{
		//if list doesnt contain the same word
	//set doesnt accept duplicates
	ll.add(sepword[i]);
//	}
	
	
	
	
}System.out.print(ll);
//System.out.println(ll);
	}

}
