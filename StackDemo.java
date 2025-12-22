public class StackDemo {
    public static void main(String args[]){
        Stack st=new Stack(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("Popped: " + st.pop());
        System.out.println("Popped:"+st.pop());
        System.out.println("Top element: " + st.peek());
        System.out.println("Is stack empty: " +(st.isEmpty() ? "Yes" : "No"));
        System.out.println("Is stack full: " +(st.isFull() ? "Yes" : "No"));
    }
}
