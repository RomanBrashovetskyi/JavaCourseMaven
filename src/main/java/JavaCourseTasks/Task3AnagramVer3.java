package JavaCourseTasks;

public class Task3AnagramVer3 {

    public String reverseAlphabeticCharsOnly(String inputText) {
        requiredNonNull(inputText);

        StringBuilder resultStrings = new StringBuilder();
        String[] splitWords = inputText.split("[\\s+]");
        for (String words : splitWords) {
            resultStrings.append(reversesWord(words));
        }

        for (int i = 0; i < inputText.length(); i++) {
            if (Character.isWhitespace(inputText.charAt(i))) {
                resultStrings.insert(i, inputText.charAt(i));
            }
        }
        return resultStrings.toString();
    }

    public String reversesWord(String word) {
        requiredNonNull(word);

        String alphabetic = word.replaceAll("[\\W\\d+]", "");
        StringBuilder result = new StringBuilder(alphabetic);
        result.reverse();

        for (int i = 0; i < word.length(); i++) {
            if (!Character.isLetter(word.charAt(i))) {

                result.insert(i, word.charAt(i));
            }
        }
        return result.toString();
    }

    private void requiredNonNull(String initialWord) {
        if (initialWord == null) {
            throw new IllegalArgumentException("Non null input string required!");
        }
    }
}