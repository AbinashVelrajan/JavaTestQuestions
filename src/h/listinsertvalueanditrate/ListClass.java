package h.listinsertvalueanditrate;

import java.util.ArrayList;

import java.util.List;

public class ListClass {
	public static void main(String[] args) {
		
		
//		List<Integer> li = Arrays.asList(10, 20, 30, 40);
	
	List<Object> li = new ArrayList<Object>();
	li.add(10);
	li.add("Abinash");
	li.add(true);
	li.add(9876509);
	li.add('M');
	
	int size = li.size();
	System.out.println(size);
	
	for (Object integer : li) {
		System.out.println(integer);
	}
	}	
}
