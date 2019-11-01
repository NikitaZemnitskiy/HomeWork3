import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {



    @Test
    void lengthOfLongestSubstringTest1() {
        int expected = 3;
        int actual = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb");
        assertEquals(expected, actual);
    }

    @Test
    void lengthOfLongestSubstringTest2() {
        int expected = 1;
        int actual = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb");
        assertEquals(expected, actual);
    }

    @Test
    void lengthOfLongestSubstringTest3() {
        int expected = 3;
        int actual = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew");
        assertEquals(expected, actual);
    }

    @Test
    void lengthOfLongestSubstringTest4() {
        int expected = 9;
        int actual = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("dadaOndawdottdatpoluchaaaaaa");
        assertEquals(expected, actual);
    }

    @Test
    void lengthOfLongestSubstringTest5() {
        int expected = 6;
        int actual = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("Hello_World");
        assertEquals(expected, actual);
    }
    @Test
    void lengthOfLongestSubstringTestWithEmptyInput() {
        int expected = 0;
        int actual = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("");
        assertEquals(expected, actual);
    }

    @Test
    void lengthOfLongestSubstringTestWithSpaceString() {
        int expected = 1;
        int actual = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(" ");
        assertEquals(expected, actual);
    }

    @Test
    void lengthOfLongestSubstringTestWithOneSameLetter() {
        int expected = 1;
        int actual = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbbbb");
        assertEquals(expected, actual);
    }


}