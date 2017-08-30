import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {
    public static String convertToOldRoman(int num) {
        String result = "";
        Map<Integer, String> table = new LinkedHashMap();
        table.put(1000,"M");
        table.put(500,"D");
        table.put(100,"C");
        table.put(50,"L");
        table.put(10,"X");
        table.put(5,"V");
        table.put(1,"I");

        for (Map.Entry<Integer, String> kvPair : table.entrySet()) {
            int wholeParts = num / kvPair.getKey();
            int remainder = num % kvPair.getKey();
            for (; wholeParts>0; wholeParts--) {
                result += kvPair.getValue();
            }
            num = remainder;
        }

        return result;
    }

    public static String convertToNewRoman(int num) {
        String result = "";
        Map<Integer, String> table = new LinkedHashMap();
        table.put(1000,"M");
        table.put(900,"CM");
        table.put(500,"D");
        table.put(400,"CD");
        table.put(100,"C");
        table.put(90,"XC");
        table.put(50,"L");
        table.put(40,"XL");
        table.put(10,"X");
        table.put(9,"IX");
        table.put(5,"V");
        table.put(4,"IV");
        table.put(1,"I");

        for (Map.Entry<Integer, String> kvPair : table.entrySet()) {
            int wholeParts = num / kvPair.getKey();
            int remainder = num % kvPair.getKey();
            for (; wholeParts>0; wholeParts--) {
                result += kvPair.getValue();
            }
            num = remainder;
        }

        return result;
    }
}
