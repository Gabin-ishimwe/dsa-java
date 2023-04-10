package folder;

import java.util.Stack;

public class Stacks {
    public void tryouts() {
        Stack<String> names = new Stack<String>();
        names.push("gabin");
        names.push("ishimwe");
        names.push("bebe");
        names.push("michou");
        System.out.println(names);
        names.pop();
        System.out.println(names.peek());
    }
}
