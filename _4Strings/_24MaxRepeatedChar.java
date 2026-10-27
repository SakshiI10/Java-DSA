import java.util.HashMap;

public class _24MaxRepeatedChar {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(firstRepChar(s));
    }

    static String firstRepChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        int maxOcc = 1;
        char maxOccChar = '\0';

        for (char ch : map.keySet()) {
            if (map.get(ch) > maxOcc) {
                maxOcc = map.get(ch);
                maxOccChar = ch;
            }
        }

        if (maxOccChar == -1) {
            return "-1";
        }

        return String.valueOf(maxOccChar);
    }
}
