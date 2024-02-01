package o.userdefinedmapinsertvalue.corejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FinalOutput {
	public static void main(String[]args) {
	
	Map<UserDefinedMap, UserDefinedMap2> map = new HashMap<UserDefinedMap, UserDefinedMap2>();
	
	UserDefinedMap us1 = new UserDefinedMap();
	us1.setEmpid(100);
    us1.setEmpName("Abi");
    us1.setEmail("abinash49920@gmail.com");
    us1.setSalary(9876523423l);
    
    UserDefinedMap2 us2 = new UserDefinedMap2();
    us2.setEmpid(101);
    us2.setEmpName("nash");
    us2.setEmail("hash32@gmail.com");
    us2.setSalary(725656582l);
    
    map.put(us1, us2);
    
    Set<Entry<UserDefinedMap, UserDefinedMap2>> entrySet = map.entrySet();
   for (Entry<UserDefinedMap, UserDefinedMap2> entry : entrySet) {
	   System.out.println(entry.getKey().getEmpid());
	   System.out.println(entry.getKey().getEmpName());
	   System.out.println(entry.getValue().getEmpid());
	   System.out.println(entry.getValue().getEmpName());
	   
	
}
		
	
    
    for (Map.Entry<UserDefinedMap, UserDefinedMap2> entry : map.entrySet()) {
		UserDefinedMap key = entry.getKey();
		UserDefinedMap2 val = entry.getValue();
		
		
		System.out.println(key.getEmpid());
		
		System.out.println(val.getEmpid());
		
	}
	}
}
