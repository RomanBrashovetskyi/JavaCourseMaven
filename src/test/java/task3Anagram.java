import org.junit.jupiter.api.Test;

class task3Anagram {

    @Test
    void shouldReturnAnagramOfString() {

        task3Anagram sol = new task3Anagram();

            String inputValue = "";
            sol.solution(inputValue);

            inputValue = null;
            sol.solution(inputValue);

            inputValue = " ";
            sol.solution(inputValue);

            inputValue = "    ";//4
            sol.solution(inputValue);

            inputValue = "a";
            sol.solution(inputValue);

            inputValue = "aaaaa";
            sol.solution(inputValue);

            inputValue = "!@#$%";
            sol.solution(inputValue);

            inputValue = "aaAAaAa";
            sol.solution(inputValue);

            inputValue = "abcd efgh";
            sol.solution(inputValue);

            inputValue = "a1bcd efg!h";
            sol.solution(inputValue);

            inputValue = "!@QwErTy #$UiOp%^ !AsdFgh^&*(";
            sol.solution(inputValue);

    }
}