package l.userdefinedexception.corejava;

import java.util.HashMap;
import java.util.Map;

public class Employee {

	public void add() throws EmployeeNotFoundException {
		throw new EmployeeNotFoundException();
		
	}

	public static void main(String[] args) throws EmployeeNotFoundException {
		Employee e = new Employee();
		e.add();
//		Map<Integer, String> map = new HashMap<Integer, String>();

	}
}
