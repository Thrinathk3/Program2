package practice;

public class RepeatedCharacter {

	public static void main(String[] args) {
		String input = "programming";
		printDuplicateCharacters(input);
	}
	
	public static void printDuplicateCharacters(String str) {
        char[] characters = str.toCharArray();
        
        for (int i = 0; i < characters.length; i++) {
            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    System.out.println(characters[i]);
                    break; // Print the character once and move to the next unique character
                }
            }
        }
    }


}
