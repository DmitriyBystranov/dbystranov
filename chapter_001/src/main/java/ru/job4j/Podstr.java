package ru.job4j;

public class Podstr {
	public static boolean contains(String originString, String testString) {
		boolean verify = true;
		int counter = 0;
		int counterJ = 0;
		String[] massCharacterOfOriginString = originString.split("");
		String[] massCharacterOfTestString = testString.split("");
		for(int i = 0; i < massCharacterOfOriginString.length; i++) {
			for(int j = counterJ; j < massCharacterOfTestString.length; j++) {
				if(massCharacterOfOriginString[i].equals(massCharacterOfTestString[j])) {
					counter++;
					counterJ++;
					if(counter == massCharacterOfTestString.length) {
						verify = true;
					}
					break;
					
				} else {
					counter = 0;
					counterJ = 0;
					break;
				}
			}
		}
		
		if(counter != massCharacterOfTestString.length) {
			verify = false;
		}
		return verify;
	}
}
