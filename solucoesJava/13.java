import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanos = new HashMap<>();

        romanos.put('I', 1);
        romanos.put('V', 5);
        romanos.put('X', 10);
        romanos.put('L', 50);
        romanos.put('C', 100);
        romanos.put('D', 500);
        romanos.put('M', 1000);

        int num = 0;

        for (int i = 0; i < s.length();) {
            if (i < s.length() - 1) {

                if (romanos.get(s.charAt(i)) < romanos.get(s.charAt(i + 1))) {
                    num += romanos.get(s.charAt(i + 1)) - romanos.get(s.charAt(i));
                    i += 2;
                } else {
                    num += romanos.get(s.charAt(i));
                    i++;
                }
                
            } else{
                num += romanos.get(s.charAt(i));
                i++;
            }

        }
        return num;
    }
}