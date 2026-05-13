class Solution {
    public boolean isPalindrome(String s) {

        // remove non-alphanumeric
        // lowercase all
        String newStr = "";

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                newStr += Character.toLowerCase(c);
            }
        }

        //check if = reversed string
        return newStr.equals(new StringBuilder(newStr).reverse().toString());

    }
}
