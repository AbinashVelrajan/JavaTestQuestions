package c.methodoverloading.corejava;

public class MethodOverloading {
	public void employee(int id) {
		System.out.println("Employee ID is: "+id);
	}
	public void employee(String name,String address) {
		System.out.println("Employee name: "+name);
		System.out.println("Employee address: "+address);
	}
	public void employee(float salary) {
		System.out.println("Employee Salary is: "+salary);
	}
	public void employee(String email,long phoneno) {
		System.out.println("Employee email is: "+email);
		System.out.println("Employee phoneno is: "+phoneno);
	}
	public void employee(char gender) {
		System.out.println("Employee Gender is: "+gender);
	}
	public static void main(String[] args) {
		
		MethodOverloading m = new MethodOverloading();
		m.employee(012);
		m.employee("Abinash", "Chennai");
		m.employee(300000.0f);
		m.employee("abinash49920@gmail.com", 9363149294l);
		m.employee('M');
		
	}

}
