import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "Коллективизация";
       System.out.println(lengthOfLongestSubstring(s));
    }


    public static int lengthOfLongestSubstring(String s) {
        for (int i = 1; i<s.length();i++){
            String currentString = s.substring(0,i);
            if (currentString.indexOf(s.charAt(i)) != -1){
                String prefix = s.substring(0,s.indexOf(s.charAt(i))+1);
                String sufix = s.substring(s.indexOf(s.charAt(i))+1);
                int sufixLength = lengthOfLongestSubstring(sufix);
                int MaxLength = sufixLength>prefix.length()?sufixLength:prefix.length();
                return MaxLength>currentString.length()?MaxLength:currentString.length();
            }
        }
        return s.length();
    }
}
