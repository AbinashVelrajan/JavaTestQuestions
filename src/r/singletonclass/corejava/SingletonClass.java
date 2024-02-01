package r.singletonclass.corejava;import java.security.Identity;

public class SingletonClass {
	
	static SingletonClass e;
	private SingletonClass() {
	}
	
	public static SingletonClass getid() {
		if (e==null) {
			return e;
		}
		return e;
	}
public static void main(String[] args) {
	SingletonClass e = getid();
	System.out.println(System.identityHashCode(e));
}
}
