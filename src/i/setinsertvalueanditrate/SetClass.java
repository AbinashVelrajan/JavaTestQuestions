package i.setinsertvalueanditrate;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetClass {
	public static void main(String[] args) {
	
		Set<Object> set = new LinkedHashSet<Object>();
		set.add(20);
		set.add("Appu");
		set.add(98381556321l);
		set.add(false);
		set.add('M');
		
	
		
		for (Object object : set) {
			System.out.println(object);
		}
		
	}

}
