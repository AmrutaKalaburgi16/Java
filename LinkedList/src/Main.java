//import java.util.LinkedList;
//import java.util.Stack;

//import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        LinkedList<Integer> ll = new LinkedList<>();
        Linkedlist list = new Linkedlist();
        list.add(12);
        list.add(23);
        list.add(34);
//    list.add(45);
    list.addFirst(21);
    list.deleteFirst();
    list.delete(34);
        System.out.println("Linked List: " + list);
      list.display();
//
//
//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(
//                20);
//        stack.push(30);
//        stack.push(40);
//        stack.pop();
//        stack.peek();
        Stack st=new Stack();
        st.add(12);
        st.add(22);
//        st.pop();
        st.add(32);
        st.add(25);
        st.print();
        System.out.println("Top element: " + st.peek());
        System.out.println("Stack: " + st.pop());
//        System.out.println("Top element: " + stack.peek());
//        System.out.println("Stack: " + stack);

//        Queue<Integer> queue = new java.util.LinkedList<>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.remove();
//        System.out.println("Front element: " + queue.peek());
//        System.out.println("Queue: " + queue);
        Queue q=new Queue();
        q.enqueue(11);
        q.enqueue(22);
        q.enqueue(2);   q.enqueue(29);
        q.show();
        System.out.println(q.dequeue());
        System.out.println("Front element: " + q.peek());
        q.show();
    }

}