public class Stack {
    int capacity;
    int top;
    int[] array;
    public Stack(int size){
        this.capacity=size;
        array=new int[capacity]; 
        top=-1;
    }
    public void push(int data){
        if(top==capacity-1){
            System.out.println("!!StackOverFlow!!");
            return;
        }
            array[++top]=data;
    }
    public int pop(){
        if(top==-1){
            System.out.println("!!StackUnderFlow!!");
            return -1;
        }
        return array[top--];
    }
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return array[top];
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == capacity - 1;
    }
}
