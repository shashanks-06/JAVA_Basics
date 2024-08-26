package august.ex_24082024.linkedList;

import java.util.Stack;

public class Lab136 {
    public static void main(String[] args) {
        // Vector, Stack are ->  Legacy Classes-> 95% of time we are not going to use it in automation
        // legacy? -> old

        Stack s = new Stack();
        s.push("Shashank");
        s.push("January");
        s.push(2001);
        s.add(true);

        System.out.println(s);          // [Shashank, January, 2001, true]
        System.out.println(s.peek());   // true
        s.pop();                        // true
        System.out.println(s);          // [Shashank, January, 2001]

    }
}
