package JavaProject2;

public class Task2 {
    /*Check if a String is Palindrome: Determine whether a given string is
a palindrome, which means it reads the same forwards and
backward. For example, "madam" is a palindrome
     */
    boolean isPalindrome(String str) {

        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr = reverseStr + str.charAt(i);
        }
        boolean isStrPalindrome=false;
        if(str.equalsIgnoreCase(reverseStr)){
            isStrPalindrome=true;
        }
        return isStrPalindrome;
    }

    public static void main(String[] args) {
        Task2 task2=new Task2();
        boolean result =task2.isPalindrome("madam");
        System.out.println(result);
    }
}
