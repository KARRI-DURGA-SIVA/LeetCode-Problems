import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String str = scanner.nextLine();
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversedStr = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }
        System.out.println(reversedStr.toString());
        scanner.close();
    }
}
