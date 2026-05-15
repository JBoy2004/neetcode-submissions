class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {

            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }

            while (r > l && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }

            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }

            l++;
            r--;
        }
        return true;
    }
}



/*
        String newStr = "";

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                newStr += Character.toLowerCase(c);
            }
        }

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
*/

/*
private boolean isAlphaNum(char c) {
        return ('A' <= c && c <= 'Z' ||
                'a' <= c && c <= 'z' ||
                '0' <= c && c <= '9');
    }
*/