package Java.Stacks;

import java.util.*;

public class maximumELement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> s = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a == 1) {
                int e = sc.nextInt();
                s.push(e);
                if (s2.isEmpty()) {
                    s2.push(s.peek());
                } else {
                    if (s.peek() > s2.peek()) {
                        s2.push(s.peek());
                    }
                }
            } else if (a == 2) {
                if (!s.isEmpty()) {
                    if (s.peek() == (s2.peek())) {
                        s2.pop();
                    }
                    s.pop();
                }

            } else if (a == 3) {
                System.out.println(s2.peek());
            }
        }
        //System.our
    }
}
