import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

// not completed
public class ProgrammingTestCodility {
    public static void main(String[] args) {
        //int[] a = {1, 1000, 80, -91};
        //int[] a = {47, 1900, 1, 90, 45};
        //int [] a = {-13, 1900, 1, 100, 45};
        //System.out.println(solution(a));
        String s1 = "BILLOBILLOLLOBBI";
        String[] L1 = {"BILL", "BOB"};
        String s2 = "CAT";
        String[] L2 = {"ILOVEMYDOG", "CATS"};
        String s3 = "ABCDXYZ";
        String[] L3 = {"ABCD", "XYZ"};

        String ABBA = "ABBAABBAAB";
        String[] L4 = {"ABBA"};
        System.out.println(solution(ABBA, L4));

    }

    public static int solution(int[] A) {
        int sum = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] >= 10 && A[i] <= 99 || A[i] <= -10 && A[i] >= -99) {
                sum += A[i];
            }
        }
        return sum;
    }

    public static int solution(String S, String[] L) {
        HashMap<Character, Integer> map = new HashMap<>();
        char current;
        for(int i = 0; i < S.length(); i++) {
            current = S.charAt(i);
            if(!map.containsKey(current)) {
                map.put(current, 1);
            } else {
                map.put(current, map.get(current) + 1);
            }
        }
        char letter;
        for(int i = 0; i < L.length; i++) {
            letter = L[i].charAt(i);
            int occ = numOfOccurrence(L[i], L[i].charAt(i));
            if(occ > 1) {
                map.put(letter, map.get(letter)/occ);
            }
            if(!map.containsKey(letter)) {
                return 0;
            }
        }
        return Collections.min(map.values());
    }

    public static int numOfOccurrence(String word, char letter) {
        long occurrence = word.chars().filter(ch -> ch == letter).count();
        return (int) occurrence;
    }

    public static String solution(String S) {
        List<String> data = new LinkedList<>();
        String row = null;
        int j = 0;

        for(int i = 0; i <= S.length(); i++) {
            if(S.charAt(i) == '\n'|| i == S.lastIndexOf(S.charAt(S.length()-1))) {
                row = S.substring(j, i);
                j = i;
                data.add(row);
            }
        }
        for(String current : data) {
            if(current.contains("NULL")) {
                removeDefectiveRow(data, current);
            }
        }

        String result = data.stream()
                .map(r -> String.valueOf(r))
                .collect(Collectors.joining());

        return result;
    }

    public static void removeDefectiveRow(List<String> data, String defective) {
        data.remove(defective);
    }
}