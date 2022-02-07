package JavaCourseTasks;

import java.util.HashMap;
import java.util.Map;

public class task3Anagram {

    public static String result = "";

    public void solution(String inputText) {

        inputText = "12cba hgf!@";

        if (inputText == null) {
            throw new IllegalArgumentException("Non null input string required!");
        }
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
            result = result + reverseWord(word) + " ";
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

    private String reverseWord2(String word) {

        StringBuilder reversedWord = new StringBuilder();

        //"d1cba hgf!e"
        //"12cba 12hgf!@ hgf!@"
        int wordLenth = word.length();
        int j = 0;
        for(int i = wordLenth - 1; i != 0;){
            char currentSymbolFromRightSide = word.charAt(i);
            char currentSymbolFromLeftSide = word.charAt(j);
            boolean rightSymbolIsLetter = Character.isLetter(currentSymbolFromRightSide);
            boolean leftSymbolIsLetter = Character.isLetter(currentSymbolFromLeftSide);
            if (rightSymbolIsLetter & leftSymbolIsLetter) {
                reversedWord.setCharAt(j, currentSymbolFromLeftSide);
                reversedWord.setCharAt(i, currentSymbolFromRightSide);
                j++; i++;
            }
            else if (!rightSymbolIsLetter & leftSymbolIsLetter) {
                i++;
            }
            else if (rightSymbolIsLetter & !leftSymbolIsLetter) {
                j++;
            }
        }
        return reversedWord.toString();
    }
}