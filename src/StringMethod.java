
public class StringMethod {

	public static void main(String[] args) {

		letterize("Java");
		camelCase("desert forest world ");
	}

	public static String capitalize(String word) {

		return (word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase());

	}

	public static int wheresWaldo(String phrase) {

		return (phrase.indexOf("Waldo"));
	}

	public static String firstThingsFirst(String a, String b) {

		int compareString = a.compareToIgnoreCase(b);

		if (compareString < 0) {

			return (a + " " + b);

		} else if (compareString > 0) {

			return (b + " " + a);

		} else {

			return ("Both strings are the same");
		}

	}

	public static String reverse(String s) {

		String tempstring = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			tempstring += s.charAt(i);

		}
		return tempstring;
	}

	public static String soLong(String a, String b) {

		if (a.length() == b.length()) {

			return (a + " " + b);

		} else if (a.length() > b.length()) {

			return (a);
		} else {

			return (b);
		}
	}

	public static String afterMath(String phrase) {

		int n = phrase.indexOf("math");

		if (n >= 0) {

			return (phrase.substring(n));
		} else {

			return ("dud");
		}
	}

	public static void letterize(String word) {

		for (int i = 0; i < word.length(); i++) {

			System.out.println(word.charAt(i));
		}
	}

	public static void camelCase(String phrase) {

		phrase = phrase.trim().toLowerCase();

		if (phrase.indexOf(" ") == -1) {

			System.out.println(phrase);
		} else {

			String result = "";

			for (int i = 0; i < phrase.length(); i++) {

				if (!phrase.substring(i, i + 1).equals(" ")) {

					result = result + phrase.substring(i, i + 1);

				} else {
					i++;
					result = result + phrase.substring(i, i + 1).toUpperCase();
				}

			}
			System.out.println(result);
		}

	}
}
