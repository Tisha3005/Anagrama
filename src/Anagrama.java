import java.util.Arrays;

public class Anagrama {

	public static void main(String[] args) {
		System.out.println("Eh um anagrama? " + isAnagram("thais", "tisha"));
		
	}

	public static boolean isAnagram(String stringA, String stringB) {

		if (stringA.trim().length() != stringB.trim().length())
			return false;
		if (stringA == null || stringB == null)
			return false;

		stringA = stringA.toUpperCase();
		stringB = stringB.toUpperCase();
		System.out.println(stringA);
		System.out.println(stringB);
		System.out.println();

		char[] charArrayA = stringA.toCharArray();
		char[] charArrayB = stringB.toCharArray();

		Arrays.sort(charArrayA);
		Arrays.sort(charArrayB);
		
		System.out.println(charArrayA);
		System.out.println(charArrayB);
		System.out.println();
		System.out.println(Arrays.toString(charArrayA));
		System.out.println(Arrays.toString(charArrayB));
		System.out.println();

		if (Arrays.equals(charArrayA, charArrayB)) {
			return true;
		} else {
			return false;
		}
		
		
	}

}
