package j.mapinsertvalueanditrateonly;

import java.util.HashMap;

import java.util.Map;


public class MapClass {
	
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(01, "TCS");
		map.put(02, "Infosys");
		map.put(03, "HCL");
		map.put(04, "Cogizent");
		map.put(05, "Accenture");
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry);
		}
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key);
			System.out.println(val);
			
		}
	}
}
