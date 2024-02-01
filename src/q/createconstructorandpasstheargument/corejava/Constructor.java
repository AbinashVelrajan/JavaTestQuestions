package q.createconstructorandpasstheargument.corejava;

public class Constructor {

	public Constructor() {
		this(90);
		System.out.println("====SAMPLE====");
	}

	public Constructor(int id) {
		this("Abi");
		System.out.println(101);
	}

	public Constructor(String name) {
		this('h');
		System.out.println("Abi");
	}

	public Constructor(long phone) {
		System.out.println(9876534567l);
	}

	public Constructor(char ch) {
		this(129792719879l);
		System.out.println("char");
	}

	public static void main(String[] args) {
		Constructor c = new Constructor();
	}
}