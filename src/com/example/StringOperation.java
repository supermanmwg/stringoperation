package com.example;

public class StringOperation {

	public static String replace(String word, char gone, char here){
		
		char[] stringArray = word.toCharArray();
		for(int i = 0; i < stringArray.length; i++) {
			if(stringArray[i] == gone) {
				stringArray[i] = here;
			}
		}
		
		return word;
		//return new String(stringArray);
	}
}
