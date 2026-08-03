import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UsingMap {
    public static void main(String[] args) {
		//Create a new  HashMap
		Map<Integer, String> map =new HashMap<>();
		
		//put(K key, V value) - Inserts key-value  pairs into map	
		map.put(101 ,"Frank John");
		map.put(102 ,"Henry Clinton");
		map.put(103 ,"Kate Benson");
		map.put(104 ,"Lucy Gerry");
		map.put(105 ,"Johnny Victor");
		map.put(106 ,"Kate Benson");
		map.put(107 ,"Natahan Zoe");

		//get(Object key)  - Returns the value associated with thr key
		String value = map.get( 102);
		System.out.println("Value for 102: "+ value);
		
		//remove(Object key) -Remove the key-value pair for the specified key
		map.remove(106);
		
		//containsKey(Object key) - Check if the map contains the specifies key
		boolean hasApple = map.containsKey(106);
		System.out.println("Contains 106: "+ hasApple);
 
		//KeySet() - REturns a set view of the key contained in the map
		Set<Integer> keys =map.keySet();
		System.out.println("Keys in map: "+ keys);

	}
}