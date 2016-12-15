package de.schmitz.java.codewars.kyu6.playingwithpassphrases;

public class PlayPass {

	public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public static String playPass(String passPhrase, int number) {
		StringBuilder result = new StringBuilder();
		int position = 0;
		for (char character : passPhrase.toCharArray()) {
			char transformedCharacter = character;
			
			if (Character.isLetter(character)) {
				transformedCharacter = shiftLetter(character, number);
				transformedCharacter = position % 2 == 0
						? Character.toUpperCase(transformedCharacter)
						: Character.toLowerCase(transformedCharacter);
			} else if (Character.isDigit(character)) {
				int digit = Character.digit(character, 10);
				int complementToNine = 9 - digit;
				transformedCharacter = (char) (48 + complementToNine);
			}
			
			result.insert(0, transformedCharacter);
			position++;
		}
		return result.toString();
	}
	
	private static char shiftLetter(char character, int number) {
		int alphabetPosition = ALPHABET.indexOf(character);
		int newAlphabetPosition = (alphabetPosition + number) % ALPHABET.length();
		return ALPHABET.charAt(newAlphabetPosition);
	}
	
}
