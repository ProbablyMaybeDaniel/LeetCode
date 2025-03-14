import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character carr : s.toCharArray()) {
            if (carr.equals('(')||carr.equals('{')||carr.equals('[')){
                stack.push(carr);
            }
            else if (carr.equals(')')){
                if(stack.isEmpty() || !stack.pop().equals('(')){
                    return false;
                }
            }
            else if (carr.equals('}')){
                if(stack.isEmpty() || !stack.pop().equals('{')){
                    return false;
                }
            }
            else if (carr.equals(']')){
                if(stack.isEmpty() || !stack.pop().equals('[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}