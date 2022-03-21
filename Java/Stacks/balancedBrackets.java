package Java.Stacks;

import java.nio.charset.spi.CharsetProvider;
import java.util.*;

import static java.lang.System.*;

public class balancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String str = sc.nextLine();
        System.out.print(balace(str));
    }
    static boolean balace(String str) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch != ')' && ch != ']' && ch != '}') {
                stack.push(ch);
            } else {
                if (stack.peek() == '(' && stack.peek() == '[' && stack.peek() == '{') {
                    if(stack.isEmpty()){
                        return false;
                    }
                    return true;
                } else {
                    while (stack.peek() != '(' && stack.peek() != '{' && stack.peek() != '[') {
                        if(stack.isEmpty()){
                            return false;
                        }
                        stack.pop();
                    }
                    stack.pop();
                }
            }
        }
        return false;
    }
}
