import java.util.ArrayList;
import java.util.List;

public class Subsequence {

    public static boolean isSubsequence(String s, String t) {
        //is s a subsequence of t?
        if(s.length() > t.length()) {
            return false;
        }
        List<Character> characterList = new ArrayList<Character>();
        for(int i = 0; i < t.length(); i++) {
            characterList.add(t.charAt(i));
        }
        char current;
        int index = -1;
        int i = 0;
        while(i < t.length()) {
            current = s.charAt(i);
            if(characterList.contains(current)) {
                if(characterList.indexOf(current) > index) {
                    index = characterList.indexOf(current);
                } else {
                    return false;
                }
            } else {
                return false;
            }
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isSubsequence("ab", "baab"));

    }

}
