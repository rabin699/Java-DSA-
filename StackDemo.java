public class StackDemo {
    public static void main(String args[]){
        // Stack st=new Stack(5);
        // st.push(1);
        // st.push(2);
        // st.push(3);
        // st.push(4);
        // System.out.println("Popped: " + st.pop());
        // System.out.println("Popped:"+st.pop());
        // System.out.println("Top element: " + st.peek());
        // System.out.println("Is stack empty: " +(st.isEmpty() ? "Yes" : "No"));
        // System.out.println("Is stack full: " +(st.isFull() ? "Yes" : "No"));
        StackLL newStackLL=new StackLL(5);
        System.out.println(newStackLL.isEmpty());
        newStackLL.push(10);
        newStackLL.push(20);
        newStackLL.push(30);
        newStackLL.push(40);
        newStackLL.push(50);
        newStackLL.push(60);
        System.out.println("Full:"+newStackLL.isFull());
        System.out.println("Empty: "+newStackLL.isEmpty());
        // System.out.println(newStackLL.peek());
        System.out.println(newStackLL.pop());
        System.out.println(newStackLL.pop());
        System.out.println(newStackLL.pop());
        System.out.println(newStackLL.pop());
        System.out.println(newStackLL.pop());
        System.out.println(newStackLL.pop());
    }
}
