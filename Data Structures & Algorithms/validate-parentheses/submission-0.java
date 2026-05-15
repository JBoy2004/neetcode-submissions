class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closeToOpen = Map.of(
            ')', '(',
            ']', '[',
            '}', '{'
            );

        for (char c : s.toCharArray()) {
            if (closeToOpen.containsKey(c)) { //if it is a closing bracket
                if (!stack.isEmpty() && stack.peek() == closeToOpen.get(c)) { //if a matching pair, remove from stack!
                    stack.pop();
                } else { //if not a matching pair, fail
                    return false;
                }
            } else { //if an opening bracket
                    stack.push(c);
                }
        }

        //true if all parentheses closed, false if not
        return stack.isEmpty();
    }
}
