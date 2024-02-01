package l.userdefinedexception.corejava;

public class EmployeeNotFoundException extends Exception{
	
	@Override
	public String getMessage() {
		String msg = "Terminal Not Found";
		return msg;
	}

}
