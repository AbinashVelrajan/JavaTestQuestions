package e.interfacecode.corejava;

public class ImplementationClass implements InterfaceCode {

	@Override
	public void empName() {
		System.out.println("Abinash");
	}

	@Override
	public void empAddress() {
		System.out.println("Chennai");
	}

	@Override
	public void empEmail() {
		System.out.println("abinash49920@gmail.com");
	}
public static void main(String[] args) {
	ImplementationClass imp = new ImplementationClass();
	imp.empName();
	imp.empAddress();
	imp.empEmail();
}
}
