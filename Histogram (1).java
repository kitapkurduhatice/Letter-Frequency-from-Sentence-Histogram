import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		String str = "ben bir garip stringim birden fazla kelimem var tabii bir sürü de harfim var";
		char[] alfabe = "abcçdefgðhýijklmnoöpqrstuüvxyz".toCharArray();
		for (int i = 0; i < str.length(); i++) {
			hashMap.put(str.charAt(i), 0);
		}
		for (int i = 0; i < str.length(); i++) {
			if (!hashMap.containsKey(str.charAt(i))) {
				hashMap.put(str.charAt(i), 1);
			} else {
				int count = (int) hashMap.get(str.charAt(i));
				hashMap.put(str.charAt(i), count + 1);
			}

		}
		Set<Character> treeSet = new TreeSet<Character>(hashMap.keySet());
		for (Character character : alfabe) {
			System.out.print("\n"+character + " : ");
			for (Character character2 : treeSet) {
				if (character2.equals(character)) {
					for (int i = 0; i < hashMap.get(character2); i++) {
						System.out.print("*");
					}
				}
			}
		}
	}
}
