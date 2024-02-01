package n.userdefinedsetinsertvalueanditrate.corejava;

import java.util.HashSet;
import java.util.Set;

public class UserDefinedSet2 {
	public static void main(String[]args) {
	Set<UserDefinedSet> set = new HashSet<UserDefinedSet>();
	
	UserDefinedSet us = new UserDefinedSet();
	us.setEmpId(102);
	us.setEmpName("Abdul");
	us.setEmpPhone(9872234231l);
	us.setEmpEmail("something234@gmail.com");
	
	set.add(us);
	
	for (UserDefinedSet user : set) {
		System.out.println(user.getEmpId());
		System.out.println(user.getEmpName());
		System.out.println(user.getEmpPhone());
		System.out.println(user.getEmpEmail());
	}
	}

}
