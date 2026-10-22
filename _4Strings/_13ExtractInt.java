// Given a string s, extract all the integers from s.

// Input:
// s = "1: Prakhar Agrawal, 2: Manish Kumar Rai, 
//      3: Rishabh Gupta56"
// Output: 1 2 3 56

import java.util.ArrayList;

public class _13ExtractInt {
    public static void main(String[] args) {
        String s = "1: Prakhar Agrawal, 2: Manish Kumar Rai, 3: Rishabh Gupta56";
        System.out.println(extractIntegerWords(s));
    }

    public static ArrayList<String> extractIntegerWords(String s) {
        ArrayList<String> result=new ArrayList<>();
        String currentInt="";

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                currentInt = currentInt + ch;
            } else if (!currentInt.isEmpty()){
                result.add(currentInt);
                currentInt="";
            }
        }
        if(!currentInt.isEmpty()){
            result.add(currentInt);
        }
        return result;
    }
}
