package Java.Stacks;


import java.util.*;

public class duplicateBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =  sc.nextLine();

        if(dupliBrackets(str) == true)
            System.out.print("Duplicate found");
        else
            System.out.print("Duplicate Not found.");
    }
    static boolean dupliBrackets(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ')') {
                stack.push(str.charAt(i));
            } else {
                if (stack.peek() == '(') {
                    return true;
                } else {
                    while (stack.peek() != '(') {
                        stack.pop();
                    }
                    stack.pop();
                }
            }

        }
        return false;
    }
}
