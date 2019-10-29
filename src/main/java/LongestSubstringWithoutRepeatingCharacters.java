import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aa"));
    }



    public static int lengthOfLongestSubstring(String s) {
        String first = s.substring(0,1);
        String[] res = s.split(first);
        System.out.println(res);
        return 1;
    }
    public static boolean isRepeatMass(char[]arr, int first,int last){
        for (int i = first; i<last; i++){
            for (int k = i+1; k<last; k++){
                if(arr[i] == arr[k]){
                    return true;
                }
            }
        }
       return false;
    }

    public static boolean isRepeat (char[]arr, int first,int last){
        Set<Character>set = new HashSet<Character>();
        for (int i = first; i<last; i++){
            if (set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);
        }

        return true;
        }
}
