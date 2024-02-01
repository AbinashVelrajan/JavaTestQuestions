package d.methodoverridding.corejava;

public class SBI extends HdfcBank{
	
	@Override
	public void homeloaninterest() {
		System.out.println("10%");
	}
	@Override
	public void personaloaninterest() {
		System.out.println("11%");
	}
	@Override
	public void fdinterest() {
		System.out.println("12%");
	}
	public static void main(String[] args) {
		SBI sbi = new SBI();
		sbi.homeloaninterest();
		sbi.personaloaninterest();
		sbi.fdinterest();
	}
}
