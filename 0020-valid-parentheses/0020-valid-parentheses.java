import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> hash = new HashMap<>();
        Map<Character, Character> hashReverse = new HashMap<>();

        hash.put('(', ')');
        hash.put('[', ']');
        hash.put('{', '}');

        hashReverse.put(')', '(');
        hashReverse.put(']', '[');
        hashReverse.put('}', '{');

        for (char c: s.toCharArray()) {
            if (hash.containsKey(c)) {
                stack.push(c);
            }

            if (hashReverse.containsKey(c)) {
                if (stack.isEmpty()) {
                    return false;
                }

                if (stack.pop() != hashReverse.get(c)) {
                    return false;
                }
            }            
        }

        return stack.isEmpty();
    }
}