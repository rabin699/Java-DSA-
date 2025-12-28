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
class StackNode{
    int data;
    StackNode next;
    public StackNode(int data){
        this.data=data;
        next=null;
    }
}
class StackLL{
    StackNode top;
    int capacity;
    int count=0;
    public StackLL(int capa){
        capacity=capa;
    }
    public void push(int data){
        if(count>=capacity){
            System.out.println("StackOverFlow");
            return;
        }
        StackNode newNode=new StackNode(data);
        newNode.next=top;
        top=newNode;
        count++;
        System.out.println("Pushed : "+data);
    }
    public int pop(){
        if(top==null){
            System.out.print("Stack UnderFlow ");
            return -1;
        }
        StackNode temp=top;
        top=top.next;
        int value=temp.data;
        count--;
        return value;
    }
    public int peek(){
        if(top==null){
            System.out.println("Stack UnderFlow");
            return -1;
        }
        return top.data;
    }
    public boolean isEmpty(){
        return top==null;
    }
    public boolean isFull(){
        return count==capacity;
    }
}
class StackLinkedListImp{
    int capacity;
    int tos=-1;
    LinkedList newStack=new LinkedList();
    public StackLinkedListImp(int capacity) {
        this.capacity=capacity;
    }
    public void push(int data){
        if(tos==capacity-1){
            System.out.println("!!StackOverFlow!!");
            return;
        }
        tos++;
        newStack.insertAtFirst(data);
    }
    public int pop(){
        if(tos==-1){
            System.out.println("!!StackUnderFLow!!");
            return -1;
        }
        int value=newStack.head.data;
        newStack.head=newStack.head.next;
        tos--;
        return value;
    }
     public int peek(){
        if(tos==-1){
            System.out.println("!!StackUnderFLow!!");
            return -1;
        }
        int value=newStack.head.data;
        return value;
    }
    public static void main(String[] args) {
        StackLinkedListImp s=new StackLinkedListImp(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        System.out.println(s.pop());
        s.push(100);
        System.out.println(s.peek());
        s.push(70);
    }
}
