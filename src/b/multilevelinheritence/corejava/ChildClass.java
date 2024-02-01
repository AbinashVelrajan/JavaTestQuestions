package b.multilevelinheritence.corejava;

public class ChildClass extends ParentClass2 {
	public void itCompanies() {
		System.out.println("IT COMPANIES");
		System.out.println("=============");
	}

	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();
		childClass.itCompanies();
		childClass.tcs();
		childClass.infi();
		childClass.cts();
		childClass.hcl();
		childClass.techMahindra();
		childClass.wipro();
		childClass.tataelxsi();

	}

}
