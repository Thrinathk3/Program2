package practice;

public class NonRepeatedCharacter {

	public static void printNonRepeatedCharacters(String str) {
		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			boolean isRepeated = false;

			for (int j = 0; j < str.length(); j++) {
				if (i != j && currentChar == str.charAt(j)) {
					isRepeated = true;
					break;
				}
			}

			if (!isRepeated) {
				System.out.print(currentChar + " ");
			}
		}
	}

	public static void main(String[] args) {
		String input = "programming";
		System.out.print("Non-repeated characters: ");
		printNonRepeatedCharacters(input);
	}

}


