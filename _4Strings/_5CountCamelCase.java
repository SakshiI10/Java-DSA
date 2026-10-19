package String;

public class _5CountCamelCase {
    public static void main(String[] args) {
        String s = "ckjkUUYII";
        countCamelChar(s);
    }

    public static void countCamelChar(String s) {
        int camelCase_count=0;

        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);

            if(ch >= 'A' && ch<='Z'){
                camelCase_count++;
            }
        }
        System.out.println(camelCase_count);
    }
}
