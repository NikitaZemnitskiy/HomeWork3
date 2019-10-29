import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class ZigZagConversion {

    public static String convert(String s, int numRows) {
        if(numRows == 0 || s == null){
            return "";
        }
        char[] arr = s.toCharArray();
        int wordNumber = 0;

        StringBuilder finalStringBuilder = new StringBuilder();
        ArrayList <StringBuilder> list = new ArrayList<StringBuilder>();

        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }
        try {
            while (true) {
                for (int i = 0; i < numRows; i++) {
                    list.get(i).append(arr[wordNumber]);
                    wordNumber++;
                }

                for (int i = numRows - 2; i > 0; i--) {
                    list.get(i).append(arr[wordNumber]);
                    wordNumber++;
                }
            }
        }
        catch (Exception e){

        }
        for(StringBuilder strB:list){
            finalStringBuilder.append(strB);
        }

        return finalStringBuilder.toString();
    }
}
