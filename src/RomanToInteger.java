import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    static Map<Character, Integer> romanToNumber;
    private final int i = 1;
    private final int v = 5;
    private final int x = 10;
    private final int l = 50;
    private final int c = 100;
    private final int d = 500;
    private final int m = 1000;

    public static void main(String[] args) {
        RomanToInteger obj = new RomanToInteger();
        System.out.println(obj.romanToInt("III"));
        System.out.println(obj.romanToInt("LVIII"));
        System.out.println(obj.romanToInt("MCMXCIV"));
        System.out.println(obj.romanToInt("MCDLXXVI"));
    }

    public int romanToInt(String s) {
        romanToNumber = new HashMap<>();
        fillMap(romanToNumber);
        int sum = 0;
        int current = 0;
        int prev = 0;
        for(int i = 0; i < s.length(); i++) {
            if(current != 0) {
                prev = current;
            }
            current = romanToNumber.get(s.charAt(i));
            sum += current;
            if(prev != 0 && prev < current) {
                sum -= current;
                sum-= prev;
                sum += current-prev;
            }
        }
        return sum;
    }

    private void fillMap(Map<Character, Integer> map) {
        map.put('I', i);
        map.put('V', v);
        map.put('X', x);
        map.put('L', l);
        map.put('C', c);
        map.put('D', d);
        map.put('M', m);
    }
}
