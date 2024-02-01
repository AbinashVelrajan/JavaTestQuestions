package p.trycatchfinally.corejav;

public class ExceptionHandling {
	public static void main(String[]args) {
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(4/0);
		} catch(Exception e) {
			System.out.println("Don't divide by zero");
		} finally {
			System.out.println("code executed");
			System.out.println(5);
			System.out.println(6);
		}
		
	
	}

}
