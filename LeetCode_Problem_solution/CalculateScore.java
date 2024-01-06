package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class CalculateScore {
   
	static int calc(List<Integer>list) {
		int k=0;
		int j=1;
		int participant=0;
	  for(int i=0;i<list.size();i++) {
		  for(j=j+i;j<list.size();j++) {
			if(list.get(i)>list.get(j)) {
				k++;
				participant=list.get(i);
			}
		}  
	  }
	  if(k==2)
		  return participant;
	  else
		  return 0;
    }
	//3,2,1,5,4,7,6
	static void swap(List<Integer>list) {
		for(int i=0;i<list.size();i++) {
			//for(int j=i+1;j<)
		}
	}
	
	
	public static void main(String ar[]) {
	List<Integer>list=new ArrayList<Integer>();
	list.add(3);
	list.add(1);
	list.add(2);
	list.add(5);
	list.add(4);
	int result=calc(list);
	System.out.println(result);
	}
}
