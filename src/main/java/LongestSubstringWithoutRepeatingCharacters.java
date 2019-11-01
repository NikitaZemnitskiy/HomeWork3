/**
 * @author Zemnytskyi Mykyta
 */
public class LongestSubstringWithoutRepeatingCharacters {


    /**
     * Finds length of the first longest substring of unique characters of parameter s
     * @param s input string
     * @return length of the first longest substring of unique characters of parameter s
     */
    public static int lengthOfLongestSubstring(String s) {
        final int length = s.length();
        for (int i = 1; i < length; i++) {
            String prefix = s.substring(0, i);
            char currentChar = s.charAt(i);
            int sameCharPosition = prefix.indexOf(currentChar);
            if (sameCharPosition != -1) {
                String suffix = s.substring(sameCharPosition + 1);
                int suffixLength = lengthOfLongestSubstring(suffix);
                int maxLength = suffixLength >= i ? suffixLength : i;
                return maxLength;
            }
        }
        return length;
    }
}
