import JavaCourseTasks.Task3AnagramVer1;
import org.junit.Test;

class task3Anagram {

    @Test
    void shouldReturnAnagramOfString() {

        Task3AnagramVer1 sol = new Task3AnagramVer1();

            String inputValue = "";
            sol.reverseAlphabeticCharsOnly(inputValue);

            inputValue = null;
            sol.reverseAlphabeticCharsOnly(inputValue);

            inputValue = " ";
            sol.reverseAlphabeticCharsOnly(inputValue);

            inputValue = "    ";//4
            sol.reverseAlphabeticCharsOnly(inputValue);

            inputValue = "a";
            sol.reverseAlphabeticCharsOnly(inputValue);

            inputValue = "aaaaa";
            sol.reverseAlphabeticCharsOnly(inputValue);

            inputValue = "!@#$%";
            sol.reverseAlphabeticCharsOnly(inputValue);

            inputValue = "aaAAaAa";
            sol.reverseAlphabeticCharsOnly(inputValue);

            inputValue = "abcd efgh";
            sol.reverseAlphabeticCharsOnly(inputValue);

            inputValue = "a1bcd efg!h";
            sol.reverseAlphabeticCharsOnly(inputValue);

            inputValue = "!@QwErTy #$UiOp%^ !AsdFgh^&*(";
            sol.reverseAlphabeticCharsOnly(inputValue);

    }
}