
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

public class CountString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  
		String string = scanner.next();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (map.containsKey(ch)) {
				int count = map.get(ch);
				count = count + 1;
				map.put(ch, count);
			} else {
				map.put(ch, 1);
			}
		}
		Set<Character> keySet = map.keySet();
		for (Character chars : keySet) {
			System.out.println(chars + ":" + map.get(chars));
		}
	}
}