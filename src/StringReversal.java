public class StringReversal {

    // Recursive function to reverse a string
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        // Recursive call: reverse the substring starting from the second character
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String original = "An example of recursion!";
        String reversed = reverseString(original);
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}

