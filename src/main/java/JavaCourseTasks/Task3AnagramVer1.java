package JavaCourseTasks;

import java.util.HashMap;
import java.util.Map;

public class Task3AnagramVer1 {

    public static String result = "";

    public void reverseAlphabeticCharsOnly(String inputText) {
        requiredNonNull(inputText);

        stringToWords(inputText);
    }

    private void stringToWords(String text) {

        int textLength = text.length();
        int positionOfSpace = text.indexOf(" ");
        String word;

        if (positionOfSpace == -1) {
            result = result + reverseWord(text);
        } else {
            word = text.substring(0, positionOfSpace);
            result = result + reverseWord(word);
            stringToWords(text.substring(positionOfSpace + 1, textLength));
        }
    }

    private String reverseWord(String word) {

        StringBuilder reversedWord = new StringBuilder();
        Map<Integer, Character> nonLetterSymbols = new HashMap<>();

        int wordLength = word.length();

        for (int j = 0; j < wordLength; j++) {
            char currentSymbolFromLeftSide = word.charAt(j);
            if (!Character.isLetter(currentSymbolFromLeftSide)) {
                nonLetterSymbols.put(j, currentSymbolFromLeftSide);
            }
        }

        int j = 0;
        for (int i = wordLength - 1; i != -1; i--) {
            while (nonLetterSymbols.get(j) != null) {
                reversedWord.append(nonLetterSymbols.get(j));
                j++;
            }

            char currentSymbolFromRightSide = word.charAt(i);
            if (Character.isLetter(currentSymbolFromRightSide)) {
                reversedWord.append(currentSymbolFromRightSide);
                j++;
            }
        }

        while (nonLetterSymbols.get(j) != null) {
            reversedWord.append(nonLetterSymbols.get(j));
            j++;
        }

        return reversedWord.toString();
    }

    private void requiredNonNull(String inputText) {
        if (inputText == null) {
            throw new IllegalArgumentException("Non null input string required!");
        }
    }
}