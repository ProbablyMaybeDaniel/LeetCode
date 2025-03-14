import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanNumerals = new HashMap<Character, Integer>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        int total = 0;
        char prev = 'M';
        char sChar = 'M';
        for(int i = 0; i < s.length(); i++){
            sChar = s.charAt(i);
            total += romanNumerals.get(sChar);
            if (prev == 'I'){
                if(sChar == 'V' || sChar == 'X'){
                    total -= 2;
                }
            }
            else if (prev == 'X'){
                if(sChar == 'L' || sChar == 'C'){
                    total -= 20;
                }
            }
            else if (prev == 'C'){
                if(sChar == 'D' || sChar == 'M'){
                    total -= 200;
                }
            }
            prev = sChar;
        }
        return total;
    }
}