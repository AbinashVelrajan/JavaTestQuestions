package m.userdefindedlistinsertvalueanditrate.corejava;

import java.util.ArrayList;
import java.util.List;

public class UserDefinedList2 {

	public static void main(String[] args) {
		List<UserDefinedList> li = new ArrayList<UserDefinedList>();

		UserDefinedList us = new UserDefinedList();
		us.setEmpId(101);
		us.setEmpName("Abinash");
		us.setEmpPhone(9363149294l);
		us.setEmail("abinash49920@gmail.com");

		li.add(us);
		
		
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i).getEmpId());
			System.out.println(li.get(i).getEmpName());
			System.out.println(li.get(i).getEmpPhone());
			System.out.println(li.get(i).getEmail());
			
			
			for (UserDefinedList userDefinedList : li) {
				System.out.println(userDefinedList.getEmpId());
			}
		}
	}
	

}
