package k.createmapinsertvalueanditerateonlykeys.corejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapClassOnlyIterateOnlyKeys {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(11,"Abi");
		map.put(21,"Abi");
		map.put(33,"Abi");
		map.put(45,"Abi");
		map.put(51,"Abi");
		map.put(68,"Abi");
		map.put(72,"Abi");
		
//		int size = map.size();
//		System.out.println(size);
//		
//		
//		Set<Integer> keySet = map.keySet();
//		System.out.println(keySet);
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			//iterate the key
			System.out.println(entry.getKey());
			//iterate the value
			System.out.println(entry.getValue());
		
	
		
	}
		
	}

}
