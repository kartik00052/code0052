import java.util.*;
public class tenth {
private Stack<Integer> stack;
private Stack<Integer> Minstack;
public tenth(){
    stack=new Stack<>();
    Minstack=new Stack<>();
}
public void push(int x){
    stack.push(x);
    if(Minstack.isEmpty()||x<=Minstack.peek()){
        Minstack.push(x);
    }
}
public void pop(){
    int popedvalue=stack.pop();
    if(popedvalue==Minstack.peek()){
        Minstack.pop();
    }

}
public int top(){
    return stack.peek();
}
public int getMin(){
    return Minstack.peek();

}
public static void main(String[] args){
    tenth minstack=new tenth();
minstack.push(-2);
    minstack.push(0);
    minstack.push(-3);

        System.out.println("Minimum: " +minstack.getMin()); // -3

    minstack.pop();

        System.out.println("Top: " +minstack.top());         // 0
        System.out.println("Minimum: " +minstack.getMin());  // -2


        System.out.println("\n========== Test Case 2 ==========");

        tenth minstack2 = new tenth();

        minstack2.push(5);
        minstack2.push(2);
        minstack2.push(10);
        minstack2.push(1);

        System.out.println("Minimum: " + minstack2.getMin()); // 1

        minstack2.pop();

        System.out.println("Minimum after pop: " + minstack2.getMin()); // 2

        minstack2.pop();

        System.out.println("Top: " + minstack2.top()); // 2
        System.out.println("Minimum: " + minstack2.getMin()); // 2


        System.out.println("\n========== Test Case 3 (Duplicate Minimums) ==========");

        tenth minstack3 = new tenth();

        minstack3.push(3);
        minstack3.push(2);
        minstack3.push(2);
        minstack3.push(1);
        minstack3.push(1);

        System.out.println("Minimum: " + minstack3.getMin()); // 1

        minstack3.pop();
        System.out.println("Minimum: " + minstack3.getMin()); // 1

        minstack3.pop();
        System.out.println("Minimum: " + minstack3.getMin()); // 2

        minstack3.pop();
        System.out.println("Minimum: " + minstack3.getMin()); // 2
}
}