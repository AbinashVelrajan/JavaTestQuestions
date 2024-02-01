package a.singleinheritence.corejava;

public class ChildClass extends ParentClass{

	public void relaince() {
		System.out.println("Mukesh Ambani");
	}

	public void meta() {
		System.out.println("Mark Zuckerberg");
	}
	
	public static void main(String[] args) {
		ChildClass childclass = new ChildClass();
		childclass.tata();
		childclass.tesla();
		childclass.relaince();
		childclass.meta();
	}

}
