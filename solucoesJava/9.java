class Solution {
    public boolean isPalindrome(int x) {

        String newX = String.valueOf(x);
        String invX = "";

        for (int i = newX.length() - 1; i >= 0; i--) {
            invX += newX.charAt(i);
        }

        if (newX.equals(invX)) {
            return true;
        }

        return false;
    }
}