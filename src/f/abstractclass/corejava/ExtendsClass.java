package f.abstractclass.corejava;

public class ExtendsClass extends AbstractClass {

	@Override
	void company() {
		System.out.println("TCS");

	}

	@Override
	void empname() {
		System.out.println("Abinash");
	}
	
	public static void main(String[] args) {
		ExtendsClass emp = new ExtendsClass();
		emp.empID();
		emp.company();
		emp.empname();
	}

}
