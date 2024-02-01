package g.multipleinheritence.corejava;

public class Company implements Courses, Duration {

	public void company() {
		System.out.println("GreensTech");
		System.out.println("===========");
	
	}

	@Override
	public void corejava() {
		System.out.println("CoreJava: 25 Session");
	}

	@Override
	public void springFrameWork() {
		System.out.println("SpringFrameWork: 26 Session");
	}

	@Override
	public void mySQL() {
		System.out.println("MySQL: 20 Session");
	}

	@Override
	public void htmlCss() {
		System.out.println("HTML,CSS: 18 Session");
	}

	@Override
	public void javaScript() {
		System.out.println("JavaScript: 15 Session");
	}

	@Override
	public void frontend() {
		System.out.println("HTML,CSS,JavaScript,React Js");

	}

	@Override
	public void backend() {
		System.out.println("Core Java,SpringFramWork,Microservices");

	}

	@Override
	public void database() {
		System.out.println("MySQL");
	}
public static void main(String[] args) {
	Company c =new Company();
	c.company();
	c.corejava();
	c.springFrameWork();
	c.mySQL();
	c.htmlCss();
	c.javaScript();
	c.frontend();
	c.backend();
	c.database();
}
}
